import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CalHW extends JFrame implements ActionListener{
    JButton[] b = new JButton[10];
    JButton bc, bce, b1x, bdel, bper, bdiv, bmul, bsub, bsum, bpar, bpm, bdot, beq;
    JTextField jtf, j;
    GridBagConstraints c;
    JPanel p1, p2, p3;
    JLabel prev, operator, flag;

    public CalHW(){
        super("CalHW:천옥희");

        GridBagLayout gridbag = new GridBagLayout();
       
        c = new GridBagConstraints();
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        
        for(int i = 0; i< 10; i++) {
        	b[i] = new JButton(Integer.toString(i));
        	b[i].addActionListener(this);
        }
        bc = new JButton("C"); bc.addActionListener(this);
        bce = new JButton("CE"); bce.addActionListener(this);
        bdel = new JButton("DEL"); bdel.addActionListener(this);
        b1x = new JButton("1/x"); b1x.addActionListener(this);
        bper = new JButton("%"); bper.addActionListener(this);
        bdiv = new JButton("/"); bdiv.addActionListener(this);
        bmul = new JButton("X"); bmul.addActionListener(this);
        bsub = new JButton("-"); bsub.addActionListener(this);
        bsum = new JButton("+"); bsum.addActionListener(this);
        bpar = new JButton("()"); bpar.addActionListener(this);
        bpm = new JButton("+/-"); bpm.addActionListener(this); 
        bdot = new JButton("."); bdot.addActionListener(this);
        beq = new JButton("="); beq.addActionListener(this);

        p1 = new JPanel();
        jtf = new JTextField(70);
        j = new JTextField(70);
        p1.setLayout(gridbag);
        layout1(jtf,0,1,1,1);
        layout1(j,0,0,1,1);
        
        j.setFont(new Font("arian", Font.PLAIN,15));
        j.setText("0");
        j.setHorizontalAlignment(JTextField.RIGHT);

        jtf.setFont(new Font("arian", Font.BOLD,30));
        jtf.setText("0");
        jtf.setHorizontalAlignment(JTextField.RIGHT);


        p2 = new JPanel();
        p2.setLayout(gridbag);

        layout(bc,0,0,1,1);
        layout(bce,1,0,1,1);
        layout(b1x,2,0,1,1);
        layout(bdel,3,0,1,1);
        layout(bper,0,1,1,1);
        layout(bdiv,1,1,1,1);
        layout(bmul,2,1,1,1);
        layout(bsub,3,1,1,1);
        layout(b[7],0,2,1,1);
        layout(b[8],1,2,1,1);
        layout(b[9],2,2,1,1);
        layout(bsum,3,2,1,1);
        layout(b[4],0,3,1,1);
        layout(b[5],1,3,1,1);
        layout(b[6],2,3,1,1);
        layout(bpar,3,3,1,1);
        layout(b[1],0,4,1,1);
        layout(b[2],1,4,1,1);
        layout(b[3],2,4,1,1);
        layout(bpm,3,4,1,1);
        layout(b[0],0,5,1,1);
        layout(bdot,1,5,1,1);
        layout(beq,2,5,2,1);      
        
        setLayout(new BorderLayout(4,8));
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
       
        
        setSize(300,400);
        setVisible(true);
        
        prev = new JLabel("");
        operator = new JLabel("");
        flag = new JLabel("");
    }
    
    public void layout1(Component o, int x1, int y2, int w, int h)
    {
        c.gridx = x1;
        c.gridy = y2;
        c.gridwidth = w;
        c.gridheight = h;
        p1.add(o,c);
    }

    public void layout(Component o, int x1, int y2, int w, int h)
    {
        c.gridx = x1;
        c.gridy = y2;
        c.gridwidth = w;
        c.gridheight = h;
        p2.add(o,c);
    }

    public void actionPerformed(ActionEvent e) {
    	for (int i=0; i < 10; i++) {
    		if(e.getSource() == b[i]) {
    			if(jtf.getText().equals("0")) {
    				j.setText("" + i);
    				jtf.setText("" + i);
    			}else {
    				if(operator.getText().equals("")){
    					j.setText(j.getText()+i);
    					jtf.setText(jtf.getText() + i);
    				}else{
    					if(flag.getText().equals("")) {
    						j.setText(j.getText()+i);
    						jtf.setText("" + i);
    						flag.setText("$");
    					}else if(flag.getText().equals(".")) {
    						jtf.setText("" + i);
    						j.setText(""+i);
    						flag.setText("");
    					}else if(flag.getText().equals("(")) {
    						jtf.setText("" + i);
    						j.setText(j.getText()+i);
    						flag.setText("");
    					}    			    					
    					else {
    						j.setText(prev.getText()+operator.getText()+jtf.getText()+i);
    						jtf.setText(jtf.getText()+i);
    					}
    				}
    			}
    		}
    	}
    	if(e.getSource() == beq) {
    		double op1, op2, result;
    		op1 = Double.parseDouble(prev.getText());
    		op2 = Double.parseDouble(jtf.getText());
    		
    		if(operator.getText().equals("+")) {
    			result = op1 + op2;
    			j.setText(op1 + "+" + op2 + "=" + result);
    			jtf.setText(""+ result);
    		}
    		if(operator.getText().equals("-")) {
    			result = op1 - op2;
    			j.setText(op1 + "-" + op2 + "=" + result);
    			jtf.setText(""+result);
    		}
    		if(operator.getText().equals("*")) {
    			result = op1 * op2;
    			j.setText(op1 + "*" + op2 + "=" + result);
    			jtf.setText(""+result);
    		}
    		if(operator.getText().equals("/")) {
    			result = op1 / op2;
    			j.setText(op1 + "/" + op2 + "=" + result);
    			jtf.setText(""+result);
    		}
    		if(operator.getText().equals("%")) {
    			result = op1 % op2;
    			j.setText(op1 + "%" + op2 + "=" + result);
    			jtf.setText(""+result);
    		}
    	}			
    	
    	if(e.getSource() == bc) {
    		j.setText("0");
    		jtf.setText("0");
    		prev.setText(" ");
    		operator.setText("");
    		flag.setText("");
    	}
    	if(e.getSource() == bce) {
    		j.setText("0");
    		jtf.setText("0");
    		prev.setText("");
    		operator.setText("");
    		flag.setText("");
    	}
    	if(e.getSource() == b1x ) {
    		float o = Float.parseFloat(jtf.getText());
    		int o1 = Integer.parseInt(jtf.getText());
    		float result;
    		result = 1/o;
    		
    		j.setText("1/"+o1);
    		jtf.setText(""+result);
    		flag.setText("");
    		prev.setText(""+result);
    	}
    	if(e.getSource() == bdel) {
    		int a = jtf.getText().length();
    		int c = j.getText().length();
    		
    		if(a == 0) {
    			j.setText("0");
    			jtf.setText("0");
    		}else if(a > 0) {
    			String b = jtf.getText().substring(0, a-1);
    			String b1 = j.getText().substring(0, c-1);
    			j.setText(b1);
    			jtf.setText(b);
    			flag.setText("");
    		}
    	}
    	if(e.getSource() == bper) {
    		prev.setText(jtf.getText( ));
    		operator.setText("%");
    		j.setText(jtf.getText() + "%");
    	}
    	if(e.getSource() == bdiv) {
    		prev.setText(jtf.getText());
    		operator.setText("/");
    		j.setText(jtf.getText() + "/");
    	}
    	if(e.getSource() == bmul) {
    		prev.setText(jtf.getText());
    		operator.setText("*");
    		j.setText(jtf.getText() + "*");
    	}
    	if(e.getSource() == bsub) {
    		prev.setText(jtf.getText());
    		operator.setText("-");
    		j.setText(jtf.getText() + "-");
    	}
    	if(e.getSource() == bsum) {
    		prev.setText(jtf.getText());
    		operator.setText("+");
    		j.setText(jtf.getText() + "+");
    	}
    	if(e.getSource() == bpar) {
    		if(j.getText().contains("(")) {
    			j.setText(j.getText()+")");
    			jtf.setText(")");
    			String a = j.getText();
    			if (j.getText().contains("+")) {
    				int idx = a.indexOf("+");
    				String a1 = a.substring(1, idx);
    				String a2 = a.substring(idx+1, a.length()-1);
    				Double a3 = Double.parseDouble(a1)+Double.parseDouble(a2);
    				j.setText("("+ a3 + ")");
    				jtf.setText(""+ a3);}
    			else if (j.getText().contains("*")) {
    				int idx = a.indexOf("*");
    				String a1 = a.substring(1, idx);
    				String a2 = a.substring(idx+1, a.length()-1);
    				Double a3 = Double.parseDouble(a1)*Double.parseDouble(a2);
    				j.setText("("+ a3 + ")");
    				jtf.setText(""+ a3);}
    			else if (j.getText().contains("-")) {
    				int idx = a.indexOf("-");
    				String a1 = a.substring(1, idx);
    				String a2 = a.substring(idx+1, a.length()-1);
    				Double a3 = Double.parseDouble(a1)-Double.parseDouble(a2);
    				j.setText("("+ a3 + ")");
    				jtf.setText(""+ a3);}
    			else if (j.getText().contains("/")) {
    				int idx = a.indexOf("/");
    				String a1 = a.substring(1, idx);
    				String a2 = a.substring(idx+1, a.length()-1);
    				Double a3 = Double.parseDouble(a1)/Double.parseDouble(a2);
    				j.setText("("+ a3 + ")");
    				jtf.setText(""+ a3);}
    			else if (j.getText().contains("%")) {
    				int idx = a.indexOf("%");
    				String a1 = a.substring(1, idx);
    				String a2 = a.substring(idx+1, a.length()-1);
    				Double a3 = Double.parseDouble(a1)%Double.parseDouble(a2);
    				j.setText("("+ a3 + ")");
    				jtf.setText(""+ a3);}
    			flag.setText("");
    		}else {
    			j.setText("(");
    			jtf.setText("(");
    			flag.setText("(");
    		}
    	}
    	if(e.getSource() == bpm) {
    		double o = Double.parseDouble(jtf.getText());
    		double result;
    		result = (-1) * o;
    		prev.setText(""+result);
    		j.setText(""+result);
    		jtf.setText(""+result);
    		flag.setText("");
    	}
    	if(e.getSource() == bdot) {   		
    		int a = jtf.getText().length();
    		
    		if(a == 0) {
    			jtf.setText("0");
    			j.setText("0");
    		}else if(a > 0) {
    			String b = jtf.getText()+".";
    			j.setText(b);
    			jtf.setText(b);
    			flag.setText("");
    		}
    	}
    }
}
