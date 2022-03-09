import java.awt.Color;

import javax.swing.*;
import java.awt.*;

public class JLabelTest {

    public JLabelTest(String msg){
        JFrame jf; 
        JLabel label1, label2;
        ImageIcon logo;

        jf = new JFrame(msg);
        jf.setTitle("Image Label : 천옥희" );
        jf.setSize(300,250);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.getContentPane().setBackground(Color.yellow);

        label1 = new JLabel("숙명여자대학교");
        //label1.setFont(new Font("굴림체", Font.PLAIN, 20));
        logo = new ImageIcon("sm_logo.png");
        label2 = new JLabel("SMU", logo, JLabel.CENTER);
        jf.getContentPane().add("North", label1);
        jf.getContentPane().add("Center", label2);
        jf.setVisible(true);
        }
}
