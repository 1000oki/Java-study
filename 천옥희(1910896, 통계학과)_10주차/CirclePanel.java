import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;

class CirclePanel extends JPanel{

    public CirclePanel(){ 
    	JLabel lb11 = new JLabel("<저번학기 내 성적>");
		add(lb11,BorderLayout.NORTH);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.clearRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.YELLOW);
        g.fillArc(100, 100, 200, 200, 0, 102);

        g.setColor(Color.RED);
        g.fillArc(100, 100, 200, 200, 102, 102);

        g.setColor(Color.BLUE);
        g.fillArc(100, 100, 200, 200, 204, 102);
        
        g.setColor(Color.GREEN);
        g.fillArc(100, 100, 200, 200, 306, 54);

        g.setColor(Color.BLACK);
        g.setFont(new Font("굴림", Font.PLAIN, 12));
        g.drawString(" A+: 빨강", 400, 150);
		g.drawString(" A-: 초록", 400, 170);
		g.drawString(" A0: 파랑", 400, 190);
		g.drawString(" B+: 노랑", 400, 210);
    }
}