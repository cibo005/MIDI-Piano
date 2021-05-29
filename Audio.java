
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.TargetDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

class Audio extends Music
  {
  protected File newFileOpen=null;
  protected File oldFileOpen=null;
  
  protected static AudioFileFormat.Type t[];
  protected static int nrOfAudioTypes;
  protected static String extensionAudio[];
  
  protected AudioSystem as;
  protected AudioFormat af;
  protected AudioInputStream ais;
  protected SourceDataLine sdLine;
  protected DataLine.Info dlInfo;
  protected Clip clip;
  
  protected TargetDataLine trLine;
  protected ByteArrayOutputStream baos;
  protected ByteArrayInputStream bais;
  
  protected boolean stop=false;
  
  public Audio(ControlPanel cp)
    {
    super(cp);
    oldFileOpen=new File("");
    
    nrOfAudioTypes=AudioSystem.getAudioFileTypes().length;
    extensionAudio=new String[nrOfAudioTypes];
    t=new AudioFileFormat.Type[nrOfAudioTypes];
    for(int i=0;i<nrOfAudioTypes;i++)
      {
      t[i]=AudioSystem.getAudioFileTypes()[i];
      extensionAudio[i]=t[i].getExtension();
      }
    }
  
  public static AudioFileFilter getAudioFilter()
    {
    return new AudioFileFilter(extensionAudio); 
    }
    
  public static AudioFileFormat.Type getTypeAudio(File f)
    {
    for(int i=0;i<t.length;i++)
      if(t[i].getExtension().equals(getExtension(f).toLowerCase()))
        return t[i];
    return null;
    }
  
  public void play()
    {
    newFileOpen=cp.fileOpen;
    
    if(newFileOpen.length()>500*1024)
      {
      //play long audio files with SourceDataLine
      new Thread()
        {
        public void run()
          {
          try
            {
            if(!newFileOpen.getName().equals(oldFileOpen.getName()))
                {    
                ais=as.getAudioInputStream(newFileOpen);
                af=ais.getFormat();
          
                dlInfo=new DataLine.Info(SourceDataLine.class, af, as.NOT_SPECIFIED);
                sdLine=(SourceDataLine)as.getLine(dlInfo);
          
                sdLine.open(af, as.NOT_SPECIFIED);

                sdLine.start();
                
                }
                
            cp.bp.jcb.removeItem(cp.bp.jcb.getItemAt((cp.bp.jcb.getItemCount()-1)));
            float microSecunde=Float.parseFloat
                          (new Float(newFileOpen.length()/64000.0f).toString());
            cp.bp.jcb.addItem(new Float(microSecunde));
            cp.bp.jcb.setSelectedItem(cp.bp.jcb.getItemAt((cp.bp.jcb.getItemCount()-1)));
                
            int nBytesRead=0; 
            
            byte nrBytes[]=new byte[128000];
                            
            while(nBytesRead!=-1)
              {
                nBytesRead=ais.read(nrBytes,0,nrBytes.length);
              
                if(nBytesRead!=-1)
                  sdLine.write(nrBytes,0,nBytesRead);
              }
                
            sdLine.stop();
            sdLine.close();
            }
          catch(LineUnavailableException lue)
            {
            }
          catch(UnsupportedAudioFileException uafe)
            {
            }
          catch(IOException ioe)
            {
            }
          }
        }.start();
      }
      else
        {
        //play short audio files with Clip
          try
            {
            if(!newFileOpen.getName().equals(oldFileOpen.getName()))
                {    
                ais=as.getAudioInputStream(newFileOpen);
                af=ais.getFormat();
                dlInfo=new DataLine.Info(Clip.class, af);
                clip=(Clip)as.getLine(dlInfo);
                clip.open(ais);
                
                oldFileOpen=newFileOpen;
                
                }
            cp.bp.jcb.removeItem(cp.bp.jcb.getItemAt((cp.bp.jcb.getItemCount()-1)));
            float microSecunde=Float.parseFloat
                          (new Float(clip.getMicrosecondLength()/1000000.0f).toString());
            cp.bp.jcb.addItem(new Float(microSecunde));
            cp.bp.jcb.setSelectedItem(cp.bp.jcb.getItemAt((cp.bp.jcb.getItemCount()-1)));
                
            clip.start();
            }
          catch(LineUnavailableException lue)
            {
            }
          catch(UnsupportedAudioFileException uafe)
            {
            }
          catch(IOException ioe)
            {
            }
        }
    }
  public void pause()
    {
    if(newFileOpen!=null)
      //if(sdLine!=null)sdLine.stop();
      if(clip!=null)clip.stop();
    }
  public void stop()
    {
    if(cp.fileNew!=null)
      stop=true;
    
    if(newFileOpen!=null)  
      {
      if(newFileOpen.length()>500*1024)
          {
          if(sdLine!=null)sdLine.close();
          }
      else
          {
          if(clip!=null)
            {
            clip.stop();
            clip.setMicrosecondPosition(0);
            }
          }
      }
    }
  public void record()
    {
    new Thread()
      {
      public void run()
        {
          try
            {
            af=new AudioFormat(16000.0F,16,1,true,false);
          
            //set TargetDataLine on implicit Mixer
            dlInfo=new DataLine.Info(TargetDataLine.class, af, as.NOT_SPECIFIED);
            trLine=(TargetDataLine)as.getLine(dlInfo);
          
            trLine.open(af, as.NOT_SPECIFIED);
            
            baos=new ByteArrayOutputStream();
            
            byte nrBytes[]=new byte[64000];
          
            af=trLine.getFormat();
          
            int nFrameSize=af.getFrameSize();
            int nBufferFrames=nrBytes.length/nFrameSize;
            int nBytesRead;
            int seconds=0; 
            
            trLine.start();
           
            while(!stop&&seconds<Integer.parseInt(cp.bp.jcb.getSelectedItem().toString()))
              {
              nBytesRead=trLine.read(nrBytes,0,nBufferFrames);
              baos.write(nrBytes,0,nBytesRead);
              seconds++;
              }
            }
        catch(LineUnavailableException lue)
            {
            }     
        }
      }.start();
    }
  public void save()
    {
        try
          {
          byte nrBytesWrite[]=baos.toByteArray();
          
          bais=new ByteArrayInputStream(nrBytesWrite);
          
          ais=new AudioInputStream(bais, af, nrBytesWrite.length/af.getFrameSize());
          
          as.write(ais, getTypeAudio(cp.fileNew), cp.fileNew);
          }
        catch(IOException ioe)
          {
          }
    }
  
  }