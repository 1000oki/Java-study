import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class DrawTreeFrame extends JFrame{
    
    public DrawTreeFrame(){
        setTitle("DrawTree:천옥희");
        setSize(800, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g){
        g.setColor (Color.BLACK);
        drawTree(g, 400, 600, -90, 10);

    }

    private void drawTree(Graphics g, int xl, int yl, double angle, int depth){
        if(depth == 0) return;
        int x2 = xl + (int) (Math.cos(Math.toRadians(angle)) * depth * 10.0);
        int y2 = yl + (int) (Math.sin(Math.toRadians(angle)) * depth * 10.0);
        g.drawLine(xl,yl,x2,y2);
        drawTree(g, x2, y2, angle - 20, depth-1);
        drawTree(g, x2, y2, angle+20, depth-1);
    }
}
