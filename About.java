
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;

class About extends AbstractButton 
  {
  protected JDialog dialog;
  protected JLabel label;
  
  public About(ControlPanel cp,JPanel jp,String nume,int x,int y,int width,int height,ImageIcon ii)
    {
    super(cp,jp,nume,x,y,width,height,ii);
    }
  public void actionPerformed(ActionEvent ae)
    {
    dialog=new JDialog();
    dialog.setTitle("About");
    dialog.setResizable(false);
    dialog.getContentPane().setLayout(null);
    
    label=new JLabel(new ImageIcon("icons\\cibo.png"));
    label.setBounds(100,20,200,120);
    
    dialog.addWindowListener
      (
      new WindowAdapter()
        {
        public void windowOpened(WindowEvent we)
            {
            dialog.setBounds(300,200,400,500);
            dialog.show();
            }
          
        public void windowClosing(WindowEvent we)
          {
          dialog.dispose();
          }
        }
      );
    dialog.getContentPane().add(label);
    dialog.pack();
    dialog.show();
    }
  }