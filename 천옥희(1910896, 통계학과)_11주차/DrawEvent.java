import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

class DrawEvent extends JPanel{
    int startX, startY, w, h;
    JPanel jp;

    public void DrawEvent() {

    }

    void drawPanel(){
        addMouseListener(new MouseListener() {
            //마우스를 누를 때
            public void mousePressed(MouseEvent e){  
                startX = e.getX();
                startY = e.getY();
            }

            //마우스를 놓을 때
            public void mouseReleased(MouseEvent e){ 
                w = Math.abs(startX - e.getX());
                h = Math.abs(startY - e.getY());
                repaint();
            }
            //마우스가 해당 컴포넌트 영역 안으로 들어올 때
            public void mouseEntered(MouseEvent e){}
            //마우스가 해당 컴포넌트 영역 밖으로 나갈 때
            public void mouseExited(MouseEvent e){}
            //마우스 클릭했을 때
            public void mouseClicked(MouseEvent e){}
        });

        addMouseMotionListener(new MouseMotionListener(){
            public void mouseDragged(MouseEvent e){
                w = Math.abs(startX - e.getX());
                h = Math.abs(startY - e.getY());
                repaint();
            }
            public void mouseMoved(MouseEvent e){}
        });
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(startX, startY, w, h);
        drawPanel();
    }
}
