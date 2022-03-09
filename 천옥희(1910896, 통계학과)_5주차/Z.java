class Z extends Y {
    int zi = 30;
    String msg = "I am a Z.";
    
    void print() {
        System.out.println(msg);
    }

    void play() {
        System.out.println("Play.."+msg);
    }

    void doZ() {
        System.out.println("do something in Z.");
    }

    void test(int i){
        Z z = new Z();
        Y y = z;
        X x = z;
        z.print();
        y.print();
        super.print();
        play();
        super.play();
        // y.doZ();
        //super.super.print();

        System.out.println("\ni ="+ i);
        System.out.println("this.i = "+ this.xi);
        System.out.println("super.i = "+ super.yi);
        System.out.println("y.i = "+ y.yi);
        System.out.println("x.i = "+ x.xi);
        System.out.println("((Y)this).i = "+ ((Y)this).yi);
        System.out.println("((X)this).i = "+ ((X)this).xi);
       // super.super.i = 10;
    }
}
