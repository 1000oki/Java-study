import javax.swing.*;

public class LineShapes extends JFrame{
    public LineShapes() {
        setSize(500, 300);
        setTitle("Line Shapes:천옥희");
        JPanel panel = new MyShapePanel();
        add(panel);
        setVisible(true);
    }
} 