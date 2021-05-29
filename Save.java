import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class Save extends AbstractButton 
  {
  
  public Save(ControlPanel cp,JPanel jp,String nume,int x,int y,int width,int height,ImageIcon ii)
    {
    super(cp,jp,nume,x,y,width,height,ii);
    }
  public void actionPerformed(ActionEvent ae)
    {
    if(cp.fileNew!=null)
      {
      if(Audio.getTypeAudio(cp.fileNew)!=null)
          cp.musicAudio.save();
      
      for(int i=0;i<Midi.nrOfMidiTypes;i++)     
        if(Midi.getExtension(cp.fileNew).equals(Midi.extensionMidi[i]))
          cp.musicMidi.save();
          
      cp.fileNew=null;
      }
    else
        JOptionPane.showMessageDialog(null,"It's nothing to save","Save",JOptionPane.ERROR_MESSAGE);  
    }
  }