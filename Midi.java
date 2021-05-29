
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.ArrayIndexOutOfBoundsException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Track;

class Midi extends Music 
  {
  protected File newFileOpen;
  protected File oldFileOpen;
  
  protected File newFileNew;
  protected File oldFileNew;
  
  protected static int type[];
  protected static int nrOfMidiTypes;
  protected static String extensionMidi[];
  
  protected Track track=null;
  
  protected static long startTick=0;
  protected static long tickLength=64;
  
  public Sequencer seqr;
  public Sequence seq;
  public MidiPlayThread mpt;
  public MidiRecordThread mrt;
  
  public Midi(ControlPanel cp)
    {
    super(cp);
    
    mpt=new MidiPlayThread(this);
    mrt=new MidiRecordThread(this);
    
    oldFileOpen=new File("");
    oldFileNew=new File("");
    
    nrOfMidiTypes=MidiSystem.getMidiFileTypes().length;
    extensionMidi=new String[nrOfMidiTypes];
    type=new int [nrOfMidiTypes];
    for(int i=0;i<nrOfMidiTypes;i++)
      {
      type[i]=MidiSystem.getMidiFileTypes()[i];
      extensionMidi[i]=i==0?"mid":"midi";
      }
    }
  public static MidiFileFilter getMidiFilter()
    {
    return new MidiFileFilter(extensionMidi);
    }
  
  public static int getTypeMidi(File f)
    {
    try
      {
      for(int i=0;i<type.length;i++)
        if(type[i]==MidiSystem.getMidiFileFormat(f).getType())
          return type[i];
      }
    catch(InvalidMidiDataException imde)
      {
      }
    catch(IOException ioe)
      {
      }
    return -1;
    }
  
  public void play()
    {
    try
      {
      if(cp.fileNew!=null)
        if(track!=null)
          {
          seqr=MidiSystem.getSequencer();
          seqr.open();
          seqr.setSequence(seq);
          
          cp.bp.jcb.removeItem(cp.bp.jcb.getItemAt((cp.bp.jcb.getItemCount()-1)));
          float microSecunde=Float.parseFloat
                   (new Float(seq.getMicrosecondLength()/1000000.0f).toString());
          cp.bp.jcb.addItem(new Float(microSecunde));
          cp.bp.jcb.setSelectedItem(cp.bp.jcb.getItemAt((cp.bp.jcb.getItemCount()-1)));        
          }
      if(cp.fileOpen!=null)
        {
        newFileOpen=cp.fileOpen;
    
        if(!newFileOpen.getName().equals(oldFileOpen.getName()))
          {    
          seqr=MidiSystem.getSequencer();
          seqr.open();
          seq=MidiSystem.getSequence(newFileOpen);
          seqr.setSequence(seq);
                
          oldFileOpen=newFileOpen;
             
          cp.bp.jcb.removeItem(cp.bp.jcb.getItemAt((cp.bp.jcb.getItemCount()-1)));
          float microSecunde=Float.parseFloat
                   (new Float(seq.getMicrosecondLength()/1000000.0f).toString());
          cp.bp.jcb.addItem(new Float(microSecunde));
          cp.bp.jcb.setSelectedItem(cp.bp.jcb.getItemAt((cp.bp.jcb.getItemCount()-1)));        
          
          /*try
            {
            //se scrie in fisier informatia , sub forma mesajelor
            FileWriter out=new FileWriter(newFileOpen.getName()+".txt");
            for(int i=0;i<seq.getTracks().length;i++)
              {
              out.write("Track: "+i+"\n");
              for(int j=0;j<seq.getTracks()[i].size()-1;j++)
                {
                for(int k=0;k<seq.getTracks()[i].get(j).getMessage().getMessage().length;k++)
                  out.write((seq.getTracks())[i].get(j).getMessage().getMessage()[k]+" ");
                out.write("\n");
                out.write("Tick: "+seq.getTracks()[i].get(j).getTick()+"\n");
                }
              }
            out.close();
            }catch(IOException ioe){};
            */
          }
        }
        
      if(seqr!=null&&!seqr.isRunning())
          {
          seqr.start();
          seqr.setTrackMute(0,true);
          mpt.start();
          }  
        }
    catch(MidiUnavailableException mue)
              {
              }
    catch(InvalidMidiDataException imde)
              {
              }
    catch(IOException ioe)
              {
              }
    }
  public void pause()
    {
    if(track!=null)
      {
      cp.pause=true;
      mpt.stop();
      mrt.stop();
      }
    if(seqr!=null && seqr.isRunning())
      {
      seqr.stop();
      mpt.stop();
      }
    }
  public void stop()
    {
    if(track!=null)
          {
          cp.stop=true;
          
          mpt.stop();
          mpt.contorEvent=0;
          mpt.start=0;
          mpt.redeseneaza();
          
          mrt.stop();
          }
    if(seqr!=null && seqr.isRunning())
          {
          seqr.stop();
          seqr.setMicrosecondPosition(0);
          
          mpt.stop();
          mpt.contorEvent=0;
          mpt.start=0;
          mpt.redeseneaza();
          }
    }
  public void record()
    {
    newFileNew=cp.fileNew;
    cp.pause=false;
    cp.stop=false;
    
    try
          {
          if(!newFileNew.getName().equals(oldFileNew.getName()))
              {
              if(!cp.stop)
                {
                seq=new Sequence(Sequence.PPQ,16);
         
                track=seq.createTrack();
              
                startTick=0;               
                }
              
              mrt.start();
              }
          }
    catch(InvalidMidiDataException imde)
          {
          }  
    }
  public void save()
    {
      try
          {
          if(Music.getExtension(cp.fileNew).equals("mid"))
                MidiSystem.write(seq, 0, cp.fileNew);
       
          if(Music.getExtension(cp.fileNew).equals("midi"))    
                MidiSystem.write(seq, 1, cp.fileNew);
          }
      catch(IOException ioe)
          {
          }
    track=null;
    }
  }