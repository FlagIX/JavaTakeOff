package a03runtimedemo;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        public static Runtime getRuntime()   当前系统的运行环境对象
        public void exit(int status)         停止虚拟机
        public int availableProcessors()     获得CPU的线程数
        public long maxMemory()              JVM能从系统中获取总内存大小（单位byte)
        public long totalMemory()            JVM已经从系统中获取总内存大小（单位byte)
        public long freeMemory()             JVM剩余内存大小（单位byte)
        public Process exec(String command)         运行cmd命令
        */

        //1.获取Runtime的对象
//        Runtime r1 = Runtime.getRuntime();
//        Runtime r2 = Runtime.getRuntime();
//        System.out.println(r1 == r2);

        //2.停止虚拟机
//        Runtime.getRuntime().exit(0);
//        System.out.println("你看看你的后面呢");

        //3.获得cpu的线程数
        int i = Runtime.getRuntime().availableProcessors();
        System.out.println(i);

        //4.JVM能从系统中获取总内存大小（单位byte)
        long l1 = Runtime.getRuntime().maxMemory();
        System.out.println(l1/1024/1024);

        //5.JVM已经从系统中获取总内存大小（单位byte)
        long l2 = Runtime.getRuntime().totalMemory();
        System.out.println(l2/1024/1024);

        //6.JVM剩余内存大小（单位byte)
        long l3 = Runtime.getRuntime().freeMemory();
        System.out.println(l3/1024/1024);

        //7.运行cmd命令
        //shutdown:关机
        //加上参数才能执行
        //-s:默认在1分钟之后关机
        //-s -t指定时间：指定关机时间
        //-a:取消关机操作
        //-r:关机并重启
        Runtime.getRuntime().exec("shutdown -a");
    }
}
