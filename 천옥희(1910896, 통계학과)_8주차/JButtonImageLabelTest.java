import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JButtonImageLabelTest implements ActionListener {
    JPanel panel;
    JLabel label;
    JButton button;
 
    public JButtonImageLabelTest(String msg){
        JFrame jf = new JFrame(msg);
        jf.setTitle("JButton: 천옥희");
        jf.setSize(300,250);

        panel = new JPanel();
        label = new JLabel("Click JButton to see Image");

        button = new JButton("See Image!!");
        ImageIcon icon = new ImageIcon("icon.gif");
        button.setIcon(icon);
        button.addActionListener(this);
        panel.add(label);
        panel.add(button);

        jf.add(panel);
        jf.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        ImageIcon dog = new ImageIcon("dog.jpeg");
        label.setIcon(dog);
        label.setText("DOG");
        button.setText("Goodluck");
    }
}
