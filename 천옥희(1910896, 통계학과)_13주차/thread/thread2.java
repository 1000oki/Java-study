import java.awt.*;
import java.io.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

public class thread2 implements Runnable{
	public thread2() {
	}
	public void run() {
		play("sound2.wav");
	}
	public void play(String fileName) {
		try {
    		AudioInputStream ais = AudioSystem.getAudioInputStream(new File("sound2.wav"));
    		Clip clip = AudioSystem.getClip();
    		clip.stop();
    		clip.open(ais);
    		clip.start();
    	} catch(Exception ex) {
    		
    	}
    }
}
