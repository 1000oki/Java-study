import javax.swing.*;
import java.awt.event.*;

class EventTestMyFrame3 extends JFrame {
    private JButton button;
    private JLabel label;

    public EventTestMyFrame3() {
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Event Programming Style3 : 천옥희");

        JPanel panel = new JPanel();
        button = new JButton("Button");
        label = new JLabel("Please, Click the Button");

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getSource() == button) {
                    label.setText("Clicked the Button");
                }
            }
        });
        
        panel.add(button);
        panel.add(label);
        this.add(panel);
        this.setVisible(true);
    }
}
