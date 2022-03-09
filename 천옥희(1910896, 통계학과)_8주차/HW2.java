import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class HW2 extends JFrame implements ActionListener{
    private JRadioButton small, medium, large;
    private JLabel text;
    private JPanel topPanel, sizePanel, resultPanel;

    public HW2(){
        setTitle("HW2: 천옥희");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        topPanel = new JPanel();
        JLabel label = new JLabel("What size of coffee do you like to order?");
        topPanel.add(label);
        add(topPanel, BorderLayout.NORTH);
        
        sizePanel = new JPanel();
        small = new JRadioButton("Small Size");
        medium = new JRadioButton("Medium Size");
        large = new JRadioButton("Large Size");
        ButtonGroup size = new ButtonGroup();

        size.add(small);
        size.add(medium);
        size.add(large);

        small.addActionListener(this);
        medium.addActionListener(this);
        large.addActionListener(this);

        sizePanel.add(small);
        sizePanel.add(medium);
        sizePanel.add(large);

        add(sizePanel, BorderLayout.CENTER);

        resultPanel = new JPanel();
        text = new JLabel("Did not select the size");
        text.setForeground(Color.red);

        resultPanel.add(text);
        add(resultPanel, BorderLayout.SOUTH);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == small) {
            text.setText("Ordered Small Size.");
        }
        if (e.getSource() == medium) {
            text.setText("Ordered Medium Size.");
        }
        if (e.getSource() == large) {
            text.setText("Ordered Large Size.");
        }
    }
}
