import javax.swing.*;
import java.awt.event.*;

class EventTestMyFrame1 extends JFrame implements ActionListener{
    JButton button;
    JLabel label;

    public EventTestMyFrame1() {
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Event Programming Style1 : 천옥희");

        JPanel panel = new JPanel();
        button = new JButton("Click Button");
        label = new JLabel("Please, Click the Button");
        button.addActionListener(this);
        panel.add(button);
        panel.add(label);
        this.add(panel);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button) {
            label.setText("Clicked the Button");
        }
    }
}
