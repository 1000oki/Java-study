import java.awt.*;

public class LoginUIwithBL extends Frame {
    
    public LoginUIwithBL(String msg){
        super(msg);
        setLayout(new BorderLayout(5,5));

        Panel p1, p2, p3;
        Label llg, lpw, press;
        TextField login, passwd;
        Button ok;

        p1 = new Panel();
        p2 = new Panel();
        p3 = new Panel();

        llg = new Label("Login");
        lpw = new Label("Password");
        login = new TextField(50);
        passwd = new TextField(50);
        passwd.setEchoChar('*');
        press = new Label("press");
        ok = new Button("OK");

        p1.add(llg);
        p1.add(login);
        p2.add(lpw);
        p2.add(passwd);
        p3.add(press);
        p3.add(ok);

        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        add(p3, BorderLayout.SOUTH);
        setSize(550, 150);
        setVisible(true);
    }
}