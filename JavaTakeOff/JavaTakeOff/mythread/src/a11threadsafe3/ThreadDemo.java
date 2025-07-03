package a11threadsafe3;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
        需求：
            某电影院目前正在上映国产大片，共有1©0张票，而它有3个窗口卖票，请设计一个程序模拟该电影院卖票
            利用JDK5的Lock锁来实现
        */

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}
