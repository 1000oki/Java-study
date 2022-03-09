import javax.swing.*;

public class TextureTest extends JFrame{
    public TextureTest(){
        setSize(1000, 800);
        setTitle("Java 2D Texture Rendering:천옥희");
        JPanel panel = new TexturePanel();
        add(panel);
        setVisible(true);
    }
}
