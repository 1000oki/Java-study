import java.awt.*;

import org.graalvm.compiler.lir.CompositeValue.Component;

public class CalHW extends Frame{
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Button bc, bce, b1x, bdel, bper, bdiv, bmul, bsub, bsum, bpar, bpm, bdot, beq;
    TextField tf;
    GridBagConstraints c;
    Panel p1, p2;

    public CalHW(){
        super("CalHW");

        GridBagLayout gridbag = new GridBagLayout();
       
        c = new GridBagConstraints();
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.fill = GridBagConstraints.BOTH;
        
        b0 = new Button("0");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        bc = new Button("C");
        bce = new Button("CE");
        bdel = new Button("DEL");
        b1x = new Button("1/x");
        bper = new Button("%");
        bdiv = new Button("/");
        bmul = new Button("X");
        bsub = new Button("-");
        bsum = new Button("+");
        bpar = new Button("()");
        bpm = new Button("+/-");
        bdot = new Button(".");
        beq = new Button("=");

        p1 = new Panel();
        tf = new TextField(70);
        p1.setLayout(new GridLayout(1,1,3,3));
        p1.add(tf);

        Font font = new Font("arian", Font.BOLD,30);
        tf.setFont(font);
        tf.setText("0");

        p2 = new Panel();
        p2.setLayout(gridbag);

        layout(bc,0,0,1,1);
        layout(bce,1,0,1,1);
        layout(b1x,2,0,1,1);
        layout(bdel,3,0,1,1);
        layout(bper,0,1,1,1);
        layout(bdiv,1,1,1,1);
        layout(bmul,2,1,1,1);
        layout(bsub,3,1,1,1);
        layout(b7,0,2,1,1);
        layout(b8,1,2,1,1);
        layout(b9,2,2,1,1);
        layout(bsum,3,2,1,1);
        layout(b4,0,3,1,1);
        layout(b5,1,3,1,1);
        layout(b6,2,3,1,1);
        layout(bpar,3,3,1,1);
        layout(b1,0,4,1,1);
        layout(b2,1,4,1,1);
        layout(b3,2,4,1,1);
        layout(bpm,3,4,1,1);
        layout(b0,0,5,1,1);
        layout(bdot,1,5,1,1);
        layout(beq,2,5,2,1);

        setLayout(new BorderLayout(4,7));
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);

        setSize(300,400);
        setVisible(true);
    }

    public void layout(Component o, int x1, int y2, int w, int h)
    {
        c.gridx = x1;
        c.gridy = y2;
        c.gridwidth = w;
        c.gridheight = h;
        p2.add(o,c);
    }
}
