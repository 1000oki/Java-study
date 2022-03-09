import java.awt.*;

public class TextDemo extends Frame{
    
    public TextDemo(String msg){
        super(msg);
        setLayout(new FlowLayout());

        TextArea text = new TextArea("Hello", 5, 30);
        add(text);

        char c = '*';

        TextField field = new TextField(30);
        field.setEchoChar(c);
        add(field);
        setSize(300, 200);
        setVisible(true);
    }
}
