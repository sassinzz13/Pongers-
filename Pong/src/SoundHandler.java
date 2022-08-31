import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import java.io.File;
import java.io.IOException;



public class SoundHandler {
    public static void RunMusic(String path)
    {

        try {
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(path));
            Clip clip = AudioSystem.getClip();
            clip.open(inputStream);
            clip.loop(1000000);
            
    }catch(UnsupportedAudioFileException e)
    {
    e.printStackTrace();
    }catch(IOException e)
    {
        e.printStackTrace();
    }catch (LineUnavailableException e)
    {
        e.printStackTrace();
    }
    System.out.println("Music ends at the millionth btw easter egg :)");
    System.out.println("Also shes cute af :)");
}
}
