package a17test3;

public class MyThread extends Thread {
    static int num = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (num == 100) {
                    break;
                } else {
                    if (num % 2 == 1) {
                        System.out.println(getName() + ":" + num);
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    num++;
                }
            }
        }
    }
}
