import java.awt.*;
import java.awt.event.*;

public class PopupTest extends Frame implements ActionListener {
    PopupMenu popup;
    Frame f;
    Button b;
    public PopupTest(){
        f = new Frame("Popup Test");
        b = new Button("POPUPTEST");
        b.addActionListener(this);

        popup = new PopupMenu("POP-UP");
        popup.add(new MenuItem("copy"));
        popup.add(new MenuItem("paste"));
        Menu col = new Menu("color");
        col.add(new MenuItem("white"));
        col.add(new MenuItem("blue"));
        popup.add(col);
        b.add(popup);
        f.add("Center", b);
        f.setSize(300,200);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        popup.show(b, 10, 10);
    }
}
