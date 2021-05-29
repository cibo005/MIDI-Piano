
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

abstract class AbstractButton extends JButton implements ActionListener
  {
  protected ControlPanel cp;
  protected JPanel jp;
  protected int x, y, width, height;
  protected String nume;
   
  public AbstractButton(ControlPanel cp,JPanel jp,String nume,int x,int y,int width,int height,ImageIcon ii)
    {
    this.cp=cp;
    this.jp=jp;
    this.nume=nume;
    this.x=x;
    this.y=y;
    this.width=width;
    this.height=height;
    this.setIcon(ii);
    this.setBounds(x,y,width,height);
    this.setBorderPainted(true);
    this.setToolTipText(nume);
    this.jp.add(this);
    }
     
  public abstract void actionPerformed(ActionEvent ae);
  }