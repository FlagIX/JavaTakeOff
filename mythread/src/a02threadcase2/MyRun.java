package a02threadcase2;

public class MyRun implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //书写线程要运行的代码

            //获取当前线程的对象
            System.out.println(Thread.currentThread().getName() + "Hello World");
        }
    }
}
