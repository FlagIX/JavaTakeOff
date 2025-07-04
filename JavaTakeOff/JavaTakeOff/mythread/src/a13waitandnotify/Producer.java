package a13waitandnotify;

public class Producer extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Warehouse.lock) {
                if (Warehouse.count == 0) {
                    break;
                } else {
                    if (Warehouse.flag == 0) {
                        //如果没有，就制作食物
                        System.out.println("生产者开始做面条");
                        //修改桌子上的食物状态
                        Warehouse.flag = 1;
                        //侥幸等待的消费者开吃
                        Warehouse.lock.notifyAll();

                    } else {
                        try {
                            Warehouse.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }
}
