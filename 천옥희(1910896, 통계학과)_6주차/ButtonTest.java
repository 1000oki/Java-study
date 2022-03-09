import java.awt.*;

public class ButtonTest {
    
    ButtonTest(){
        Frame f = new Frame("ButtonTest : Cheon");
        Button b = new Button("BUTTON");

        f.add(b);
        f.setSize(400, 150);
        f.setVisible(true);
    }
}
