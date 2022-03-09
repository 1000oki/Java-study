import java.awt.*;

public class ListTest1 extends Frame{
   
    public ListTest1(String msg){
        super(msg);

        setLayout(new FlowLayout());
        List list = new List(6, true);
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        
        add(list);
        setSize(300, 200);
        setVisible(true);
    }
}
