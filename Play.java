import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class Play extends AbstractButton 
  {
  public Play(ControlPanel cp,JPanel jp,String nume,int x,int y,int width,int height,ImageIcon ii)
    {
    super(cp,jp,nume,x,y,width,height,ii);
    }
  public void actionPerformed(ActionEvent ae)
    {
    if(cp.fileOpen!=null)
      {
      if(Audio.getTypeAudio(cp.fileOpen)!=null)
        cp.musicAudio.play();
        
      if(Midi.getTypeMidi(cp.fileOpen)!=-1)
        cp.musicMidi.play();
      }
    else
      {
      if(cp.fileNew!=null)
          {
          for(int i=0;i<Audio.nrOfAudioTypes;i++)
            if(Music.getExtension(cp.fileNew).equals(Audio.extensionAudio[i]))
              cp.musicAudio.play();
      
          for(int i=0;i<Midi.nrOfMidiTypes;i++)     
            if(Music.getExtension(cp.fileNew).equals(Midi.extensionMidi[i]))
              cp.musicMidi.play();
          }
      else
          JOptionPane.showMessageDialog(null,"Select an open file first","Play",JOptionPane.ERROR_MESSAGE);
      }
    } 
  }
  