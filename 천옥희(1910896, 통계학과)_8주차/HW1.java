import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HW1 implements ActionListener {
    JPanel panel1, panel2;
    JLabel label;
    JButton button;
    JLabel imglabel;
    boolean current = false;
 
    public HW1(String msg){
        JFrame jf = new JFrame(msg);

        jf.setTitle("JButtonHW1: 천옥희");
        jf.setSize(400,200);
        jf.setLayout(new BorderLayout(10,10));

        panel1 = new JPanel();
        panel2 = new JPanel();
        label = new JLabel("강아지를 보고 싶으면 아래 버튼을 누르세요!");
        imglabel = new JLabel();

        button = new JButton("See Image..");
        ImageIcon icon = new ImageIcon("Null");
        button.setIcon(icon);
        button.addActionListener(this);

        panel1.add(imglabel);

        panel2.setLayout(new FlowLayout());
        panel2.add(label);
        panel2.add(button);

        jf.add(panel1);
        jf.add(panel2, BorderLayout.SOUTH);
        jf.setVisible(true);
    }
 
    public void actionPerformed(ActionEvent e){
        if (current) {
            imglabel.setIcon(null);
            label.setText("강아지를 보고 싶으면 아래 버튼을 누르세요");
            current = false;
        } else{
            ImageIcon dog = new ImageIcon("dog.jpeg");
            imglabel.setIcon(dog);
            label.setText("Gook Luck: 초기화면으로 가려면 버튼을 누르세요");
            current = true;
        }
    }
}
