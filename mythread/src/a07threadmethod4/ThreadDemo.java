package a07threadmethod4;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
            public static void yield()      出让线程/礼让线程

            出让cpu的执行权，但是有可能在下一次抢占中再次抢占cup
            尽可能分布均匀
        */

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("飞机");
        t2.setName("坦克");

        t1.start();
        t2.start();

    }
}
