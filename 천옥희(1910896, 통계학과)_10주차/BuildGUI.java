import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BuildGUI extends JPanel {
	
	public BuildGUI() {
		
		setLayout(new BorderLayout());
		
		ResultPanel resultPanel = new ResultPanel();
		JLabel lb1 = new JLabel("<내가 원하는 성적>");
		
		add(resultPanel, BorderLayout.CENTER);
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JTextField e1 = new JTextField(3);
		JTextField e2 = new JTextField(3);
		JTextField e3 = new JTextField(3);
		JTextField e4 = new JTextField(3);
		JTextField e5 = new JTextField(3);
		JTextField e6 = new JTextField(3);
		
		JButton button = new JButton("입력");
		
		p1.add(new JLabel("A+"));
		p1.add(e1);
		p1.add(new JLabel("A0"));
		p1.add(e2);
		p1.add(new JLabel("A-"));
		p1.add(e3);
		p1.add(new JLabel("B+"));
		p1.add(e4);
		p1.add(new JLabel("B0"));
		p1.add(e5);
		p1.add(new JLabel("B-"));
		p1.add(e6);
		p1.add(button);
		p2.add(lb1);
		add(p2, BorderLayout.NORTH);
		add(p1, BorderLayout.SOUTH);
		button.addActionListener(new DrawingActionListener(e1, e2, e3, e4, e5, e6, resultPanel));
	}
}