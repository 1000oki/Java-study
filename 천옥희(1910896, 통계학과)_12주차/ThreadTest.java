public class ThreadTest {
    MyThread t1, t2, t3;
    ThreadTest(){
        t1 = new MyThread("Cheon");
        t2 = new MyThread("Ok");
        t3 = new MyThread("Hui");
        
        t1.start();
        t2.start();
        t3.start();
    }
}
