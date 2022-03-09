import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LinePanel extends JPanel{
		
	public void paint (Graphics g) {
		
		g.clearRect(0, 0, getWidth(), getHeight());
		g.drawLine(50,  300,  400,  300);
		
		for (int i = 1; i<5; i++) {
			g.drawString(i+"", 25, 300-(40*i));
			g.drawLine(50, 300-(40*i), 400, 300-(40*i));
		}
		
		g.drawLine(50,  130,  50,  300);
		g.drawString("1학기", 100, 320);
		g.drawString("2학기", 170, 320);
		g.drawString("3학기", 240, 320);
		g.drawString("4학기", 310, 320);
		g.setColor(Color.BLUE);
		g.drawOval(110, 170, 5, 5);
		g.drawOval(180, 165, 5, 5);
		g.drawOval(250, 130, 5, 5);
		g.drawOval(320, 145, 5, 5);
		g.setColor(Color.RED);
		g.drawLine(110, 171, 180, 166);
		g.drawLine(180, 166, 250, 131);
		g.drawLine(250, 131, 320, 146);
		}
}