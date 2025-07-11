package a13waitandnotify;

public class Consumer extends Thread {
    @Override
    public void run() {
        /*
            1.循环
            2.同步代码块
            3,判断共享数据是否到了末尾（到了末尾）
            4,判断共享数据是否到了末尾（没有到末尾，执行核心逻辑）
        */

        while (true) {
            synchronized (Warehouse.lock) {
                if (Warehouse.count == 0) {
                    break;
                } else {
                    //先判断桌子上是否有面条
                    if (Warehouse.flag == 0) {
                        //如果没有，就等待
                        try {
                            Warehouse.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        //把吃的总数-1
                        Warehouse.count--;
                        //如果有，就开吃
                        System.out.println("消费者正在吃面条,他还能吃" + Warehouse.count + "碗！！！");
                        //吃完之后，唤醒厨师继续做
                        Warehouse.lock.notifyAll();
                        //修改桌子的状态
                        Warehouse.flag = 0;
                    }
                }
            }
        }
    }
}
