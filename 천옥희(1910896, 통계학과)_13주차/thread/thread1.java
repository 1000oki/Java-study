import java.awt.*;
import java.io.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

public class thread1 implements Runnable{
	public thread1() {
	}
	public void run() {
		play("sound1.wav");
	}
	public void play(String fileName) {
		try {
    		AudioInputStream ais = AudioSystem.getAudioInputStream(new File("sound1.wav"));
    		Clip clip = AudioSystem.getClip();
    		clip.stop();
    		clip.open(ais);
    		clip.start();
    	} catch(Exception ex) {
    		
    	}
    }
}
