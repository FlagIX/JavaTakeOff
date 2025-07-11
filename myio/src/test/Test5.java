package test;

import java.io.*;

public class Test5 {
    public static void main(String[] args) throws IOException {
        /*四种方式拷贝文件，并统计各自用时
        字节流的基本流：一次读写一个字节
        字节流的基本流：一次读写一个字节数组
        字节缓冲流：一次读写一个字节
        字节缓冲流：一次读写一个字节数组
        */

        long start = System.currentTimeMillis();
        //mothed1();
        //mothed2();
        //mothed3();
        //mothed4();
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }

    private static void mothed4() throws IOException {
        //字节缓冲流：一次读写一个字节
        //创建对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myio\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myio\\copy.txt"));

        //拷贝文件
        int len;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }
        //关流
        bos.close();
        bis.close();
    }

    private static void mothed3() throws IOException {
        //字节缓冲流：一次读写一个字节
        //创建对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myio\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myio\\copy.txt"));

        //拷贝文件
        int b;
        while ((b = bis.read()) != -1){
            bos.write(b);
        }
        //关流
        bos.close();
        bis.close();
    }

    private static void mothed2() throws IOException {
        //字节流的基本流：一次读写一个字节数组
        //创建对象
        FileInputStream fis = new FileInputStream("myio\\a.txt");
        FileOutputStream fos = new FileOutputStream("myio\\copy.txt");

        //拷贝文件
        int len;
        byte[] bytes = new byte[1024];
        while (((len = fis.read(bytes))) != -1){
            fos.write(bytes,0,len);
        }

        //关流
        fos.close();
        fis.close();
    }

    private static void mothed1() throws IOException {
        //字节流的基本流：一次读写一个字节
        //创建对象
        FileInputStream fis = new FileInputStream("myio\\a.txt");
        FileOutputStream fos = new FileOutputStream("myio\\copy.txt");

        //拷贝文件
        int b;
        while (((b = fis.read())) != -1){
            fos.write(b);
        }

        //关流
        fos.close();
        fis.close();
    }

}
