package a13waitandnotify;

public class Warehouse {
    /*
        作用：控制生产者和消费者的执行
    */

    //仓库是否有面条 0：没有面条 1：有面条
    public static int flag = 0;

    //总数
    public static int count = 10;

    //锁
    public static Object lock = new Object();
}
