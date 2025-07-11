package a15test1;

public class MyThread extends Thread{
    static int ticekt = 0;
    @Override
    public void run() {
        while (true){
            synchronized (MyThread.class){
                if(ticekt == 1000){
                    break;
                }else {
                    ticekt++;
                    System.out.println(getName() + "正在售卖第" + ticekt + "张票！！！");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
