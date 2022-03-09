import javax.swing.*;

public class ShapesFill extends JFrame{
    public ShapesFill(){
        setSize(600, 130);
        setTitle("Java 2D Shapes Fill : 천옥희");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new ShapesFillPanel();
        add(panel);
        setVisible(true);
    }
}
