import javax.swing.*;
import java.awt.event.*;

class DialogCall extends JFrame{
    MyDialog dialog;
    JButton btn;

    public DialogCall(){
        super("JDialog Example:천옥희");

        btn = new JButton("Show Dialog");
        dialog = new MyDialog(this, "Test Dialog:천옥희");

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dialog.setVisible(true);
            }
        });
        
        getContentPane().add(btn);
        setSize(300,300);
        setVisible(true);
    }
}