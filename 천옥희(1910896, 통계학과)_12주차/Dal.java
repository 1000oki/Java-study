import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

class Dal extends Thread{
    int x, y;
    int speed;
    JFrame app;

    public Dal(JFrame _app, int w, int h){
        app = _app;
        x = w;
        y = h;
    }

    public void run(){
        while(x < 500){
            speed = (int)(Math.random()*50);
            x += speed;
            app.repaint();

            try{
                sleep(speed * 100);
            }catch(Exception ex){}
        }
    }
}
