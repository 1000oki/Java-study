import javax.swing.*;

public class MoreShapes extends JFrame{
    
    public MoreShapes() {
        setSize(600, 130);
        setTitle("Java 2D Shapes :천옥희");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new ShapePanel();
        add(panel);
        setVisible(true);
    }
}
