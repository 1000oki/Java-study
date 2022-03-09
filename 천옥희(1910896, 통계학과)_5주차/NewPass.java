public class NewPass {
    public static void main(String[] args){
        // String pass = null;
        String pass = "1910896";
        PassWord passTest  = new PassWord(pass);

        try{
            passTest.make(pass);
            passTest.len(pass);
        } catch (PassWordData be) {
            be.printStackTrace();
        } catch (PassException me) {
            me.printStackTrace();
        }
        passTest.check();
        System.out.println("normal termination");
    }
}
