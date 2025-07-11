package a14waitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

public class Consumer extends Thread{
    ArrayBlockingQueue<String> queue;

    public Consumer(ArrayBlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                String food = queue.take();
                System.out.println(food);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
