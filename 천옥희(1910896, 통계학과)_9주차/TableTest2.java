import java.awt.*;
import javax.swing.*;

public class TableTest2 extends JFrame{
    JTable table;
    
    public TableTest2(String msg){
        JFrame jf = new JFrame(msg);
        Object[][] data = {
            {"Cheon", new Integer(30), "Cheon@sm.ac.kr"},
            {"Lim", new Integer(30), "Lim@sm.ac.kr"},
            {"Park", new Integer(30), "Park@sm.ac.kr"},
            {"Lee", new Integer(30), "Lee@sm.ac.kr"},
        };
        String[] columnName = {"Name", "Age", "E-mail"};

        table = new JTable(data, columnName);
        jf.getContentPane().add(new JScrollPane(table), "Center");
        jf.setSize(300,200);
        jf.setVisible(true);
    }
}