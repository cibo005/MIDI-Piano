
import java.io.File;
import javax.swing.filechooser.FileFilter;

public class AudioFileFilter extends FileFilter
{
  protected String extension[];
  
  public AudioFileFilter(String extension[])
    {
    this.extension=extension;
    }
  public boolean accept(File f)
    {
    if(f!=null)
      {
      if(f.isDirectory())return true;
      if(f.isHidden())return false;
      if(f.isFile())
        for(int i=0;i<extension.length;i++)
          if((Music.getExtension(f)).toLowerCase().equals(extension[i]))return true;
      }    
    return false;
    }
  public String getDescription()
    {
    String description=new String("Audio types:");
    
    for(int i=0;i<extension.length;i++)
      description+=" *."+extension[i];
    
    return description;
    }
}