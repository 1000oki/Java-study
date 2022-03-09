import java.awt.*;

public class Checkbox1{
    public Checkbox1(){
        Frame f = new Frame("CheckboxTest");

        f.setLayout(new FlowLayout());
        Checkbox one = new Checkbox("One");
        Checkbox two = new Checkbox("Two");
        Checkbox three = new Checkbox("Three");
        f.add(one);
        f.add(two);
        f.add(three);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
