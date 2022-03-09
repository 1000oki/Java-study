import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Piano extends JFrame implements ActionListener{
	int count = 0;
	JButton b1, b2, b3, b4, b5, b6, b7, b8;
	public static Thread d1 = new Thread(new thread1());
	public static Thread d2 = new Thread(new thread2());
	public static Thread d3 = new Thread(new thread3());
	public static Thread d4 = new Thread(new thread4());
	public static Thread d5 = new Thread(new thread5());
	public static Thread d6 = new Thread(new thread6());
	public static Thread d7 = new Thread(new thread7());
	public static Thread d8 = new Thread(new thread8());
	public static Thread t1 = new Thread(new thread());
	
	
	public Piano() {
		getContentPane().setLayout(new GridLayout(1,8));
		t1.start();
		
		b1 = new JButton("도");
		Font font = new Font("휴먼편지체", Font.BOLD, 22);
		b1.setFont(font);
		b1.setForeground(Color.black);
		b1.setBackground(Color.white);
		
		b2 = new JButton("레");
		b2.setFont(font);
		b2.setForeground(Color.black);
		b2.setBackground(Color.white);
		
		b3 = new JButton("미");
		b3.setFont(font);
		b3.setForeground(Color.black);
		b3.setBackground(Color.white);
		
		b4 = new JButton("파");
		b4.setFont(font);
		b4.setForeground(Color.black);
		b4.setBackground(Color.white);
		
		b5 = new JButton("솔");
		b5.setFont(font);
		b5.setForeground(Color.black);
		b5.setBackground(Color.white);

		b6 = new JButton("라");
		b6.setFont(font);
		b6.setForeground(Color.black);
		b6.setBackground(Color.white);
		
		b7 = new JButton("시");
		b7.setFont(font);
		b7.setForeground(Color.black);
		b7.setBackground(Color.white);
		
		b8 = new JButton("도");
		b8.setFont(font);
		b8.setForeground(Color.black);
		b8.setBackground(Color.white);
		
		
		
		getContentPane().add(b1); b1.addActionListener(this);
		getContentPane().add(b2); b2.addActionListener(this);
		getContentPane().add(b3); b3.addActionListener(this);
		getContentPane().add(b4); b4.addActionListener(this); 
		getContentPane().add(b5); b5.addActionListener(this);
		getContentPane().add(b6); b6.addActionListener(this);
		getContentPane().add(b7); b7.addActionListener(this);
		getContentPane().add(b8); b8.addActionListener(this);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Piano : CheonOkHui");
    	setSize(800, 200);
	
	}
	public void actionPerformed(ActionEvent e) {    	
		if (e.getSource() == b1) {
			d1.start();
			b1.setEnabled(false);
		} else if(e.getSource() == b2) {
			d2.start();
			b2.setEnabled(false);
		}else if(e.getSource() == b3) {
			d3.start();
			b3.setEnabled(false);
		}else if(e.getSource() == b4) {
			d4.start();
			b4.setEnabled(false);
		}else if(e.getSource() == b5) {
			d5.start();
			b5.setEnabled(false);
		}else if(e.getSource() == b6) {
			d6.start();
			b6.setEnabled(false);
		}else if(e.getSource() == b7) {
			d7.start();
			b7.setEnabled(false);
		}else if(e.getSource() == b8) {
			d8.start();
			b8.setEnabled(false);
		}
    }
}
