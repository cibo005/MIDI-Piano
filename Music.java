
import java.io.File;

abstract class Music
  {
  protected ControlPanel cp;
  
  public Music(ControlPanel cp)
    {
    this.cp=cp;
    }
  public void play()
    {
    }
  public void pause()
    {
    }
  public void stop()
    {
    }
  public void record()
    {
    }
  public void save()
    {
    }
  public static String getExtension(File f)
    {
    char name[]=f.getName().toCharArray();
    
    int i=0;
    while(name[i]!='.'&&i<name.length-1)i++;
    
    char ext[];
    if(name.length-1-i==0)
      {
      ext=new char[1];
      ext[0]='.';
      }
    else
      {
      ext=new char[name.length-1-i];
      }
    
    for(int j=0;j<ext.length;j++)
      ext[j]=name[name.length-1-ext.length+1+j];
      
    return new String(ext);
    }
  
  }