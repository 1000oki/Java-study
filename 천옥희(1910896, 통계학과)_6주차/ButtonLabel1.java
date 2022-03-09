import java.awt.*;

public class ButtonLabel1 extends Frame
{
    Button b;
    Label l;

    public ButtonLabel1(String msg){
        super(msg);
        setLayout(new FlowLayout());

        b =new Button("OK");
        l = new Label("OHCHEON");

        add(b); 
        add(l);

        setSize(300, 200);
        setVisible(true);
    }
}
