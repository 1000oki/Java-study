import java.awt.*;

public class Checkbox2 extends Frame{
    Checkbox one, two, three;
    public Checkbox2(String msg){
        super(msg);
        setLayout(new FlowLayout());

        one = new Checkbox("One");
        two = new Checkbox("Two");
        three = new Checkbox("Three");

        add(one);
        add(two);
        add(three);

        setSize(300, 200);
        setVisible(true);
    }    
}
