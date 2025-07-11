package a13waitandnotify;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
        需求：完成生产者和消费者（等待唤醒机制)的代码
              实现线程轮流交替执行的效果
        */
        Producer p = new Producer();
        Consumer c = new Consumer();

        p.setName("厨师");
        c.setName("吃货");

        p.start();
        c.start();
    }
}
