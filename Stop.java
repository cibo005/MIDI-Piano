import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

class Stop extends AbstractButton 
  {
  public Stop(ControlPanel cp,JPanel jp,String nume,int x,int y,int width,int height,ImageIcon ii)
    {
    super(cp,jp,nume,x,y,width,height,ii);
    }
  public void actionPerformed(ActionEvent ae)
    {
    if(cp.fileNew!=null)
      {
      for(int i=0;i<Audio.nrOfAudioTypes;i++)
        if(Music.getExtension(cp.fileNew).equals(Audio.extensionAudio[i]))
           cp.musicAudio.stop();
      
      for(int i=0;i<Midi.nrOfMidiTypes;i++)     
        if(Music.getExtension(cp.fileNew).equals(Midi.extensionMidi[i]))
           cp.musicMidi.stop();
      }
    if(cp.fileOpen!=null)
      {
      if(Audio.getTypeAudio(cp.fileOpen)!=null)
        cp.musicAudio.stop();
        
      if(Midi.getTypeMidi(cp.fileOpen)!=-1)
        cp.musicMidi.stop();
      }  
    }
  }
  