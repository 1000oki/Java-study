import java.awt.*;

public class LoginUI extends Frame{
    public LoginUI(String msg){
        super(msg);
        setLayout(new FlowLayout());

        Label llg, lpw, lnote;
        TextField login, passwd;
        TextArea note;

        llg = new Label("Login");
        lpw = new Label("Password");
        lnote = new Label("주석");
        login = new TextField(50);
        passwd = new TextField(50);
        passwd.setEchoChar('*');
        note = new TextArea("주석을 다세요", 20, 50);

        add(llg);
        add(login);
        add(lpw);
        add(passwd);
        add(lnote);
        add(note);

        setSize(550, 500);
        setVisible(true);
    }
}
