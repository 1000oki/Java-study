class MyRunnable1 implements Runnable{
    int sum;
    public void run(){
        sum = 0;
        for (int i = 10; i >= 0; i--){
            sum = sum + i;
            try{
                Thread.sleep(1000);
            }catch (Exception ex){
            }
            System.out.println("Cheon"+i+" ");
        }
        System.out.println("Cheon: SUM" + sum + " ");
    }
}
