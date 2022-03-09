import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class DrawingActionListener implements ActionListener{
	JTextField e1, e2, e3, e4, e5, e6;
	ResultPanel resultPanel;
	
	DrawingActionListener(JTextField e1, JTextField e2, JTextField e3,JTextField e4, JTextField e5, JTextField e6, ResultPanel resultPanel){
		this.e1 = e1;
		this.e2 = e2;
		this.e3 = e3;
		this.e4 = e4;
		this.e5 = e5;
		this.e6 = e6;
		this.resultPanel = resultPanel;
	}
	
	public void actionPerformed(ActionEvent e) {
		try {
			int Ap = Integer.parseInt(e1.getText());
			int Az = Integer.parseInt(e2.getText());
			int Am = Integer.parseInt(e3.getText());
			int Bp = Integer.parseInt(e4.getText());
			int Bz = Integer.parseInt(e5.getText());
			int Bm = Integer.parseInt(e6.getText());
			resultPanel.setScore(Ap, Az, Am, Bp, Bz, Bm);
			resultPanel.repaint();
		}
		catch(NumberFormatException nfe) {
			JOptionPane.showMessageDialog(resultPanel, "다시입력하세요", "에러메세지", JOptionPane.ERROR_MESSAGE);
		}
	}
}
