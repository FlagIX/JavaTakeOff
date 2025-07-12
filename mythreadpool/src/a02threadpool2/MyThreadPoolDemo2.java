package a02threadpool2;

public class MyThreadPoolDemo2 {
    public static void main(String[] args) {
        //向]ava虚拟机返回可用处理器的数目
        int count = Runtime.getRuntime().availableProcessors();
        System.out.println(count);
    }
}
