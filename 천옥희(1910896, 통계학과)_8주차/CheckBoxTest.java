import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBoxTest extends JPanel implements ItemListener{
	JCheckBox[] buttons = new JCheckBox[3];
	String[] animal = {"dog", "cat", "rabbit"};
	JLabel[] pictureLabel = new JLabel[3];
	ImageIcon[] icon = new ImageIcon[3];
	
	public CheckBoxTest() {
		super(new GridLayout(0,4));
		
		for (int i = 0; i<3; i++) {
			buttons[i] = new JCheckBox(animal[i]);
			buttons[i].addItemListener(this);
			pictureLabel[i] = new JLabel(animal[i]+".jpeg");
			icon[i] =new ImageIcon(animal[i]+".jpeg");
		}
		JPanel checkPanel = new JPanel(new GridLayout(0,1));
		for (int i = 0; i<3; i++)
			checkPanel.add(buttons[i]);
		add(checkPanel);
		add(pictureLabel[0]);
		add(pictureLabel[1]);
		add(pictureLabel[2]);
		
	}
	
	public void itemStateChanged(ItemEvent e) {
		ImageIcon image = null;
		
		Object source = e.getItemSelectable();
		for (int i = 0; i < 3; i++) {
			if(source==buttons[i]) {
				if(e.getStateChange()==ItemEvent.DESELECTED)
					pictureLabel[i].setIcon(null);
				else
					pictureLabel[i].setIcon(icon[i]);
			}
		}
	}
}