import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class Open extends AbstractButton 
  {
  protected JFileChooser jfc;
  
  public Open(ControlPanel cp,JPanel jp,String nume,int x,int y,int width,int height,ImageIcon ii)
    {
    super(cp,jp,nume,x,y,width,height,ii);
       
    jfc=new JFileChooser();
    jfc.setFileFilter(Audio.getAudioFilter());
    jfc.setFileFilter(Midi.getMidiFilter());
    }
    
  public void actionPerformed(ActionEvent ae)
    {
    int retriveValue=jfc.showOpenDialog(null);
    
    if(retriveValue==jfc.APPROVE_OPTION)
      {
      cp.fileNew=null;
      
      cp.fileOpen=jfc.getSelectedFile();
      
      if(cp.fileOpen!=null)
        {
        if(Audio.getTypeAudio(cp.fileOpen)!=null)
          {
          }
        else 
          {
          if(Midi.getTypeMidi(cp.fileOpen)!=-1)
            {
            }
          else 
            JOptionPane.showMessageDialog(null,
                                      new String("Unsupported Audio or Midi File"),
                                      "Open",
                                      JOptionPane.ERROR_MESSAGE);  
            }  
          }
      }
    }
  }  
  
  