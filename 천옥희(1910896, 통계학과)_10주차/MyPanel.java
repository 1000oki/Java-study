import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel{
	public MyPanel() {
		JLabel lb11 = new JLabel("<시험 기간 내 표정>");
		add(lb11,BorderLayout.NORTH);
	}
	public void paintComponent(Graphics g) {
		g.setColor(Color.PINK);
		g.fillOval(100, 100, 200, 200);
		g.setColor(Color.BLACK);
		g.drawLine(150, 150, 180, 180);
		g.drawLine(220, 180, 260, 150);
		g.drawLine(150, 250, 200, 230);
		g.drawLine(200, 230, 250, 250);
	}
}
