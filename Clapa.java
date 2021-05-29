
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.ShortMessage;
import javax.swing.JButton;

public class Clapa extends JButton implements MouseListener
  {
  ControlPanel cp;
  String nume;
  protected int inaltime;
  protected int durata;
  protected static double t=1.0;
  protected int x1,x2,w1,h1;
  protected int y1,y2,w2,h2;
  protected int w,h;
  protected Color culoare;
  protected int key;
  protected boolean keyPressed=false;
  protected boolean keyReleased=false;
  protected boolean white=false;
  
  protected ShortMessage on=new ShortMessage( );
  protected ShortMessage off= new ShortMessage( );
  
  public Clapa(ControlPanel cp,String nume,int inaltime,int durata,Color culoare,int x,int y,int w,int h,int key)
    {
    this.cp=cp;
    this.inaltime=inaltime;
    this.durata=durata;
    this.nume=nume;
    this.culoare=culoare;
    this.setBounds(x,y,this.w=w,this.h=h);
    this.key=key;
    this.setOpaque(false);
    if(culoare==Color.WHITE)
      this.white=true;
    }
  public void setPoint(int x1,int y1,int w1,int h1,int x2,int y2,int w2,int h2)
    {
    this.x1=x1;
    this.y1=y1;
    this.w1=w1;
    this.h1=h1;
    this.x2=x2;
    this.y2=y2;
    this.w2=w2;
    this.h2=h2;
    
    }
  public void paintComponent(Graphics g)
    {
    g.setColor(culoare);
    
    g.fillRect(x1,y1,w1,h1);
    g.fillRect(x2,y2,w2,h2);
    
    g.setColor(new Color(255-culoare.getRed(),255-culoare.getGreen(),255-culoare.getBlue()));
    
    g.setFont(new Font("Arial",Font.PLAIN,10));
    g.drawString(nume,3,h-20);
    }
  public void setCuloare(Color culoare)
    {
    this.culoare=culoare;
    }
  public Color getCuloare()
    {
    return culoare;
    }
  public int getInaltime()
    {
    return inaltime;
    }
  public void setDurata(int durata)
    {
    this.durata=durata;
    }
  public int getDurata()
    {
    return durata;
    }
  public ShortMessage getOn()
    {
    return on;
    }
  public ShortMessage getOff()
    {
    return off;
    }
  public boolean getKeyPressed()
    {
    return keyPressed;
    }
  public boolean getKeyReleased()
    {
    return keyReleased;
    }
  public void deseneazaClapa()
    {
    this.setCuloare(Color.ORANGE);
    this.paintComponent(this.getGraphics());      
    }
  public void redeseneazaClapa()
    {
    if(!white)this.setCuloare(Color.BLACK);
    if(white)this.setCuloare(Color.WHITE);
    this.paintComponent(this.getGraphics());
    this.cp.repaint();
    }
  public void mousePressed(MouseEvent me)
    {
    if(!keyPressed)
      {
      keyPressed=true;
      keyReleased=false;
      
      deseneazaClapa();
          
          try
              {
              // este valabil numai pentru functia play
              on.setMessage(ShortMessage.NOTE_ON,cp.nrOfChan, this.getInaltime(), this.getDurata());
              cp.synth.getReceiver().send(on,-1L);
              }
            catch(MidiUnavailableException mue)
              {
              }
            catch(InvalidMidiDataException imde)
              {
              }
        }
    }
  public void mouseReleased(MouseEvent me)
    {
    keyPressed=false;
    keyReleased=true;
    
    redeseneazaClapa();
    
        try
          {
          // este valabil numai pentru functia play
          off.setMessage(ShortMessage.NOTE_OFF,cp.nrOfChan, this.getInaltime(), this.getDurata());
          cp.synth.getReceiver().send(off,-1L);  
          }
        catch(MidiUnavailableException mue)
          {
          }
        catch(InvalidMidiDataException imde)
          {
          } 
    }
    
  public void mouseClicked(MouseEvent me)
    {
    }
  public void mouseEntered(MouseEvent me)
    {
    }
  public void mouseExited(MouseEvent me)
    {
    }
  
  }