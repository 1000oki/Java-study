import java.awt.*;

public class LoginUIwithPanel extends Frame {

    public LoginUIwithPanel(String msg){
        super(msg);

        setLayout(new FlowLayout());

        Panel p1, p2, p3;
        Label llg, lpw, lnote;
        TextField login, passwd;
        TextArea note;

        p1 = new Panel();
        p2 = new Panel();
        p3 = new Panel();

        llg = new Label("Login");
        lpw = new Label("Password");
        lnote = new Label("주석");
        login = new TextField(50);
        passwd = new TextField(50);
        passwd.setEchoChar('*');
        note = new TextArea("주석을 다세요", 20, 50);

        p1.add(llg);
        p1.add(login);
        p2.add(lpw);
        p2.add(passwd);
        p3.add(lnote);
        p3.add(note);

        add(p1);
        add(p2);
        add(p3);
        setSize(500,400);
        setVisible(true);
    }
}
