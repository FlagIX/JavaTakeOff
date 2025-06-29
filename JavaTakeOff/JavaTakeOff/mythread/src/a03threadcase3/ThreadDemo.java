package a03threadcase3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*多线程的第三种实现方式：
        特点：可以获取到多线程运行的结果
        1,创建一个类MyCallable实现callable接口
        2.重写call(是有返回值的，表示多线程运行的结果)
        3.创建MyCallable的对象（表示多线程要执行的任务）
        4.创建FutureTask的对象（作用管理多线程运行的结果）
        5.创建Thread类的对象，并启动（表示线程）
*/
        //创建线程任务
        MyCallable mc = new MyCallable();

        //创建管理线程运行结果的对象
        FutureTask<Integer> futureTask = new FutureTask<Integer>(mc);

        //创建线程对象
        Thread thread = new Thread(futureTask);

        thread.start();

        System.out.println(futureTask.get());
    }
}
