import java.awt.*;

public class ButtonLabel2
{
    Button b;
    Label l;

    public ButtonLabel2(){
        Frame f = new Frame("Button Label Test2");
        f.setLayout(new FlowLayout());
        
        b = new Button("OK");
        l = new Label("OHCheon");

        f.add(b);
        f.add(l);

        f.setSize(300, 200);
        f.setVisible(true);
    }    
}
