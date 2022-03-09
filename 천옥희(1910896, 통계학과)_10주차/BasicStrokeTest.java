import javax.swing.*;

class BasicStrokeTest extends JFrame{
    public BasicStrokeTest(){
        setSize(300, 300);
        setTitle("Java 2D BasicStroke : 천옥희");
        JPanel panel = new BasicStrokePanel();
        add(panel);
        setVisible(true);
    }
}
