import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

class MouseMoveEvent extends JPanel{
    BufferedImage img = null;
    int img_x = 0, img_y = 0;
    
    public MouseMoveEvent(){
        try {
			img = ImageIO.read
            (new File("C:\\Users\\user\\Desktop\\객체지향\\천옥희(1910896, 통계학과)_11주차\\car.png"));
		}catch(IOException e) {
			System.out.print("No Image");
			System.exit(1);
		}
        addMouseListener(new MouseListener() {
            public void mousePressed(MouseEvent e){
                img_x = e.getX();
                img_y = e.getY();
                repaint();
            }
            public void mouseReleased(MouseEvent e){}
            public void mouseEntered(MouseEvent e){}
            public void mouseExited(MouseEvent e){}
            public void mouseClicked(MouseEvent e){}
        });
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(img, img_x, img_y, null);
    }
}
