package a05threadmethod2;

public class MyThreadDemo {
    public static void main(String[] args) {
        /*
        setPriority(int newPriority)        设置线程的优先级
        final int getPriority()             获取线程的优先级
*/

        //创建线程任务
        MyRunable mr = new MyRunable();

        //创建线程对象
        Thread t1 = new Thread(mr,"飞机");
        Thread t2 = new Thread(mr,"坦克");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());


        t1.setPriority(1);
        t2.setPriority(10);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        t2.start();
    }
}
