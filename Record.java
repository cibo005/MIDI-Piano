import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class Record extends AbstractButton 
  {
  public Record(ControlPanel cp,JPanel jp,String nume,int x,int y,int width,int height,ImageIcon ii)
    {
    super(cp,jp,nume,x,y,width,height,ii);
    }
  public void actionPerformed(ActionEvent ae)
    {    
    if(cp.fileNew!=null)
      {
      for(int i=0;i<Audio.nrOfAudioTypes;i++)
        if(Music.getExtension(cp.fileNew).equals(Audio.extensionAudio[i]))
           cp.musicAudio.record();
      
      for(int i=0;i<Midi.nrOfMidiTypes;i++)     
        if(Music.getExtension(cp.fileNew).equals(Midi.extensionMidi[i]))
           cp.musicMidi.record();
      }
    else
        JOptionPane.showMessageDialog(null,"Select a new file first","Record",JOptionPane.ERROR_MESSAGE);
    }
  }