package a14waitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

public class Producer extends Thread{

    ArrayBlockingQueue<String> queue;

    public Producer(ArrayBlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                queue.put("面条");
                System.out.println("厨师放入面条");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
