package a09threadsafe1;

public class MyThread extends Thread {

    //表示这个类所有的对象，都共享ticket数据
    static int ticket = 0;

    @Override
    public void run() {
        while (true) {
            //同步代码块
            //同步代码块的两个小细节：
            //                      1.synchronized一定要在循环的里面
            //                      2.锁对象一定要是唯一的
            synchronized (MyThread.class) {// 只同步对 ticket 的操作
                if (ticket < 100) {
                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票");
                } else {
                    break;
                }
            }
            try{
                Thread.sleep(10);// 睡眠放在同步块外，避免阻塞其他线程
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
