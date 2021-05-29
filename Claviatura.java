
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

public class Claviatura extends JPanel implements KeyListener
  {
  protected ControlPanel cp;
  
  protected Clapa Do[];
  protected Clapa Re[];
  protected Clapa Mi[];
  protected Clapa Fa[];
  protected Clapa Sol[];
  protected Clapa La[];
  protected Clapa Si[];
  protected Clapa DoMajor;
  protected Clapa Do_Re[];
  protected Clapa Re_Mi[];
  protected Clapa Fa_Sol[];
  protected Clapa Sol_La[];
  protected Clapa La_Si[];
  
  
  public Claviatura(ControlPanel cp,int x,int y,int w,int h)
    {
    super();
    
    this.cp=cp;
    
    Do=new Clapa[5];
    Re=new Clapa[5];
    Mi=new Clapa[5];
    Fa=new Clapa[5];
    Sol=new Clapa[5];
    La=new Clapa[5];
    Si=new Clapa[5];
    Do_Re=new Clapa[5];
    Re_Mi=new Clapa[5];
    Fa_Sol=new Clapa[5];
    Sol_La=new Clapa[5];
    La_Si=new Clapa[5];
    
      Do[0]=new Clapa(cp," do",24+12*0,120,Color.WHITE,10+28*7*0,0,28,92,KeyEvent.VK_F1);
      Re[0]=new Clapa(cp," re",26+12*0,120,Color.WHITE,38+28*7*0,0,28,92,KeyEvent.VK_F2);
      Mi[0]=new Clapa(cp," mi",28+12*0,120,Color.WHITE,66+28*7*0,0,28,92,KeyEvent.VK_F3);
      Fa[0]=new Clapa(cp," fa",29+12*0,120,Color.WHITE,94+28*7*0,0,28,92,KeyEvent.VK_F4);
      Sol[0]=new Clapa(cp," sol",31+12*0,120,Color.WHITE,122+28*7*0,0,28,92,KeyEvent.VK_F5);
      La[0]=new Clapa(cp," la",33+12*0,120,Color.WHITE,150+28*7*0,0,28,92,KeyEvent.VK_F6);
      Si[0]=new Clapa(cp," si",35+12*0,120,Color.WHITE,178+28*7*0,0,28,92,KeyEvent.VK_F7);
      Do_Re[0]=new Clapa(cp,"do#",25+12*0,120,Color.BLACK,(38-10)+28*7*0,0,20,60,KeyEvent.VK_F8);
      Re_Mi[0]=new Clapa(cp,"re#",27+12*0,120,Color.BLACK,(66-10)+28*7*0,0,20,60,KeyEvent.VK_F9);
      Fa_Sol[0]=new Clapa(cp,"fa#",30+12*0,120,Color.BLACK,(122-10)+28*7*0,0,20,60,KeyEvent.VK_F10);
      Sol_La[0]=new Clapa(cp,"sol#",32+12*0,120,Color.BLACK,(150-10)+28*7*0,0,20,60,KeyEvent.VK_F11);
      La_Si[0]=new Clapa(cp,"la#",34+12*0,120,Color.BLACK,(178-10)+28*7*0,0,20,60,KeyEvent.VK_F12);
   
      Do[1]=new Clapa(cp," do",24+12*1,120,Color.WHITE,10+28*7*1,0,28,92,KeyEvent.VK_1);
      Re[1]=new Clapa(cp," re",26+12*1,120,Color.WHITE,38+28*7*1,0,28,92,KeyEvent.VK_2);
      Mi[1]=new Clapa(cp," mi",28+12*1,120,Color.WHITE,66+28*7*1,0,28,92,KeyEvent.VK_3);
      Fa[1]=new Clapa(cp," fa",29+12*1,120,Color.WHITE,94+28*7*1,0,28,92,KeyEvent.VK_4);
      Sol[1]=new Clapa(cp," sol",31+12*1,120,Color.WHITE,122+28*7*1,0,28,92,KeyEvent.VK_5);
      La[1]=new Clapa(cp," la",33+12*1,120,Color.WHITE,150+28*7*1,0,28,92,KeyEvent.VK_6);
      Si[1]=new Clapa(cp," si",35+12*1,120,Color.WHITE,178+28*7*1,0,28,92,KeyEvent.VK_7);
      Do_Re[1]=new Clapa(cp,"do#",25+12*1,120,Color.BLACK,(38-10)+28*7*1,0,20,60,KeyEvent.VK_8);
      Re_Mi[1]=new Clapa(cp,"re#",27+12*1,120,Color.BLACK,(66-10)+28*7*1,0,20,60,KeyEvent.VK_9);
      Fa_Sol[1]=new Clapa(cp,"fa#",30+12*1,120,Color.BLACK,(122-10)+28*7*1,0,20,60,KeyEvent.VK_0);
      Sol_La[1]=new Clapa(cp,"sol#",32+12*1,120,Color.BLACK,(150-10)+28*7*1,0,20,60,KeyEvent.VK_A);
      La_Si[1]=new Clapa(cp,"la#",34+12*1,120,Color.BLACK,(178-10)+28*7*1,0,20,60,KeyEvent.VK_B);
      
      Do[2]=new Clapa(cp," do",24+12*2,120,Color.WHITE,10+28*7*2,0,28,92,KeyEvent.VK_C);
      Re[2]=new Clapa(cp," re",26+12*2,120,Color.WHITE,38+28*7*2,0,28,92,KeyEvent.VK_D);
      Mi[2]=new Clapa(cp," mi",28+12*2,120,Color.WHITE,66+28*7*2,0,28,92,KeyEvent.VK_E);
      Fa[2]=new Clapa(cp," fa",29+12*2,120,Color.WHITE,94+28*7*2,0,28,92,KeyEvent.VK_F);
      Sol[2]=new Clapa(cp," sol",31+12*2,120,Color.WHITE,122+28*7*2,0,28,92,KeyEvent.VK_G);
      La[2]=new Clapa(cp," la",33+12*2,120,Color.WHITE,150+28*7*2,0,28,92,KeyEvent.VK_H);
      Si[2]=new Clapa(cp," si",35+12*2,120,Color.WHITE,178+28*7*2,0,28,92,KeyEvent.VK_I);
      Do_Re[2]=new Clapa(cp,"do#",25+12*2,120,Color.BLACK,(38-10)+28*7*2,0,20,60,KeyEvent.VK_J);
      Re_Mi[2]=new Clapa(cp,"re#",27+12*2,120,Color.BLACK,(66-10)+28*7*2,0,20,60,KeyEvent.VK_K);
      Fa_Sol[2]=new Clapa(cp,"fa#",30+12*2,120,Color.BLACK,(122-10)+28*7*2,0,20,60,KeyEvent.VK_L);
      Sol_La[2]=new Clapa(cp,"sol#",32+12*2,120,Color.BLACK,(150-10)+28*7*2,0,20,60,KeyEvent.VK_M);
      La_Si[2]=new Clapa(cp,"la#",34+12*2,120,Color.BLACK,(178-10)+28*7*2,0,20,60,KeyEvent.VK_N);
   
   
      Do[3]=new Clapa(cp," do",24+12*3,120,Color.WHITE,10+28*7*3,0,28,92,KeyEvent.VK_O);
      Re[3]=new Clapa(cp," re",26+12*3,120,Color.WHITE,38+28*7*3,0,28,92,KeyEvent.VK_P);
      Mi[3]=new Clapa(cp," mi",28+12*3,120,Color.WHITE,66+28*7*3,0,28,92,KeyEvent.VK_Q);
      Fa[3]=new Clapa(cp," fa",29+12*3,120,Color.WHITE,94+28*7*3,0,28,92,KeyEvent.VK_R);
      Sol[3]=new Clapa(cp," sol",31+12*3,120,Color.WHITE,122+28*7*3,0,28,92,KeyEvent.VK_S);
      La[3]=new Clapa(cp," la",33+12*3,120,Color.WHITE,150+28*7*3,0,28,92,KeyEvent.VK_T);
      Si[3]=new Clapa(cp," si",35+12*3,120,Color.WHITE,178+28*7*3,0,28,92,KeyEvent.VK_U);
      Do_Re[3]=new Clapa(cp,"do#",25+12*3,120,Color.BLACK,(38-10)+28*7*3,0,20,60,KeyEvent.VK_V);
      Re_Mi[3]=new Clapa(cp,"re#",27+12*3,120,Color.BLACK,(66-10)+28*7*3,0,20,60,KeyEvent.VK_W);
      Fa_Sol[3]=new Clapa(cp,"fa#",30+12*3,120,Color.BLACK,(122-10)+28*7*3,0,20,60,KeyEvent.VK_X);
      Sol_La[3]=new Clapa(cp,"sol#",32+12*3,120,Color.BLACK,(150-10)+28*7*3,0,20,60,KeyEvent.VK_Y);
      La_Si[3]=new Clapa(cp,"la#",34+12*3,120,Color.BLACK,(178-10)+28*7*3,0,20,60,KeyEvent.VK_Z);
   
      Do[4]=new Clapa(cp," do",24+12*4,120,Color.WHITE,10+28*7*4,0,28,92,KeyEvent.VK_MINUS);
      Re[4]=new Clapa(cp," re",26+12*4,120,Color.WHITE,38+28*7*4,0,28,92,KeyEvent.VK_EQUALS);
      Mi[4]=new Clapa(cp," mi",28+12*4,120,Color.WHITE,66+28*7*4,0,28,92,KeyEvent.VK_OPEN_BRACKET);
      Fa[4]=new Clapa(cp," fa",29+12*4,120,Color.WHITE,94+28*7*4,0,28,92,KeyEvent.VK_CLOSE_BRACKET);
      Sol[4]=new Clapa(cp," sol",31+12*4,120,Color.WHITE,122+28*7*4,0,28,92,KeyEvent.VK_SEMICOLON);
      La[4]=new Clapa(cp," la",33+12*4,120,Color.WHITE,150+28*7*4,0,28,92,KeyEvent.VK_COMMA);
      Si[4]=new Clapa(cp," si",35+12*4,120,Color.WHITE,178+28*7*4,0,28,92,KeyEvent.VK_PERIOD);
      Do_Re[4]=new Clapa(cp,"do#",25+12*4,120,Color.BLACK,(38-10)+28*7*4,0,20,60,KeyEvent.VK_SLASH);
      Re_Mi[4]=new Clapa(cp,"re#",27+12*4,120,Color.BLACK,(66-10)+28*7*4,0,20,60,KeyEvent.VK_BACK_SLASH);
      Fa_Sol[4]=new Clapa(cp,"fa#",30+12*4,120,Color.BLACK,(122-10)+28*7*4,0,20,60,KeyEvent.VK_INSERT);
      Sol_La[4]=new Clapa(cp,"sol#",32+12*4,120,Color.BLACK,(150-10)+28*7*4,0,20,60,KeyEvent.VK_DELETE);
      La_Si[4]=new Clapa(cp,"la#",34+12*4,120,Color.BLACK,(178-10)+28*7*4,0,20,60,KeyEvent.VK_PAGE_DOWN);
   
      DoMajor=new Clapa(cp,"do",35+12*5,120,Color.WHITE,10+28*7*5,0,28,92,KeyEvent.VK_PAGE_UP);
    
   for(int i=0;i<5;i++)
      {
      Do[i].setPoint(0,0,18,60,0,60,28,92-60);
      Re[i].setPoint(10,0,8,60,0,60,28,92-60);
      Mi[i].setPoint(10,0,18,60,0,60,28,92-60);
      Fa[i].setPoint(0,0,18,60,0,60,28,92-60);
      Sol[i].setPoint(10,0,8,60,0,60,28,92-60);
      La[i].setPoint(10,0,8,60,0,60,28,92-60);
      Si[i].setPoint(10,0,18,60,0,60,28,92-60);
      Do_Re[i].setPoint(0,0,20,60,0,60,0,0);
      Re_Mi[i].setPoint(0,0,20,60,0,60,0,0);
      Fa_Sol[i].setPoint(0,0,20,60,0,60,0,0);
      Sol_La[i].setPoint(0,0,20,60,0,60,0,0);
      La_Si[i].setPoint(0,0,20,60,0,60,0,0);
      }
      DoMajor.setPoint(0,0,28,92,0,92,0,0);
    
    for(int i=0;i<5;i++)
      {
      Do[i].addMouseListener(Do[i]);
      Do[i].addKeyListener(this);      
      Re[i].addMouseListener(Re[i]);
      Re[i].addKeyListener(this);
      Mi[i].addMouseListener(Mi[i]);
      Mi[i].addKeyListener(this);
      Fa[i].addMouseListener(Fa[i]);
      Fa[i].addKeyListener(this);
      Sol[i].addMouseListener(Sol[i]);
      Sol[i].addKeyListener(this);
      La[i].addMouseListener(La[i]);
      La[i].addKeyListener(this);
      Si[i].addMouseListener(Si[i]);
      Si[i].addKeyListener(this);
      Do_Re[i].addMouseListener(Do_Re[i]);
      Do_Re[i].addKeyListener(this);
      Re_Mi[i].addMouseListener(Re_Mi[i]);
      Re_Mi[i].addKeyListener(this);
      Fa_Sol[i].addMouseListener(Fa_Sol[i]);
      Fa_Sol[i].addKeyListener(this);
      Sol_La[i].addMouseListener(Sol_La[i]);
      Sol_La[i].addKeyListener(this);
      La_Si[i].addMouseListener(La_Si[i]);
      La_Si[i].addKeyListener(this);
      }
    DoMajor.addMouseListener(DoMajor);
    DoMajor.addKeyListener(this);
    
    //este important ca mai intai sa fie adaugate clapetele negre
    
    this.setBounds(x,y,w,h);
    this.setLayout(null);
    
    for(int i=0;i<5;i++)
      {
      this.add(Do_Re[i]);
      this.add(Re_Mi[i]);
      this.add(Fa_Sol[i]);
      this.add(Sol_La[i]);
      this.add(La_Si[i]);
      }
      
    for(int i=0;i<5;i++)
      {
      this.add(Do[i]);
      this.add(Re[i]);
      this.add(Mi[i]);
      this.add(Fa[i]);
      this.add(Sol[i]);
      this.add(La[i]);
      this.add(Si[i]);
      }
    this.add(DoMajor);
    }
  public void keyPressed(KeyEvent ke)
    {
          if(ke.getKeyCode()==ke.VK_F1)Do[0].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_F2)Re[0].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_F3)Mi[0].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_F4)Fa[0].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_F5)Sol[0].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_F6)La[0].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_F7)Si[0].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_F8)Do_Re[0].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_F9)Re_Mi[0].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_F10)Fa_Sol[0].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_F11)Sol_La[0].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_F12)La_Si[0].mousePressed(null);
   
          if(ke.getKeyCode()==ke.VK_1)Do[1].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_2)Re[1].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_3)Mi[1].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_4)Fa[1].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_5)Sol[1].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_6)La[1].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_7)Si[1].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_8)Do_Re[1].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_9)Re_Mi[1].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_0)Fa_Sol[1].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_A)Sol_La[1].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_B)La_Si[1].mousePressed(null);
      
          if(ke.getKeyCode()==ke.VK_C)Do[2].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_D)Re[2].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_E)Mi[2].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_F)Fa[2].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_G)Sol[2].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_H)La[2].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_I)Si[2].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_J)Do_Re[2].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_K)Re_Mi[2].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_L)Fa_Sol[2].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_M)Sol_La[2].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_N)La_Si[2].mousePressed(null);
    
          if(ke.getKeyCode()==ke.VK_O)Do[3].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_P)Re[3].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_Q)Mi[3].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_R)Fa[3].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_S)Sol[3].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_T)La[3].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_U)Si[3].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_V)Do_Re[3].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_W)Re_Mi[3].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_X)Fa_Sol[3].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_Y)Sol_La[3].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_Z)La_Si[3].mousePressed(null);
   
          if(ke.getKeyCode()==ke.VK_MINUS)Do[4].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_EQUALS)Re[4].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_OPEN_BRACKET)Mi[4].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_CLOSE_BRACKET)Fa[4].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_SEMICOLON)Sol[4].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_COMMA)La[4].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_PERIOD)Si[4].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_SLASH)Do_Re[4].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_BACK_SLASH)Re_Mi[4].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_INSERT)Fa_Sol[4].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_DELETE)Sol_La[4].mousePressed(null);
          if(ke.getKeyCode()==ke.VK_PAGE_DOWN)La_Si[4].mousePressed(null); 
          
          if(ke.getKeyCode()==ke.VK_PAGE_UP)DoMajor.mousePressed(null);
          
          if(ke.getKeyCode()==ke.VK_NUMPAD0)cp.lp.editInstrument(9);
          if(ke.getKeyCode()==ke.VK_NUMPAD1)cp.lp.editInstrument(0);
          if(ke.getKeyCode()==ke.VK_NUMPAD2)cp.lp.editInstrument(1);
          if(ke.getKeyCode()==ke.VK_NUMPAD3)cp.lp.editInstrument(2);
          if(ke.getKeyCode()==ke.VK_NUMPAD4)cp.lp.editInstrument(3);
          if(ke.getKeyCode()==ke.VK_NUMPAD5)cp.lp.editInstrument(4);
          if(ke.getKeyCode()==ke.VK_NUMPAD6)cp.lp.editInstrument(5);
          if(ke.getKeyCode()==ke.VK_NUMPAD7)cp.lp.editInstrument(6);
          if(ke.getKeyCode()==ke.VK_NUMPAD8)cp.lp.editInstrument(7);
          if(ke.getKeyCode()==ke.VK_NUMPAD9)cp.lp.editInstrument(8);
          //if(ke.getKeyCode()==ke.)cp.lp.editInstrument(0);
          //if(ke.getKeyCode()==ke.)cp.lp.editInstrument(0);
          //if(ke.getKeyCode()==ke.)cp.lp.editInstrument(0);
          //if(ke.getKeyCode()==ke.)cp.lp.editInstrument(0);
          //if(ke.getKeyCode()==ke.)cp.lp.editInstrument(0);
          //if(ke.getKeyCode()==ke.)cp.lp.editInstrument(0);
    
    }
    
  public void keyReleased(KeyEvent ke)
    {
          if(ke.getKeyCode()==ke.VK_F1)Do[0].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_F2)Re[0].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_F3)Mi[0].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_F4)Fa[0].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_F5)Sol[0].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_F6)La[0].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_F7)Si[0].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_F8)Do_Re[0].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_F9)Re_Mi[0].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_F10)Fa_Sol[0].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_F11)Sol_La[0].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_F12)La_Si[0].mouseReleased(null);
   
          if(ke.getKeyCode()==ke.VK_1)Do[1].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_2)Re[1].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_3)Mi[1].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_4)Fa[1].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_5)Sol[1].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_6)La[1].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_7)Si[1].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_8)Do_Re[1].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_9)Re_Mi[1].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_0)Fa_Sol[1].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_A)Sol_La[1].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_B)La_Si[1].mouseReleased(null);
      
          if(ke.getKeyCode()==ke.VK_C)Do[2].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_D)Re[2].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_E)Mi[2].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_F)Fa[2].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_G)Sol[2].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_H)La[2].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_I)Si[2].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_J)Do_Re[2].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_K)Re_Mi[2].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_L)Fa_Sol[2].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_M)Sol_La[2].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_N)La_Si[2].mouseReleased(null);
    
          if(ke.getKeyCode()==ke.VK_O)Do[3].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_P)Re[3].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_Q)Mi[3].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_R)Fa[3].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_S)Sol[3].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_T)La[3].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_U)Si[3].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_V)Do_Re[3].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_W)Re_Mi[3].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_X)Fa_Sol[3].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_Y)Sol_La[3].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_Z)La_Si[3].mouseReleased(null);
   
          if(ke.getKeyCode()==ke.VK_MINUS)Do[4].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_EQUALS)Re[4].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_OPEN_BRACKET)Mi[4].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_CLOSE_BRACKET)Fa[4].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_SEMICOLON)Sol[4].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_COMMA)La[4].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_PERIOD)Si[4].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_SLASH)Do_Re[4].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_BACK_SLASH)Re_Mi[4].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_INSERT)Fa_Sol[4].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_DELETE)Sol_La[4].mouseReleased(null);
          if(ke.getKeyCode()==ke.VK_PAGE_DOWN)La_Si[4].mouseReleased(null); 
          
          if(ke.getKeyCode()==ke.VK_PAGE_UP)DoMajor.mouseReleased(null);;
    }
    
  public void keyTyped(KeyEvent ke)
    {}
  }