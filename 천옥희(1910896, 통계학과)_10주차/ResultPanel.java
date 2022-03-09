import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class ResultPanel extends JPanel{
	int Ap, Am, Az, Bp, Bz, Bm;
	
	public void paint (Graphics g) {
		g.clearRect(0, 0, getWidth(), getHeight());
		g.drawLine(50,  250,  400,  250);
		
		for (int i = 1; i<8; i++) {
			g.drawString(i+"", 25, 255-(20*i));
			g.drawLine(50, 250-(20*i), 400, 250-(20*i));
		}
		
		g.drawLine(50,  80,  50,  250);
		g.drawString("A+", 100, 270);
		g.drawString("A0", 150, 270);
		g.drawString("A-", 200, 270);
		g.drawString("B+", 250, 270);
		g.drawString("B0", 300, 270);
		g.drawString("B-", 350, 270);
		g.setColor(Color.BLUE);
		
		g.fillRect(110, 250-Ap*20, 10, Ap*20);
		g.fillRect(160, 250-Az*20, 10, Az*20);
		g.fillRect(210, 250-Am*20, 10, Am*20);
		g.fillRect(260, 250-Bp*20, 10, Bp*20);
		g.fillRect(310, 250-Bz*20, 10, Bz*20);
		g.fillRect(360, 250-Bm*20, 10, Bm*20);
	}
	
	void setScore(int Ap, int Az, int Am, int Bp, int Bz, int Bm) {
		this.Ap = Ap;
		this.Az = Az;
		this.Am = Am;
		this.Bp = Bp;
		this.Bz = Bz;
		this.Bm = Bm;
	}
}
