import javax.swing.*;
import java.awt.*;

public class SnowManFace{
    SnowManFace(String msg){
        JFrame f = new JFrame(msg);

        f.add(new SnowManPanel());
        f.setSize(250,250);
        f.setVisible(true);
    }
}