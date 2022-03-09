import java.awt.*;

public class ScrollPaneTest {
    ScrollPane sp;
    Panel mpanel, bpanel;
    TextArea ta;
    Button ok, cancel;
    
    public ScrollPaneTest(){
        Frame f = new Frame("ScrollPaneTest");

        sp = new ScrollPane();
        sp.setSize(150,100);

        mpanel = new Panel();
        mpanel.setSize(500, 450);
        mpanel.setLayout(new BorderLayout());
        ta = new TextArea();
        mpanel.add("Center", ta);
        bpanel = new Panel();
        ok = new Button("OK");
        cancel = new Button("CANCEL");
        bpanel.add(ok);
        bpanel.add(cancel);
        mpanel.add("South", bpanel);

        sp.add(mpanel);
        f.add("Center", sp);
        f.setSize(300,250);
        f.setVisible(true);
    }
}
