package a01threadcase1;

public class MyThread extends Thread{
    @Override
    public void run() {
        //书写线程要执行的代码
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "Hello World");
        }
    }
}
