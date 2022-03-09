import java.awt.*;

public class LoginUIwithGL extends Frame{
    public LoginUIwithGL(String msg){
        super(msg);
        setLayout(new GridLayout(3,1));

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

        add(p1);
        add(p2);
        add(p3);
        setSize(600,200);
        setVisible(true);
    } 
}
