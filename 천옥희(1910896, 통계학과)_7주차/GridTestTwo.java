import java.awt.*;

public class GridTestTwo extends Frame{
    
    public GridTestTwo(){
        super("GridTestTwo");
        setLayout(new GridLayout(3,2));
        add(new Button("1"));
        add(new TextField("2",10));
        add(new TextArea("3", 5, 10));
        List list = new List(5,false);
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        add(list);
        
        Panel panel = new Panel();
        panel.setLayout(new BorderLayout());
        panel.add("North", new Button("north"));
        panel.add("East", new Button("east"));
        add(panel);
        
        add(new Label("6"));
        setSize(500, 400);
        setVisible(true);
    }
}