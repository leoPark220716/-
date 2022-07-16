import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import java.io.File;

class Bgm implements Runnable
{
    public void run(){
       try{
       AudioInputStream ais= AudioSystem.getAudioInputStream(new File("bg/Elden Ring Soundtrack OST - Godrick the Grafted (online-audio-converter.com).wav"));
       Clip clip=AudioSystem.getClip();
       clip.open(ais);
       //
//           FloatControl gainControl=(FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
//gainControl.setValue(-30.0f);
       clip.start();
       }catch (Exception e){

       }
    }
}

class Bgm1 implements Runnable{

   public void run() {


       try {
           AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("bg/3-03-a-hero-rises-strategymap.mp3"));
           Clip clip = AudioSystem.getClip();
           clip.open(audioInputStream);

//           FloatControl gainControl=(FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
//gainControl.setValue(-30.0f);
           clip.start();
       } catch (Exception e) {

       }
   }


}

