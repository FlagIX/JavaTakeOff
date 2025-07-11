package a10threadsafe2;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
        需求：
            某电影院目前正在上映国产大片，共有1©0张票，而它有3个窗口卖票，请设计一个程序模拟该电影院卖票
            利用同步方法完成
            技巧：同步代码块
        */

        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}
