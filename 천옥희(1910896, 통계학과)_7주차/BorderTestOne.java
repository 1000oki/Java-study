import java.awt.*;

public class BorderTestOne {
    public BorderTestOne(){
        Frame f = new Frame("Boarder Test One");

        f.setLayout(new BorderLayout(5,5));

        f.add("North", new Button("North"));
        f.add("Center", new Button("Center"));
        f.add("South", new Button("Sout"));
        f.add("West", new Button("West"));
        f.add("East", new Button("East"));
        
        f.setSize(300,200);
        f.setVisible(true);        
    }
}
