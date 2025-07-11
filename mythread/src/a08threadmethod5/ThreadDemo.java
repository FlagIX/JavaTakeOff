package a08threadmethod5;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        /*
            public final void join()
            插入线程/插队线程
        */

        MyThread t1 = new MyThread();
        t1.setName("土豆");
        t1.start();

        //表示把t这个线程，插入到当前线程之前。
        //t:土豆
        //当前线程：main线程
        t1.join();

        //执行在main线程当中的
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程" + i);
        }
    }
}
