import java.awt.*;
import javax.swing.*;

public class JComboBoxTest {
    JComboBox fruits;

    public JComboBoxTest(){
        JFrame jf = new JFrame("JComboBox:천옥희");
        jf.getContentPane().setLayout(new FlowLayout());
        
        String items[] = {"apple", "grape", "melon", "orange", "banana", "pear"};
        fruits = new JComboBox(items);

        jf.getContentPane().add(fruits);
        jf.setSize(200,200);
        jf.setVisible(true);
    }
}
