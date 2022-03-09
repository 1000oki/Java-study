import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame{

    public Frame(){
    	super("성적 : 천옥희");
    	getContentPane().setLayout(new GridLayout(2,2));
		JPanel j = new CirclePanel();
		JPanel p = new BuildGUI();
		JPanel c = new MyPanel();
		JPanel d = new BuildLine();
		getContentPane().add(j);
		getContentPane().add(p);
		getContentPane().add(c);
		getContentPane().add(d);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,800);
		setVisible(true);
	}
}
