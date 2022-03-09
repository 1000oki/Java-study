import javax.swing.*;
import java.awt.*;

public class JButtonTest {
    JButton plus, minus, mux, ch;

    public JButtonTest(String msg){
        JFrame jf = new JFrame(msg);
        jf.getContentPane().setLayout(new GridLayout(2,2));

        ImageIcon iplus = new ImageIcon("plus.png");
        ImageIcon iminus = new ImageIcon("minus.png");
        ImageIcon imux = new ImageIcon("mul.png");
        ImageIcon icheck = new ImageIcon("check.png");

        plus = new JButton(iplus);
        minus = new JButton(iminus);
        mux = new JButton(imux);
        ch = new JButton(icheck);

        jf.getContentPane().add(plus);
        jf.getContentPane().add(minus);
        jf.getContentPane().add(mux);
        jf.getContentPane().add(ch);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400,480);
        jf.setVisible(true);

    }
}
