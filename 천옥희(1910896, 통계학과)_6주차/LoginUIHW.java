import java.awt.*;

public class LoginUIHW extends Frame{
    public LoginUIHW(String msg){
        super(msg);
        setLayout(new FlowLayout());

        Label llg, lpw, press;
        TextField login, passwd;
        Button ok;

        llg = new Label("Login");
        lpw = new Label("Password");
        login = new TextField(50);
        passwd = new TextField(50);
        passwd.setEchoChar('*');
        press = new Label("press");
        ok = new Button("OK");

        add(llg);
        add(login);
        add(lpw);
        add(passwd);
        add(press);
        add(ok);

        setSize(550, 500);
        setVisible(true);
    }
}
