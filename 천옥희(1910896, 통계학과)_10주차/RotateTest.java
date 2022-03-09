import javax.swing.*;

class RotateTest extends JFrame{
    
    public RotateTest(){
        setSize(300, 300);
        setTitle("Java 2D Rotate:천옥희");
        JPanel panel = new RotatePanel();
        add(panel);
        setVisible(true);
    }
}
