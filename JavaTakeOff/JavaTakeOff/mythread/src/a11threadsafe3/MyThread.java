package a11threadsafe3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {

    static int ticket = 0;

    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            //synchronized (MyThread.class) {
            try {
                if (ticket == 100) {
                    break;
                } else {
                    ticket++;
                    System.out.println(getName() + "正在售卖第" + ticket + "张票！！");
                }
            } finally {
                lock.unlock();
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //}
        }
    }
}
