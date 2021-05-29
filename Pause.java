
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

class Pause extends AbstractButton
  {
  
  public Pause(ControlPanel cp,JPanel jp,String nume,int x,int y,int width,int height,ImageIcon ii)
    {
    super(cp,jp,nume,x,y,width,height,ii);
    }
  public void actionPerformed(ActionEvent ae)
    {
    if(cp.fileNew!=null)
      {
      for(int i=0;i<Audio.nrOfAudioTypes;i++)
        if(Music.getExtension(cp.fileNew).equals(Audio.extensionAudio[i]))
           cp.musicAudio.pause();
      
      for(int i=0;i<Midi.nrOfMidiTypes;i++)     
        if(Music.getExtension(cp.fileNew).equals(Midi.extensionMidi[i]))
           cp.musicMidi.pause();
      }
    if(cp.fileOpen!=null)
      {
      if(Audio.getTypeAudio(cp.fileOpen)!=null)
        cp.musicAudio.pause();
        
      if(Midi.getTypeMidi(cp.fileOpen)!=-1)
        cp.musicMidi.pause();
      }
    }
  }