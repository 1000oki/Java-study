import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class TabTest implements ItemListener{
    JFrame jf;
    JTabbedPane tabpane;

    JCheckBox[] buttons = new JCheckBox[3];
	String[] fruit = {"pear", "strawberry", "apple"};
	JLabel[] pictureLabel = new JLabel[3];
	ImageIcon[] icon = new ImageIcon[3];

    JRadioButton small, medium, large;
    JLabel text;
    JPanel topPanel, sizePanel, resultPanel;
    
    public TabTest(String msg){
        jf = new JFrame(msg);
        tabpane = new JTabbedPane();

        JPanel one = new JPanel();
        JPanel two = new JPanel();
        JPanel three = new JPanel(new GridLayout(0,4));
        JPanel four = new JPanel();

        one.setBackground(Color.pink);
        two.setBackground(Color.yellow);
        three.setBackground(Color.green);
        four.setBackground(Color.white);

        ImageIcon logo = new ImageIcon("sm_logo.png");
        JLabel label = new JLabel("SMU Logo",logo,JLabel.RIGHT);
        label.setFont(new Font("굴림", Font.BOLD, 30));
        one.add(label);

        ImageIcon dog = new ImageIcon("dog.jpeg");
        JLabel label2 = new JLabel("DOG", dog, JLabel.RIGHT);
        two.add(label2);

        //과일 체크박스
        for (int i = 0; i<3; i++) {
			buttons[i] = new JCheckBox(fruit[i]);
			buttons[i].addItemListener(this);
			pictureLabel[i] = new JLabel(fruit[i]+".jpeg");
			icon[i] =new ImageIcon(fruit[i]+".jpeg");
		}
		JPanel checkPanel = new JPanel(new GridLayout(0,1));
		for (int i = 0; i<3; i++)
			checkPanel.add(buttons[i]);
		three.add(checkPanel);
		three.add(pictureLabel[0]);
		three.add(pictureLabel[1]);
		three.add(pictureLabel[2]);

        //주문 사이즈 선택
        topPanel = new JPanel();
        JLabel label4 = new JLabel("What size of coffee do you like to order?");
        topPanel.add(label4);
        four.add(topPanel, BorderLayout.NORTH);
        
        sizePanel = new JPanel();
        small = new JRadioButton("Small Size");
        medium = new JRadioButton("Medium Size");
        large = new JRadioButton("Large Size");
        ButtonGroup size = new ButtonGroup();

        size.add(small);
        size.add(medium);
        size.add(large);

        small.addItemListener(this);
        medium.addItemListener(this);
        large.addItemListener(this);

        sizePanel.add(small);
        sizePanel.add(medium);
        sizePanel.add(large);

        four.add(sizePanel, BorderLayout.CENTER);

        resultPanel = new JPanel();
        text = new JLabel("Did not select the size");
        text.setForeground(Color.red);

        resultPanel.add(text);
        four.add(resultPanel, BorderLayout.SOUTH);

        tabpane.addTab("SMU", one);
        tabpane.addTab("DOG", two);
        tabpane.addTab("Fruit", three);
        tabpane.addTab("Choice", four);

        jf.getContentPane().add(tabpane,BorderLayout.CENTER);
        jf.setSize(400,400);
        jf.setVisible(true);
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
