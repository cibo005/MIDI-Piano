import java.awt.Color;
import javax.sound.midi.ShortMessage;

class MidiPlayThread extends Thread
  {
  public long start;
  public int contorEvent;
  public Midi midi;
  
  public MidiPlayThread(Midi midi)
            {
            this.midi=midi;
            start=0;
            contorEvent=0;
            }
            
  public void run()
              {
              while(contorEvent < midi.seq.getTracks()[0].size())
                {
                try{Thread.sleep((midi.seq.getTracks()[0].get(contorEvent).getTick() - start)*30);}
                catch(InterruptedException ie){};
                
                start=midi.seq.getTracks()[0].get(contorEvent).getTick();    
                
                try
                  {     
                    //status=128 corespunde mesajului noteOff
                    if( (midi.seq.getTracks())[0].get(contorEvent).getMessage().getStatus() == ShortMessage.NOTE_OFF)
                      {
                      redeseneaza();
                      }
                        
                    //status=144 corespunde mesajului noteOn
                    if( (midi.seq.getTracks())[0].get(contorEvent).getMessage().getStatus() == ShortMessage.NOTE_ON)
                      {
                      //se citeste octetul care corespunde unei anumite note
                      byte dataBytes=(midi.seq.getTracks())[0].get(contorEvent).getMessage().getMessage()[1];   
                      
                      if(dataBytes==24+12*0)midi.cp.c.Do[0].mousePressed(null);
                      if(dataBytes==26+12*0)midi.cp.c.Re[0].mousePressed(null);
                      if(dataBytes==28+12*0)midi.cp.c.Mi[0].mousePressed(null);
                      if(dataBytes==29+12*0)midi.cp.c.Fa[0].mousePressed(null);
                      if(dataBytes==31+12*0)midi.cp.c.Sol[0].mousePressed(null);
                      if(dataBytes==33+12*0)midi.cp.c.La[0].mousePressed(null);
                      if(dataBytes==35+12*0)midi.cp.c.Si[0].mousePressed(null);
                      if(dataBytes==25+12*0)midi.cp.c.Do_Re[0].mousePressed(null);
                      if(dataBytes==27+12*0)midi.cp.c.Re_Mi[0].mousePressed(null);
                      if(dataBytes==30+12*0)midi.cp.c.Fa_Sol[0].mousePressed(null);
                      if(dataBytes==32+12*0)midi.cp.c.Sol_La[0].mousePressed(null);
                      if(dataBytes==34+12*0)midi.cp.c.La_Si[0].mousePressed(null);
   
                      if(dataBytes==24+12*1)midi.cp.c.Do[1].mousePressed(null);
                      if(dataBytes==26+12*1)midi.cp.c.Re[1].mousePressed(null);
                      if(dataBytes==28+12*1)midi.cp.c.Mi[1].mousePressed(null);
                      if(dataBytes==29+12*1)midi.cp.c.Fa[1].mousePressed(null);
                      if(dataBytes==31+12*1)midi.cp.c.Sol[1].mousePressed(null);
                      if(dataBytes==33+12*1)midi.cp.c.La[1].mousePressed(null);
                      if(dataBytes==35+12*1)midi.cp.c.Si[1].mousePressed(null);
                      if(dataBytes==25+12*1)midi.cp.c.Do_Re[1].mousePressed(null);
                      if(dataBytes==27+12*1)midi.cp.c.Re_Mi[1].mousePressed(null);
                      if(dataBytes==30+12*1)midi.cp.c.Fa_Sol[1].mousePressed(null);
                      if(dataBytes==32+12*1)midi.cp.c.Sol_La[1].mousePressed(null);
                      if(dataBytes==34+12*1)midi.cp.c.La_Si[1].mousePressed(null);
                    
                      if(dataBytes==24+12*2)midi.cp.c.Do[2].mousePressed(null);
                      if(dataBytes==26+12*2)midi.cp.c.Re[2].mousePressed(null);
                      if(dataBytes==28+12*2)midi.cp.c.Mi[2].mousePressed(null);
                      if(dataBytes==29+12*2)midi.cp.c.Fa[2].mousePressed(null);
                      if(dataBytes==31+12*2)midi.cp.c.Sol[2].mousePressed(null);
                      if(dataBytes==33+12*2)midi.cp.c.La[2].mousePressed(null);
                      if(dataBytes==35+12*2)midi.cp.c.Si[2].mousePressed(null);
                      if(dataBytes==25+12*2)midi.cp.c.Do_Re[2].mousePressed(null);
                      if(dataBytes==27+12*2)midi.cp.c.Re_Mi[2].mousePressed(null);
                      if(dataBytes==30+12*2)midi.cp.c.Fa_Sol[2].mousePressed(null);
                      if(dataBytes==32+12*2)midi.cp.c.Sol_La[2].mousePressed(null);
                      if(dataBytes==34+12*2)midi.cp.c.La_Si[2].mousePressed(null);
                    
                      if(dataBytes==24+12*3)midi.cp.c.Do[3].mousePressed(null);
                      if(dataBytes==26+12*3)midi.cp.c.Re[3].mousePressed(null);
                      if(dataBytes==28+12*3)midi.cp.c.Mi[3].mousePressed(null);
                      if(dataBytes==29+12*3)midi.cp.c.Fa[3].mousePressed(null);
                      if(dataBytes==31+12*3)midi.cp.c.Sol[3].mousePressed(null);
                      if(dataBytes==33+12*3)midi.cp.c.La[3].mousePressed(null);
                      if(dataBytes==35+12*3)midi.cp.c.Si[3].mousePressed(null);
                      if(dataBytes==25+12*3)midi.cp.c.Do_Re[3].mousePressed(null);
                      if(dataBytes==27+12*3)midi.cp.c.Re_Mi[3].mousePressed(null);
                      if(dataBytes==30+12*3)midi.cp.c.Fa_Sol[3].mousePressed(null);
                      if(dataBytes==32+12*3)midi.cp.c.Sol_La[3].mousePressed(null);
                      if(dataBytes==34+12*3)midi.cp.c.La_Si[3].mousePressed(null);
   
                      if(dataBytes==24+12*4)midi.cp.c.Do[4].mousePressed(null);
                      if(dataBytes==26+12*4)midi.cp.c.Re[4].mousePressed(null);
                      if(dataBytes==28+12*4)midi.cp.c.Mi[4].mousePressed(null);
                      if(dataBytes==29+12*4)midi.cp.c.Fa[4].mousePressed(null);
                      if(dataBytes==31+12*4)midi.cp.c.Sol[4].mousePressed(null);
                      if(dataBytes==33+12*4)midi.cp.c.La[4].mousePressed(null);
                      if(dataBytes==35+12*4)midi.cp.c.Si[4].mousePressed(null);
                      if(dataBytes==25+12*4)midi.cp.c.Do_Re[4].mousePressed(null);
                      if(dataBytes==27+12*4)midi.cp.c.Re_Mi[4].mousePressed(null);
                      if(dataBytes==30+12*4)midi.cp.c.Fa_Sol[4].mousePressed(null);
                      if(dataBytes==32+12*4)midi.cp.c.Sol_La[4].mousePressed(null);
                      if(dataBytes==34+12*4)midi.cp.c.La_Si[4].mousePressed(null);
                    
                      if(dataBytes==24+12*5)midi.cp.c.DoMajor.mousePressed(null);
                      }
                      
                    contorEvent++;
                  }
                catch(ArrayIndexOutOfBoundsException aioobe)
                  {
                  }
                }
              }
  public void redeseneaza()
    {
                      if(midi.cp.c.Do[0].getCuloare()==Color.ORANGE)midi.cp.c.Do[0].mouseReleased(null);
                      if(midi.cp.c.Re[0].getCuloare()==Color.ORANGE)midi.cp.c.Re[0].mouseReleased(null);
                      if(midi.cp.c.Mi[0].getCuloare()==Color.ORANGE)midi.cp.c.Mi[0].mouseReleased(null);
                      if(midi.cp.c.Fa[0].getCuloare()==Color.ORANGE)midi.cp.c.Fa[0].mouseReleased(null);
                      if(midi.cp.c.Sol[0].getCuloare()==Color.ORANGE)midi.cp.c.Sol[0].mouseReleased(null);
                      if(midi.cp.c.La[0].getCuloare()==Color.ORANGE)midi.cp.c.La[0].mouseReleased(null);
                      if(midi.cp.c.Si[0].getCuloare()==Color.ORANGE)midi.cp.c.Si[0].mouseReleased(null);
                      if(midi.cp.c.Do_Re[0].getCuloare()==Color.ORANGE)midi.cp.c.Do_Re[0].mouseReleased(null);
                      if(midi.cp.c.Re_Mi[0].getCuloare()==Color.ORANGE)midi.cp.c.Re_Mi[0].mouseReleased(null);
                      if(midi.cp.c.Fa_Sol[0].getCuloare()==Color.ORANGE)midi.cp.c.Fa_Sol[0].mouseReleased(null);
                      if(midi.cp.c.Sol_La[0].getCuloare()==Color.ORANGE)midi.cp.c.Sol_La[0].mouseReleased(null);
                      if(midi.cp.c.La_Si[0].getCuloare()==Color.ORANGE)midi.cp.c.La_Si[0].mouseReleased(null);
                    
                      if(midi.cp.c.Do[1].getCuloare()==Color.ORANGE)midi.cp.c.Do[1].mouseReleased(null);
                      if(midi.cp.c.Re[1].getCuloare()==Color.ORANGE)midi.cp.c.Re[1].mouseReleased(null);
                      if(midi.cp.c.Mi[1].getCuloare()==Color.ORANGE)midi.cp.c.Mi[1].mouseReleased(null);
                      if(midi.cp.c.Fa[1].getCuloare()==Color.ORANGE)midi.cp.c.Fa[1].mouseReleased(null);
                      if(midi.cp.c.Sol[1].getCuloare()==Color.ORANGE)midi.cp.c.Sol[1].mouseReleased(null);
                      if(midi.cp.c.La[1].getCuloare()==Color.ORANGE)midi.cp.c.La[1].mouseReleased(null);
                      if(midi.cp.c.Si[1].getCuloare()==Color.ORANGE)midi.cp.c.Si[1].mouseReleased(null);
                      if(midi.cp.c.Do_Re[1].getCuloare()==Color.ORANGE)midi.cp.c.Do_Re[1].mouseReleased(null);
                      if(midi.cp.c.Re_Mi[1].getCuloare()==Color.ORANGE)midi.cp.c.Re_Mi[1].mouseReleased(null);
                      if(midi.cp.c.Fa_Sol[1].getCuloare()==Color.ORANGE)midi.cp.c.Fa_Sol[1].mouseReleased(null);
                      if(midi.cp.c.Sol_La[1].getCuloare()==Color.ORANGE)midi.cp.c.Sol_La[1].mouseReleased(null);
                      if(midi.cp.c.La_Si[1].getCuloare()==Color.ORANGE)midi.cp.c.La_Si[1].mouseReleased(null);
                    
                      if(midi.cp.c.Do[2].getCuloare()==Color.ORANGE)midi.cp.c.Do[2].mouseReleased(null);
                      if(midi.cp.c.Re[2].getCuloare()==Color.ORANGE)midi.cp.c.Re[2].mouseReleased(null);
                      if(midi.cp.c.Mi[2].getCuloare()==Color.ORANGE)midi.cp.c.Mi[2].mouseReleased(null);
                      if(midi.cp.c.Fa[2].getCuloare()==Color.ORANGE)midi.cp.c.Fa[2].mouseReleased(null);
                      if(midi.cp.c.Sol[2].getCuloare()==Color.ORANGE)midi.cp.c.Sol[2].mouseReleased(null);
                      if(midi.cp.c.La[2].getCuloare()==Color.ORANGE)midi.cp.c.La[2].mouseReleased(null);
                      if(midi.cp.c.Si[2].getCuloare()==Color.ORANGE)midi.cp.c.Si[2].mouseReleased(null);
                      if(midi.cp.c.Do_Re[2].getCuloare()==Color.ORANGE)midi.cp.c.Do_Re[2].mouseReleased(null);
                      if(midi.cp.c.Re_Mi[2].getCuloare()==Color.ORANGE)midi.cp.c.Re_Mi[2].mouseReleased(null);
                      if(midi.cp.c.Fa_Sol[2].getCuloare()==Color.ORANGE)midi.cp.c.Fa_Sol[2].mouseReleased(null);
                      if(midi.cp.c.Sol_La[2].getCuloare()==Color.ORANGE)midi.cp.c.Sol_La[2].mouseReleased(null);
                      if(midi.cp.c.La_Si[2].getCuloare()==Color.ORANGE)midi.cp.c.La_Si[2].mouseReleased(null);
                    
                      if(midi.cp.c.Do[3].getCuloare()==Color.ORANGE)midi.cp.c.Do[3].mouseReleased(null);
                      if(midi.cp.c.Re[3].getCuloare()==Color.ORANGE)midi.cp.c.Re[3].mouseReleased(null);
                      if(midi.cp.c.Mi[3].getCuloare()==Color.ORANGE)midi.cp.c.Mi[3].mouseReleased(null);
                      if(midi.cp.c.Fa[3].getCuloare()==Color.ORANGE)midi.cp.c.Fa[3].mouseReleased(null);
                      if(midi.cp.c.Sol[3].getCuloare()==Color.ORANGE)midi.cp.c.Sol[3].mouseReleased(null);
                      if(midi.cp.c.La[3].getCuloare()==Color.ORANGE)midi.cp.c.La[3].mouseReleased(null);
                      if(midi.cp.c.Si[3].getCuloare()==Color.ORANGE)midi.cp.c.Si[3].mouseReleased(null);
                      if(midi.cp.c.Do_Re[3].getCuloare()==Color.ORANGE)midi.cp.c.Do_Re[3].mouseReleased(null);
                      if(midi.cp.c.Re_Mi[3].getCuloare()==Color.ORANGE)midi.cp.c.Re_Mi[3].mouseReleased(null);
                      if(midi.cp.c.Fa_Sol[3].getCuloare()==Color.ORANGE)midi.cp.c.Fa_Sol[3].mouseReleased(null);
                      if(midi.cp.c.Sol_La[3].getCuloare()==Color.ORANGE)midi.cp.c.Sol_La[3].mouseReleased(null);
                      if(midi.cp.c.La_Si[3].getCuloare()==Color.ORANGE)midi.cp.c.La_Si[3].mouseReleased(null);
                    
                      if(midi.cp.c.Do[4].getCuloare()==Color.ORANGE)midi.cp.c.Do[4].mouseReleased(null);
                      if(midi.cp.c.Re[4].getCuloare()==Color.ORANGE)midi.cp.c.Re[4].mouseReleased(null);
                      if(midi.cp.c.Mi[4].getCuloare()==Color.ORANGE)midi.cp.c.Mi[4].mouseReleased(null);
                      if(midi.cp.c.Fa[4].getCuloare()==Color.ORANGE)midi.cp.c.Fa[4].mouseReleased(null);
                      if(midi.cp.c.Sol[4].getCuloare()==Color.ORANGE)midi.cp.c.Sol[4].mouseReleased(null);
                      if(midi.cp.c.La[4].getCuloare()==Color.ORANGE)midi.cp.c.La[4].mouseReleased(null);
                      if(midi.cp.c.Si[4].getCuloare()==Color.ORANGE)midi.cp.c.Si[4].mouseReleased(null);
                      if(midi.cp.c.Do_Re[4].getCuloare()==Color.ORANGE)midi.cp.c.Do_Re[4].mouseReleased(null);
                      if(midi.cp.c.Re_Mi[4].getCuloare()==Color.ORANGE)midi.cp.c.Re_Mi[4].mouseReleased(null);
                      if(midi.cp.c.Fa_Sol[4].getCuloare()==Color.ORANGE)midi.cp.c.Fa_Sol[4].mouseReleased(null);
                      if(midi.cp.c.Sol_La[4].getCuloare()==Color.ORANGE)midi.cp.c.Sol_La[4].mouseReleased(null);
                      if(midi.cp.c.La_Si[4].getCuloare()==Color.ORANGE)midi.cp.c.La_Si[4].mouseReleased(null);
                    
                      if(midi.cp.c.DoMajor.getCuloare()==Color.ORANGE)midi.cp.c.DoMajor.mouseReleased(null);
                      
    }
  }
          
