import java.awt.*;
import javax.swing.*;

public class TableTest1 {

    public TableTest1(String msg){
        JFrame jf = new JFrame(msg);

        String columnName[] = {"이름", "전화번호", "E-Mail"  };
        
        String data[][] = {
            {"천옥희", "02-123-456", "cjsdhrgml@sm.ac.kr"},
            {"천옥희2", "010-1234-5678", "cjsdhrgml@sookmyung.ac.kr"},
            {"천옥희3", "02-0212-2345", "cjsdhrgml00@gmail.com"} };
        
            JTable table = new JTable(data, columnName);
            JScrollPane sp = new JScrollPane(table);
            jf.getContentPane().add(sp, BorderLayout.CENTER);

            jf.setSize(400,400);
            jf.setVisible(true);
    }
}
