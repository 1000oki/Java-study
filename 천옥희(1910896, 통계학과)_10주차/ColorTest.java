import javax.swing.*;
import javax.awt.event.*;

public class ColorTest extends JFrame{
    
    public ColorTest(){
        setSize(230,300);
        setTitle("ColorTest:천옥희");
        
        JPanel panel = new ColorPanel();
        add(panel);
        setVisible(true);
    }
}
