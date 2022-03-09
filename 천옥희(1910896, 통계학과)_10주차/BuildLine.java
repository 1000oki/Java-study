import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BuildLine extends JPanel{
	
	public BuildLine() {
		setLayout(new BorderLayout());
		
		LinePanel linePanel = new LinePanel();
		
		add(linePanel, BorderLayout.CENTER);
		
		JPanel pp = new JPanel();
		pp.add(new JLabel("<내 성적 추이>"));
		add(pp, BorderLayout.NORTH);
	}
}
