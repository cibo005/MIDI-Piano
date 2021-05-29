
import javax.sound.midi.MidiEvent;
class MidiRecordThread extends Thread
  {
  private Midi midi;
  
  private boolean doKeyOnce[]={false,false,false,false,false};
  private boolean reKeyOnce[]={false,false,false,false,false};
  private boolean miKeyOnce[]={false,false,false,false,false};
  private boolean faKeyOnce[]={false,false,false,false,false};
  private boolean solKeyOnce[]={false,false,false,false,false};
  private boolean laKeyOnce[]={false,false,false,false,false};
  private boolean siKeyOnce[]={false,false,false,false,false};
  private boolean do_reKeyOnce[]={false,false,false,false,false};
  private boolean re_miKeyOnce[]={false,false,false,false,false};
  private boolean fa_solKeyOnce[]={false,false,false,false,false};
  private boolean sol_laKeyOnce[]={false,false,false,false,false};
  private boolean la_siKeyOnce[]={false,false,false,false,false};
  private boolean doMajorKeyOnce=false;
  
  public MidiRecordThread(Midi midi)
    {
    this.midi=midi;
    }
    
  public void run()
    {
    while(!midi.cp.pause || !midi.cp.stop)
      {
      midi.startTick++;
      try{Thread.sleep(25);}catch(InterruptedException ie){};
      
      if(midi.cp.c.Do[0].getKeyPressed() && !doKeyOnce[0]){midi.track.add(new MidiEvent(midi.cp.c.Do[0].getOn(),midi.startTick+midi.tickLength)); doKeyOnce[0]=true;}
      if(midi.cp.c.Re[0].getKeyPressed() && !reKeyOnce[0]){midi.track.add(new MidiEvent(midi.cp.c.Re[0].getOn(),midi.startTick+midi.tickLength)); reKeyOnce[0]=true;}
      if(midi.cp.c.Mi[0].getKeyPressed() && !miKeyOnce[0]){midi.track.add(new MidiEvent(midi.cp.c.Mi[0].getOn(),midi.startTick+midi.tickLength)); miKeyOnce[0]=true;}
      if(midi.cp.c.Fa[0].getKeyPressed() && !faKeyOnce[0]){midi.track.add(new MidiEvent(midi.cp.c.Fa[0].getOn(),midi.startTick+midi.tickLength)); faKeyOnce[0]=true;}
      if(midi.cp.c.Sol[0].getKeyPressed() && !solKeyOnce[0]){midi.track.add(new MidiEvent(midi.cp.c.Sol[0].getOn(),midi.startTick+midi.tickLength)); solKeyOnce[0]=true;}
      if(midi.cp.c.La[0].getKeyPressed() && !laKeyOnce[0]){midi.track.add(new MidiEvent(midi.cp.c.La[0].getOn(),midi.startTick+midi.tickLength)); laKeyOnce[0]=true;}
      if(midi.cp.c.Si[0].getKeyPressed() && !siKeyOnce[0]){midi.track.add(new MidiEvent(midi.cp.c.Si[0].getOn(),midi.startTick+midi.tickLength)); siKeyOnce[0]=true;}
      if(midi.cp.c.Do_Re[0].getKeyPressed() && !do_reKeyOnce[0]){midi.track.add(new MidiEvent(midi.cp.c.Do_Re[0].getOn(),midi.startTick+midi.tickLength)); do_reKeyOnce[0]=true;}
      if(midi.cp.c.Re_Mi[0].getKeyPressed() && !re_miKeyOnce[0]){midi.track.add(new MidiEvent(midi.cp.c.Re_Mi[0].getOn(),midi.startTick+midi.tickLength)); re_miKeyOnce[0]=true;}
      if(midi.cp.c.Fa_Sol[0].getKeyPressed() && !fa_solKeyOnce[0]){midi.track.add(new MidiEvent(midi.cp.c.Fa_Sol[0].getOn(),midi.startTick+midi.tickLength)); fa_solKeyOnce[0]=true;}
      if(midi.cp.c.Sol_La[0].getKeyPressed() && !sol_laKeyOnce[0]){midi.track.add(new MidiEvent(midi.cp.c.Sol_La[0].getOn(),midi.startTick+midi.tickLength)); sol_laKeyOnce[0]=true;}
      if(midi.cp.c.La_Si[0].getKeyPressed() && !la_siKeyOnce[0]){midi.track.add(new MidiEvent(midi.cp.c.La_Si[0].getOn(),midi.startTick+midi.tickLength)); la_siKeyOnce[0]=true;}
      
      if(midi.cp.c.Do[1].getKeyPressed() && !doKeyOnce[1]){midi.track.add(new MidiEvent(midi.cp.c.Do[1].getOn(),midi.startTick+midi.tickLength)); doKeyOnce[1]=true;}
      if(midi.cp.c.Re[1].getKeyPressed() && !reKeyOnce[1]){midi.track.add(new MidiEvent(midi.cp.c.Re[1].getOn(),midi.startTick+midi.tickLength)); reKeyOnce[1]=true;}
      if(midi.cp.c.Mi[1].getKeyPressed() && !miKeyOnce[1]){midi.track.add(new MidiEvent(midi.cp.c.Mi[1].getOn(),midi.startTick+midi.tickLength)); miKeyOnce[1]=true;}
      if(midi.cp.c.Fa[1].getKeyPressed() && !faKeyOnce[1]){midi.track.add(new MidiEvent(midi.cp.c.Fa[1].getOn(),midi.startTick+midi.tickLength)); faKeyOnce[1]=true;}
      if(midi.cp.c.Sol[1].getKeyPressed() && !solKeyOnce[1]){midi.track.add(new MidiEvent(midi.cp.c.Sol[1].getOn(),midi.startTick+midi.tickLength)); solKeyOnce[1]=true;}
      if(midi.cp.c.La[1].getKeyPressed() && !laKeyOnce[1]){midi.track.add(new MidiEvent(midi.cp.c.La[1].getOn(),midi.startTick+midi.tickLength)); laKeyOnce[1]=true;}
      if(midi.cp.c.Si[1].getKeyPressed() && !siKeyOnce[1]){midi.track.add(new MidiEvent(midi.cp.c.Si[1].getOn(),midi.startTick+midi.tickLength)); siKeyOnce[1]=true;}
      if(midi.cp.c.Do_Re[1].getKeyPressed() && !do_reKeyOnce[1]){midi.track.add(new MidiEvent(midi.cp.c.Do_Re[1].getOn(),midi.startTick+midi.tickLength)); do_reKeyOnce[1]=true;}
      if(midi.cp.c.Re_Mi[1].getKeyPressed() && !re_miKeyOnce[1]){midi.track.add(new MidiEvent(midi.cp.c.Re_Mi[1].getOn(),midi.startTick+midi.tickLength)); re_miKeyOnce[1]=true;}
      if(midi.cp.c.Fa_Sol[1].getKeyPressed() && !fa_solKeyOnce[1]){midi.track.add(new MidiEvent(midi.cp.c.Fa_Sol[1].getOn(),midi.startTick+midi.tickLength)); fa_solKeyOnce[1]=true;}
      if(midi.cp.c.Sol_La[1].getKeyPressed() && !sol_laKeyOnce[1]){midi.track.add(new MidiEvent(midi.cp.c.Sol_La[1].getOn(),midi.startTick+midi.tickLength)); sol_laKeyOnce[1]=true;}
      if(midi.cp.c.La_Si[1].getKeyPressed() && !la_siKeyOnce[1]){midi.track.add(new MidiEvent(midi.cp.c.La_Si[1].getOn(),midi.startTick+midi.tickLength)); la_siKeyOnce[1]=true;}
      
      if(midi.cp.c.Do[2].getKeyPressed() && !doKeyOnce[2]){midi.track.add(new MidiEvent(midi.cp.c.Do[2].getOn(),midi.startTick+midi.tickLength)); doKeyOnce[2]=true;}
      if(midi.cp.c.Re[2].getKeyPressed() && !reKeyOnce[2]){midi.track.add(new MidiEvent(midi.cp.c.Re[2].getOn(),midi.startTick+midi.tickLength)); reKeyOnce[2]=true;}
      if(midi.cp.c.Mi[2].getKeyPressed() && !miKeyOnce[2]){midi.track.add(new MidiEvent(midi.cp.c.Mi[2].getOn(),midi.startTick+midi.tickLength)); miKeyOnce[2]=true;}
      if(midi.cp.c.Fa[2].getKeyPressed() && !faKeyOnce[2]){midi.track.add(new MidiEvent(midi.cp.c.Fa[2].getOn(),midi.startTick+midi.tickLength)); faKeyOnce[2]=true;}
      if(midi.cp.c.Sol[2].getKeyPressed() && !solKeyOnce[2]){midi.track.add(new MidiEvent(midi.cp.c.Sol[2].getOn(),midi.startTick+midi.tickLength)); solKeyOnce[2]=true;}
      if(midi.cp.c.La[2].getKeyPressed() && !laKeyOnce[2]){midi.track.add(new MidiEvent(midi.cp.c.La[2].getOn(),midi.startTick+midi.tickLength)); laKeyOnce[2]=true;}
      if(midi.cp.c.Si[2].getKeyPressed() && !siKeyOnce[2]){midi.track.add(new MidiEvent(midi.cp.c.Si[2].getOn(),midi.startTick+midi.tickLength)); siKeyOnce[2]=true;}
      if(midi.cp.c.Do_Re[2].getKeyPressed() && !do_reKeyOnce[2]){midi.track.add(new MidiEvent(midi.cp.c.Do_Re[2].getOn(),midi.startTick+midi.tickLength)); do_reKeyOnce[2]=true;}
      if(midi.cp.c.Re_Mi[2].getKeyPressed() && !re_miKeyOnce[2]){midi.track.add(new MidiEvent(midi.cp.c.Re_Mi[2].getOn(),midi.startTick+midi.tickLength)); re_miKeyOnce[2]=true;}
      if(midi.cp.c.Fa_Sol[2].getKeyPressed() && !fa_solKeyOnce[2]){midi.track.add(new MidiEvent(midi.cp.c.Fa_Sol[2].getOn(),midi.startTick+midi.tickLength)); fa_solKeyOnce[2]=true;}
      if(midi.cp.c.Sol_La[2].getKeyPressed() && !sol_laKeyOnce[2]){midi.track.add(new MidiEvent(midi.cp.c.Sol_La[2].getOn(),midi.startTick+midi.tickLength)); sol_laKeyOnce[2]=true;}
      if(midi.cp.c.La_Si[2].getKeyPressed() && !la_siKeyOnce[2]){midi.track.add(new MidiEvent(midi.cp.c.La_Si[2].getOn(),midi.startTick+midi.tickLength)); la_siKeyOnce[2]=true;}
      
      if(midi.cp.c.Do[3].getKeyPressed() && !doKeyOnce[3]){midi.track.add(new MidiEvent(midi.cp.c.Do[3].getOn(),midi.startTick+midi.tickLength)); doKeyOnce[3]=true;}
      if(midi.cp.c.Re[3].getKeyPressed() && !reKeyOnce[3]){midi.track.add(new MidiEvent(midi.cp.c.Re[3].getOn(),midi.startTick+midi.tickLength)); reKeyOnce[3]=true;}
      if(midi.cp.c.Mi[3].getKeyPressed() && !miKeyOnce[3]){midi.track.add(new MidiEvent(midi.cp.c.Mi[3].getOn(),midi.startTick+midi.tickLength)); miKeyOnce[3]=true;}
      if(midi.cp.c.Fa[3].getKeyPressed() && !faKeyOnce[3]){midi.track.add(new MidiEvent(midi.cp.c.Fa[3].getOn(),midi.startTick+midi.tickLength)); faKeyOnce[3]=true;}
      if(midi.cp.c.Sol[3].getKeyPressed() && !solKeyOnce[3]){midi.track.add(new MidiEvent(midi.cp.c.Sol[3].getOn(),midi.startTick+midi.tickLength)); solKeyOnce[3]=true;}
      if(midi.cp.c.La[3].getKeyPressed() && !laKeyOnce[3]){midi.track.add(new MidiEvent(midi.cp.c.La[3].getOn(),midi.startTick+midi.tickLength)); laKeyOnce[3]=true;}
      if(midi.cp.c.Si[3].getKeyPressed() && !siKeyOnce[3]){midi.track.add(new MidiEvent(midi.cp.c.Si[3].getOn(),midi.startTick+midi.tickLength)); siKeyOnce[3]=true;}
      if(midi.cp.c.Do_Re[3].getKeyPressed() && !do_reKeyOnce[3]){midi.track.add(new MidiEvent(midi.cp.c.Do_Re[3].getOn(),midi.startTick+midi.tickLength)); do_reKeyOnce[3]=true;}
      if(midi.cp.c.Re_Mi[3].getKeyPressed() && !re_miKeyOnce[3]){midi.track.add(new MidiEvent(midi.cp.c.Re_Mi[3].getOn(),midi.startTick+midi.tickLength)); re_miKeyOnce[3]=true;}
      if(midi.cp.c.Fa_Sol[3].getKeyPressed() && !fa_solKeyOnce[3]){midi.track.add(new MidiEvent(midi.cp.c.Fa_Sol[3].getOn(),midi.startTick+midi.tickLength)); fa_solKeyOnce[3]=true;}
      if(midi.cp.c.Sol_La[3].getKeyPressed() && !sol_laKeyOnce[3]){midi.track.add(new MidiEvent(midi.cp.c.Sol_La[3].getOn(),midi.startTick+midi.tickLength)); sol_laKeyOnce[3]=true;}
      if(midi.cp.c.La_Si[3].getKeyPressed() && !la_siKeyOnce[3]){midi.track.add(new MidiEvent(midi.cp.c.La_Si[3].getOn(),midi.startTick+midi.tickLength)); la_siKeyOnce[3]=true;}
      
      if(midi.cp.c.Do[4].getKeyPressed() && !doKeyOnce[4]){midi.track.add(new MidiEvent(midi.cp.c.Do[4].getOn(),midi.startTick+midi.tickLength)); doKeyOnce[4]=true;}
      if(midi.cp.c.Re[4].getKeyPressed() && !reKeyOnce[4]){midi.track.add(new MidiEvent(midi.cp.c.Re[4].getOn(),midi.startTick+midi.tickLength)); reKeyOnce[4]=true;}
      if(midi.cp.c.Mi[4].getKeyPressed() && !miKeyOnce[4]){midi.track.add(new MidiEvent(midi.cp.c.Mi[4].getOn(),midi.startTick+midi.tickLength)); miKeyOnce[4]=true;}
      if(midi.cp.c.Fa[4].getKeyPressed() && !faKeyOnce[4]){midi.track.add(new MidiEvent(midi.cp.c.Fa[4].getOn(),midi.startTick+midi.tickLength)); faKeyOnce[4]=true;}
      if(midi.cp.c.Sol[4].getKeyPressed() && !solKeyOnce[4]){midi.track.add(new MidiEvent(midi.cp.c.Sol[4].getOn(),midi.startTick+midi.tickLength)); solKeyOnce[4]=true;}
      if(midi.cp.c.La[4].getKeyPressed() && !laKeyOnce[4]){midi.track.add(new MidiEvent(midi.cp.c.La[4].getOn(),midi.startTick+midi.tickLength)); laKeyOnce[4]=true;}
      if(midi.cp.c.Si[4].getKeyPressed() && !siKeyOnce[4]){midi.track.add(new MidiEvent(midi.cp.c.Si[4].getOn(),midi.startTick+midi.tickLength)); siKeyOnce[4]=true;}
      if(midi.cp.c.Do_Re[4].getKeyPressed() && !do_reKeyOnce[4]){midi.track.add(new MidiEvent(midi.cp.c.Do_Re[4].getOn(),midi.startTick+midi.tickLength)); do_reKeyOnce[4]=true;}
      if(midi.cp.c.Re_Mi[4].getKeyPressed() && !re_miKeyOnce[4]){midi.track.add(new MidiEvent(midi.cp.c.Re_Mi[4].getOn(),midi.startTick+midi.tickLength)); re_miKeyOnce[4]=true;}
      if(midi.cp.c.Fa_Sol[4].getKeyPressed() && !fa_solKeyOnce[4]){midi.track.add(new MidiEvent(midi.cp.c.Fa_Sol[4].getOn(),midi.startTick+midi.tickLength)); fa_solKeyOnce[4]=true;}
      if(midi.cp.c.Sol_La[4].getKeyPressed() && !sol_laKeyOnce[4]){midi.track.add(new MidiEvent(midi.cp.c.Sol_La[4].getOn(),midi.startTick+midi.tickLength)); sol_laKeyOnce[4]=true;}
      if(midi.cp.c.La_Si[4].getKeyPressed() && !la_siKeyOnce[4]){midi.track.add(new MidiEvent(midi.cp.c.La_Si[4].getOn(),midi.startTick+midi.tickLength)); la_siKeyOnce[4]=true;}
      
      if(midi.cp.c.DoMajor.getKeyPressed() && !doMajorKeyOnce){midi.track.add(new MidiEvent(midi.cp.c.DoMajor.getOn(),midi.startTick+midi.tickLength)); doMajorKeyOnce=true;}
      
      
      if(midi.cp.c.Do[0].getKeyReleased() && doKeyOnce[0]){midi.track.add(new MidiEvent(midi.cp.c.Do[0].getOff(),midi.startTick+midi.tickLength)); doKeyOnce[0]=false;}
      if(midi.cp.c.Re[0].getKeyReleased() && reKeyOnce[0]){midi.track.add(new MidiEvent(midi.cp.c.Re[0].getOff(),midi.startTick+midi.tickLength)); reKeyOnce[0]=false;}
      if(midi.cp.c.Mi[0].getKeyReleased() && miKeyOnce[0]){midi.track.add(new MidiEvent(midi.cp.c.Mi[0].getOff(),midi.startTick+midi.tickLength)); miKeyOnce[0]=false;}
      if(midi.cp.c.Fa[0].getKeyReleased() && faKeyOnce[0]){midi.track.add(new MidiEvent(midi.cp.c.Fa[0].getOff(),midi.startTick+midi.tickLength)); faKeyOnce[0]=false;}
      if(midi.cp.c.Sol[0].getKeyReleased() && solKeyOnce[0]){midi.track.add(new MidiEvent(midi.cp.c.Sol[0].getOff(),midi.startTick+midi.tickLength)); solKeyOnce[0]=false;}
      if(midi.cp.c.La[0].getKeyReleased() && laKeyOnce[0]){midi.track.add(new MidiEvent(midi.cp.c.La[0].getOff(),midi.startTick+midi.tickLength)); laKeyOnce[0]=false;}
      if(midi.cp.c.Si[0].getKeyReleased() && siKeyOnce[0]){midi.track.add(new MidiEvent(midi.cp.c.Si[0].getOff(),midi.startTick+midi.tickLength)); siKeyOnce[0]=false;}
      if(midi.cp.c.Do_Re[0].getKeyReleased() && do_reKeyOnce[0]){midi.track.add(new MidiEvent(midi.cp.c.Do_Re[0].getOff(),midi.startTick+midi.tickLength)); do_reKeyOnce[0]=false;}
      if(midi.cp.c.Re_Mi[0].getKeyReleased() && re_miKeyOnce[0]){midi.track.add(new MidiEvent(midi.cp.c.Re_Mi[0].getOff(),midi.startTick+midi.tickLength)); re_miKeyOnce[0]=false;}
      if(midi.cp.c.Fa_Sol[0].getKeyReleased() && fa_solKeyOnce[0]){midi.track.add(new MidiEvent(midi.cp.c.Fa_Sol[0].getOff(),midi.startTick+midi.tickLength)); fa_solKeyOnce[0]=false;}
      if(midi.cp.c.Sol_La[0].getKeyReleased() && sol_laKeyOnce[0]){midi.track.add(new MidiEvent(midi.cp.c.Sol_La[0].getOff(),midi.startTick+midi.tickLength)); sol_laKeyOnce[0]=false;}
      if(midi.cp.c.La_Si[0].getKeyReleased() && la_siKeyOnce[0]){midi.track.add(new MidiEvent(midi.cp.c.La_Si[0].getOff(),midi.startTick+midi.tickLength)); la_siKeyOnce[0]=false;}
      
      if(midi.cp.c.Do[1].getKeyReleased() && doKeyOnce[1]){midi.track.add(new MidiEvent(midi.cp.c.Do[1].getOff(),midi.startTick+midi.tickLength)); doKeyOnce[1]=false;}
      if(midi.cp.c.Re[1].getKeyReleased() && reKeyOnce[1]){midi.track.add(new MidiEvent(midi.cp.c.Re[1].getOff(),midi.startTick+midi.tickLength)); reKeyOnce[1]=false;}
      if(midi.cp.c.Mi[1].getKeyReleased() && miKeyOnce[1]){midi.track.add(new MidiEvent(midi.cp.c.Mi[1].getOff(),midi.startTick+midi.tickLength)); miKeyOnce[1]=false;}
      if(midi.cp.c.Fa[1].getKeyReleased() && faKeyOnce[1]){midi.track.add(new MidiEvent(midi.cp.c.Fa[1].getOff(),midi.startTick+midi.tickLength)); faKeyOnce[1]=false;}
      if(midi.cp.c.Sol[1].getKeyReleased() && solKeyOnce[1]){midi.track.add(new MidiEvent(midi.cp.c.Sol[1].getOff(),midi.startTick+midi.tickLength)); solKeyOnce[1]=false;}
      if(midi.cp.c.La[1].getKeyReleased() && laKeyOnce[1]){midi.track.add(new MidiEvent(midi.cp.c.La[1].getOff(),midi.startTick+midi.tickLength)); laKeyOnce[1]=false;}
      if(midi.cp.c.Si[1].getKeyReleased() && siKeyOnce[1]){midi.track.add(new MidiEvent(midi.cp.c.Si[1].getOff(),midi.startTick+midi.tickLength)); siKeyOnce[1]=false;}
      if(midi.cp.c.Do_Re[1].getKeyReleased() && do_reKeyOnce[1]){midi.track.add(new MidiEvent(midi.cp.c.Do_Re[1].getOff(),midi.startTick+midi.tickLength)); do_reKeyOnce[1]=false;}
      if(midi.cp.c.Re_Mi[1].getKeyReleased() && re_miKeyOnce[1]){midi.track.add(new MidiEvent(midi.cp.c.Re_Mi[1].getOff(),midi.startTick+midi.tickLength)); re_miKeyOnce[1]=false;}
      if(midi.cp.c.Fa_Sol[1].getKeyReleased() && fa_solKeyOnce[1]){midi.track.add(new MidiEvent(midi.cp.c.Fa_Sol[1].getOff(),midi.startTick+midi.tickLength)); fa_solKeyOnce[1]=false;}
      if(midi.cp.c.Sol_La[1].getKeyReleased() && sol_laKeyOnce[1]){midi.track.add(new MidiEvent(midi.cp.c.Sol_La[1].getOff(),midi.startTick+midi.tickLength)); sol_laKeyOnce[1]=false;}
      if(midi.cp.c.La_Si[1].getKeyReleased() && la_siKeyOnce[1]){midi.track.add(new MidiEvent(midi.cp.c.La_Si[1].getOff(),midi.startTick+midi.tickLength)); la_siKeyOnce[1]=false;}
      
      if(midi.cp.c.Do[2].getKeyReleased() && doKeyOnce[2]){midi.track.add(new MidiEvent(midi.cp.c.Do[2].getOff(),midi.startTick+midi.tickLength)); doKeyOnce[2]=false;}
      if(midi.cp.c.Re[2].getKeyReleased() && reKeyOnce[2]){midi.track.add(new MidiEvent(midi.cp.c.Re[2].getOff(),midi.startTick+midi.tickLength)); reKeyOnce[2]=false;}
      if(midi.cp.c.Mi[2].getKeyReleased() && miKeyOnce[2]){midi.track.add(new MidiEvent(midi.cp.c.Mi[2].getOff(),midi.startTick+midi.tickLength)); miKeyOnce[2]=false;}
      if(midi.cp.c.Fa[2].getKeyReleased() && faKeyOnce[2]){midi.track.add(new MidiEvent(midi.cp.c.Fa[2].getOff(),midi.startTick+midi.tickLength)); faKeyOnce[2]=false;}
      if(midi.cp.c.Sol[2].getKeyReleased() && solKeyOnce[2]){midi.track.add(new MidiEvent(midi.cp.c.Sol[2].getOff(),midi.startTick+midi.tickLength)); solKeyOnce[2]=false;}
      if(midi.cp.c.La[2].getKeyReleased() && laKeyOnce[2]){midi.track.add(new MidiEvent(midi.cp.c.La[2].getOff(),midi.startTick+midi.tickLength)); laKeyOnce[2]=false;}
      if(midi.cp.c.Si[2].getKeyReleased() && siKeyOnce[2]){midi.track.add(new MidiEvent(midi.cp.c.Si[2].getOff(),midi.startTick+midi.tickLength)); siKeyOnce[2]=false;}
      if(midi.cp.c.Do_Re[2].getKeyReleased() && do_reKeyOnce[2]){midi.track.add(new MidiEvent(midi.cp.c.Do_Re[2].getOff(),midi.startTick+midi.tickLength)); do_reKeyOnce[2]=false;}
      if(midi.cp.c.Re_Mi[2].getKeyReleased() && re_miKeyOnce[2]){midi.track.add(new MidiEvent(midi.cp.c.Re_Mi[2].getOff(),midi.startTick+midi.tickLength)); re_miKeyOnce[2]=false;}
      if(midi.cp.c.Fa_Sol[2].getKeyReleased() && fa_solKeyOnce[2]){midi.track.add(new MidiEvent(midi.cp.c.Fa_Sol[2].getOff(),midi.startTick+midi.tickLength)); fa_solKeyOnce[2]=false;}
      if(midi.cp.c.Sol_La[2].getKeyReleased() && sol_laKeyOnce[2]){midi.track.add(new MidiEvent(midi.cp.c.Sol_La[2].getOff(),midi.startTick+midi.tickLength)); sol_laKeyOnce[2]=false;}
      if(midi.cp.c.La_Si[2].getKeyReleased() && la_siKeyOnce[2]){midi.track.add(new MidiEvent(midi.cp.c.La_Si[2].getOff(),midi.startTick+midi.tickLength)); la_siKeyOnce[2]=false;}
      
      if(midi.cp.c.Do[3].getKeyReleased() && doKeyOnce[3]){midi.track.add(new MidiEvent(midi.cp.c.Do[3].getOff(),midi.startTick+midi.tickLength)); doKeyOnce[3]=false;}
      if(midi.cp.c.Re[3].getKeyReleased() && reKeyOnce[3]){midi.track.add(new MidiEvent(midi.cp.c.Re[3].getOff(),midi.startTick+midi.tickLength)); reKeyOnce[3]=false;}
      if(midi.cp.c.Mi[3].getKeyReleased() && miKeyOnce[3]){midi.track.add(new MidiEvent(midi.cp.c.Mi[3].getOff(),midi.startTick+midi.tickLength)); miKeyOnce[3]=false;}
      if(midi.cp.c.Fa[3].getKeyReleased() && faKeyOnce[3]){midi.track.add(new MidiEvent(midi.cp.c.Fa[3].getOff(),midi.startTick+midi.tickLength)); faKeyOnce[3]=false;}
      if(midi.cp.c.Sol[3].getKeyReleased() && solKeyOnce[3]){midi.track.add(new MidiEvent(midi.cp.c.Sol[3].getOff(),midi.startTick+midi.tickLength)); solKeyOnce[3]=false;}
      if(midi.cp.c.La[3].getKeyReleased() && laKeyOnce[3]){midi.track.add(new MidiEvent(midi.cp.c.La[3].getOff(),midi.startTick+midi.tickLength)); laKeyOnce[3]=false;}
      if(midi.cp.c.Si[3].getKeyReleased() && siKeyOnce[3]){midi.track.add(new MidiEvent(midi.cp.c.Si[3].getOff(),midi.startTick+midi.tickLength)); siKeyOnce[3]=false;}
      if(midi.cp.c.Do_Re[3].getKeyReleased() && do_reKeyOnce[3]){midi.track.add(new MidiEvent(midi.cp.c.Do_Re[3].getOff(),midi.startTick+midi.tickLength)); do_reKeyOnce[3]=false;}
      if(midi.cp.c.Re_Mi[3].getKeyReleased() && re_miKeyOnce[3]){midi.track.add(new MidiEvent(midi.cp.c.Re_Mi[3].getOff(),midi.startTick+midi.tickLength)); re_miKeyOnce[3]=false;}
      if(midi.cp.c.Fa_Sol[3].getKeyReleased() && fa_solKeyOnce[3]){midi.track.add(new MidiEvent(midi.cp.c.Fa_Sol[3].getOff(),midi.startTick+midi.tickLength)); fa_solKeyOnce[3]=false;}
      if(midi.cp.c.Sol_La[3].getKeyReleased() && sol_laKeyOnce[3]){midi.track.add(new MidiEvent(midi.cp.c.Sol_La[3].getOff(),midi.startTick+midi.tickLength)); sol_laKeyOnce[3]=false;}
      if(midi.cp.c.La_Si[3].getKeyReleased() && la_siKeyOnce[3]){midi.track.add(new MidiEvent(midi.cp.c.La_Si[3].getOff(),midi.startTick+midi.tickLength)); la_siKeyOnce[3]=false;}
      
      if(midi.cp.c.Do[4].getKeyReleased() && doKeyOnce[4]){midi.track.add(new MidiEvent(midi.cp.c.Do[4].getOff(),midi.startTick+midi.tickLength)); doKeyOnce[4]=false;}
      if(midi.cp.c.Re[4].getKeyReleased() && reKeyOnce[4]){midi.track.add(new MidiEvent(midi.cp.c.Re[4].getOff(),midi.startTick+midi.tickLength)); reKeyOnce[4]=false;}
      if(midi.cp.c.Mi[4].getKeyReleased() && miKeyOnce[4]){midi.track.add(new MidiEvent(midi.cp.c.Mi[4].getOff(),midi.startTick+midi.tickLength)); miKeyOnce[4]=false;}
      if(midi.cp.c.Fa[4].getKeyReleased() && faKeyOnce[4]){midi.track.add(new MidiEvent(midi.cp.c.Fa[4].getOff(),midi.startTick+midi.tickLength)); faKeyOnce[4]=false;}
      if(midi.cp.c.Sol[4].getKeyReleased() && solKeyOnce[4]){midi.track.add(new MidiEvent(midi.cp.c.Sol[4].getOff(),midi.startTick+midi.tickLength)); solKeyOnce[4]=false;}
      if(midi.cp.c.La[4].getKeyReleased() && laKeyOnce[4]){midi.track.add(new MidiEvent(midi.cp.c.La[4].getOff(),midi.startTick+midi.tickLength)); laKeyOnce[4]=false;}
      if(midi.cp.c.Si[4].getKeyReleased() && siKeyOnce[4]){midi.track.add(new MidiEvent(midi.cp.c.Si[4].getOff(),midi.startTick+midi.tickLength)); siKeyOnce[4]=false;}
      if(midi.cp.c.Do_Re[4].getKeyReleased() && do_reKeyOnce[4]){midi.track.add(new MidiEvent(midi.cp.c.Do_Re[4].getOff(),midi.startTick+midi.tickLength)); do_reKeyOnce[4]=false;}
      if(midi.cp.c.Re_Mi[4].getKeyReleased() && re_miKeyOnce[4]){midi.track.add(new MidiEvent(midi.cp.c.Re_Mi[4].getOff(),midi.startTick+midi.tickLength)); re_miKeyOnce[4]=false;}
      if(midi.cp.c.Fa_Sol[4].getKeyReleased() && fa_solKeyOnce[4]){midi.track.add(new MidiEvent(midi.cp.c.Fa_Sol[4].getOff(),midi.startTick+midi.tickLength)); fa_solKeyOnce[4]=false;}
      if(midi.cp.c.Sol_La[4].getKeyReleased() && sol_laKeyOnce[4]){midi.track.add(new MidiEvent(midi.cp.c.Sol_La[4].getOff(),midi.startTick+midi.tickLength)); sol_laKeyOnce[4]=false;}
      if(midi.cp.c.La_Si[4].getKeyReleased() && la_siKeyOnce[4]){midi.track.add(new MidiEvent(midi.cp.c.La_Si[4].getOff(),midi.startTick+midi.tickLength)); la_siKeyOnce[4]=false;}
      
      if(midi.cp.c.DoMajor.getKeyReleased() && doMajorKeyOnce){midi.track.add(new MidiEvent(midi.cp.c.DoMajor.getOff(),midi.startTick+midi.tickLength)); doMajorKeyOnce=false;}
      }
    }
                
  }