package a16test2;

public class MyThread extends Thread {
    static int gift = 100;
    static boolean stopped = false;

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if(stopped){
                    break;
                }
                if (gift < 10) {
                    System.out.println("剩余礼物小于10份,停止送出");
                    stopped = true;
                    break;
                } else {
                    gift--;
                    System.out.println(getName() + "送出礼物," + "还剩余礼物" + gift + "个！！！");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
