public class Bank {
    public static void main(String args[]){
        Account cheon = new Account("천옥희");
        cheon.deposit(20);
        try{
            cheon.withdraw(15);
        }catch (BalanceOutOfBoundsException be){
            be.printStackTrace();
        }catch (MalformedData me){
            me.printStackTrace();
        }
        cheon.check();
        try {
            cheon.withdraw(10);
        } catch (BalanceOutOfBoundsException be) {
            be.printStackTrace();
        }
        System.out.println("normal termination");  
    }
}
