package a02threadcase2;

public class ThreadDemo {
    public static void main(String[] args) {
        /*多线程的第二种启动方式：
            1.自己定义一个类实现Runnab1e接口
            2.重写里面的run方法
            3.创建自己的类的对象
            4.创建一个Thread类的对象，并开启线程
            */
        //创建线程任务
        MyRun mr = new MyRun();

        //创建线程
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        //设置名字
        t1.setName("线程1");
        t2.setName("线程2");

        //开始线程
        t1.start();
        t2.start();
    }
}
