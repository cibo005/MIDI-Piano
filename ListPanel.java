
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.StringIndexOutOfBoundsException;
import javax.sound.midi.Instrument;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.ShortMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ListPanel extends JPanel implements ActionListener
  {
  protected ControlPanel cp;
  protected List list1;
  protected List list2;
  
  protected String instrumente[];
  protected String canale[];
  
  public ListPanel(ControlPanel cp,int x,int y,int w,int h)
    {
    this.cp=cp;
    this.setLayout(null);
    this.setBounds(x,y,w,h);
    
      if(cp.synth.isSoundbankSupported(cp.soundbank=cp.synth.getDefaultSoundbank()))
        {
        int lungChan=cp.synth.getChannels().length;  
        if(lungChan!=0)
         {
         cp.chan=new MidiChannel[lungChan];
         for(int i=0;i<lungChan;i++)
           cp.chan[i]=cp.synth.getChannels()[i];
              
          list1=new List(lungChan);
          list1.setBounds(10,0,200,120);
          canale=new String [lungChan];
          for(int i=0;i<lungChan;i++)
            {
            canale[i]="Channel "+(i+1)+" ";
            list1.add(canale[i],i);
            }
          list1.select(cp.nrOfChan);
          list1.addActionListener(this);
          list1.addKeyListener(cp.c);
          }
          
        int lungInstr=cp.synth.getAvailableInstruments().length;
        if(lungInstr!=0)
          {
          cp.instr=new Instrument[lungInstr];
          for(int i=0;i<lungInstr;i++)
            cp.instr[i]=cp.synth.getAvailableInstruments()[i];
          
          cp.synth.loadInstrument(cp.instr[cp.nrOfInstr]);
          
          list2=new List(lungInstr);
          list2.setBounds(220,0,200,120);
          instrumente=new String [lungInstr];
          for(int i=0;i<lungInstr;i++)
            {
            instrumente[i]=cp.instr[i].getName()+" "+"("+
                            cp.instr[i].getPatch().getBank()+","+
                            cp.instr[i].getPatch().getProgram()+")";
            list2.add(instrumente[i],i);
            }
          list2.select(cp.nrOfInstr);
          list2.addActionListener(this);
          }
        }
      
    list1.setFocusable(false);
    list2.setFocusable(false);
    
    add(list1);
    add(list2);
    }
  public void actionPerformed(ActionEvent ae)
    {
    if(ae.getSource()==list1)
      {
      cp.nrOfChan=list1.getSelectedIndex();
      list1.select(cp.nrOfChan);
      }
    if(ae.getSource()==list2)
      {
      cp.synth.unloadInstrument(cp.instr[cp.nrOfInstr]);
      cp.nrOfInstr=list2.getSelectedIndex();
      cp.synth.loadInstrument(cp.instr[cp.nrOfInstr]);
      cp.chan[cp.nrOfChan].programChange(cp.instr[cp.nrOfInstr].getPatch().getBank(),
                                    cp.instr[cp.nrOfInstr].getPatch().getProgram());
      list1.replaceItem(canale[cp.nrOfChan]+list2.getItem(cp.nrOfInstr),cp.nrOfChan);
      list1.select(cp.nrOfChan);
      }
    }
    
  public void editInstrument(int nrOfChannel)
    {
    cp.nrOfChan=nrOfChannel;
    list1.select(cp.nrOfChan);
    }
  }