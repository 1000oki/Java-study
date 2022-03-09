public class PassWord {
    private String pass;
    private String passwd;

    public PassWord(String pass){
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }

    public void make(String pass) throws PassException {
        if (pass == null) {
            throw new PassException();
        }
        passwd = pass;
    }

    public void len(String pass) throws PassWordData {
        if(pass.length() < 8 || pass.length() > 20){
            throw new PassWordData();
        }
        passwd = pass;
    }

    public void check() {
        System.out.println("Password" + ":" + passwd);
    }
}
