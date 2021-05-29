
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Soundbank;
import javax.sound.midi.Synthesizer;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ControlPanel extends JFrame
  {
  protected Synthesizer synth;
  protected Instrument instr[];
  protected MidiChannel chan[];
  protected Soundbank soundbank; 
  protected static int nrOfChan=0;
  protected static int nrOfInstr=0;
  
  protected ListPanel lp;
  protected ButtonPanel bp;
  protected Claviatura c;
  protected JPanel jp;
  
  protected static boolean pause=false;
  protected static boolean stop=false;
    
  
  protected File fileNew,fileOpen;
  protected Music musicAudio,musicMidi;
 
  public ControlPanel()
    {
    addWindowListener
        (
        new WindowAdapter()
          {
          public void windowOpened(WindowEvent we)
            {
            setSize(1024,300);
            setResizable(false);
            show();
            }
          public void windowClosing(WindowEvent we)
            {
            System.exit(0);
            }
          }
        );
      
    getContentPane().setLayout(null);
    
    musicAudio=new Audio(this);
    musicMidi=new Midi(this);
    
    try
      {
      synth = MidiSystem.getSynthesizer();
      synth.open();
      
      super.setTitle(synth.getDeviceInfo().getName()+" "+
                     synth.getDeviceInfo().getVersion()+" "+
                     synth.getDeviceInfo().getDescription()); 
      }
    catch(MidiUnavailableException mue)
        {}
    
    lp=new ListPanel(this,0,10,420,120);
    bp=new ButtonPanel(this,800,10,200,120);
    c=new Claviatura(this,0,150,1024,150);
    
    jp=new JPanel();
    jp.setBounds(0,0,1024,150);
    jp.setLayout(null);
    jp.add(lp);
    jp.add(bp);
    
    getContentPane().add(jp);
    getContentPane().add(c);
    
    pack();
    show();
    }
  
  public static void main(String[] args)
    {
    new ControlPanel();
    }
  }