import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

class New extends AbstractButton 
  {
  protected JFileChooser jfc;

  public New(ControlPanel cp,JPanel jp,String nume,int x,int y,int width,int height,ImageIcon ii)
    {
    super(cp,jp,nume,x,y,width,height,ii); 
    
    jfc=new JFileChooser();
    jfc.setFileFilter(Audio.getAudioFilter());
    jfc.setFileFilter(Midi.getMidiFilter());
    jfc.setDialogTitle("New");
    }
    
  public void actionPerformed(ActionEvent ae)
    {
    int retriveValue=jfc.showDialog(null,"New");
    
    if(retriveValue==jfc.APPROVE_OPTION)
      {
      cp.fileOpen=null;
      
      cp.fileNew=new File(jfc.getCurrentDirectory().getAbsolutePath(),
                          jfc.getSelectedFile().getName());
      
      cp.bp.jcb.setSelectedIndex(0);
      }
    }
  }