import java.awt.*;

public class ChoiceTest extends Frame{
    public ChoiceTest(String msg){
        super(msg);
        
        setLayout(new FlowLayout());
        Choice choice = new Choice();
        choice.add("One");
        choice.add("Two");
        choice.add("Tree");
        choice.add("Four");
        choice.add("Five");
        choice.add("Six");

        add(choice);
        setSize(300,200);
        setVisible(true);
    }
}
