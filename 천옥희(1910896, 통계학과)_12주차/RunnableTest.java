public class RunnableTest {
    RunnableTest(){
        Thread t1 = new Thread(new MyRunnable1(), "Cheon");
        Thread t2 = new Thread(new MyRunnable2(), "Ok");
        Thread t3 = new Thread(new MyRunnable3(), "Hui");
        t1.start();
        t2.start();
        t3.start();
    }
}
