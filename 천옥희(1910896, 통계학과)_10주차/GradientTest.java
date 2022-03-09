import javax.swing.*;

class GradientTest extends JFrame{
    public GradientTest(){
        setSize(300, 330);
        setTitle("Java 2D Gradient : 천옥희");
        JPanel panel = new GradientPanel();
        add(panel);
        setVisible(true);
    }
}
