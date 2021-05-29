
import java.awt.Color;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class ButtonPanel extends JPanel 
  {
  protected ControlPanel cp;
  protected AbstractButton ab[];
  protected JComboBox jcb;
  
  public ButtonPanel(ControlPanel cp,int x,int y,int w,int h)
    {
    this.cp=cp;
    
    this.setBounds(x,y,w,h);
    this.setLayout(null);
    
    Vector elements=new Vector();
    for(int i=240;i<=630;i+=30)
      elements.addElement(new Integer(i));
    jcb=new JComboBox(elements);
    jcb.setBounds(60,100,100,20);
    jcb.setToolTipText("seconds");

    ab=new AbstractButton[8];
    ab[0]=new Play(cp,this,"Play",0,50,40,40,new ImageIcon("icons\\play.png"));
    ab[1]=new Pause(cp,this,"Pause",40,50,40,40,new ImageIcon("icons\\pause.png"));
    ab[2]=new Stop(cp,this,"Stop",80,50,40,40,new ImageIcon("icons\\stop.png"));
    ab[3]=new Record(cp,this,"Record",120,50,40,40,new ImageIcon("icons\\record.png"));
    ab[4]=new New(cp,this,"New",0,0,40,40,new ImageIcon("icons\\new.png"));    
    ab[5]=new Open(cp,this,"Open",40,0,40,40,new ImageIcon("icons\\open.png"));    
    ab[6]=new Save(cp,this,"Save",80,0,40,40,new ImageIcon("icons\\save.png"));
    ab[7]=new About(cp,this,"About",120,0,40,40,new ImageIcon("icons\\about.png"));
    
    ab[0].addActionListener(ab[0]);
    ab[1].addActionListener(ab[1]);
    ab[2].addActionListener(ab[2]);
    ab[3].addActionListener(ab[3]);
    ab[4].addActionListener(ab[4]);
    ab[5].addActionListener(ab[5]);
    ab[6].addActionListener(ab[6]);
    ab[7].addActionListener(ab[7]);
    
    ab[0].setFocusable(false);
    ab[1].setFocusable(false);
    ab[2].setFocusable(false);
    ab[3].setFocusable(false);
    ab[4].setFocusable(false);
    ab[5].setFocusable(false);
    ab[6].setFocusable(false);
    ab[7].setFocusable(false);
    jcb.setFocusable(false);    
    
    this.add(jcb);
    }
  }