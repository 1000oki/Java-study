import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class DalTest extends JFrame{
    Dal a, b, c, d;
    ImageIcon back, img1, img2, img3, img4;

    public DalTest(){
        super("Thread Test: 천옥희");

        setSize(500, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        a = new Dal(this, 50, 155);
        b = new Dal(this, 50, 205);
        c = new Dal(this, 50, 255);
        d = new Dal(this, 50, 305);

        a.start();
        b.start();
        c.start();
        d.start();

    }

    public void paint(Graphics g){
        back = new ImageIcon("back.png");
        img1 = new ImageIcon("1.png");
        img2 = new ImageIcon("2.png");
        img3 = new ImageIcon("3.png");
        img4 = new ImageIcon("4.png");

        g.drawImage(back.getImage(), 0, 30, null);
        g.drawImage(img1.getImage(), a.x, a.y, null);
        g.drawImage(img2.getImage(), b.x, b.y, null);
        g.drawImage(img3.getImage(), c.x, c.y, null);
        g.drawImage(img4.getImage(), d.x, d.y, null);

    }
}
