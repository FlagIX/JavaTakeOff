package a01file;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args ) {

//        public boolean isDirectory()      判断此路径名表示的Fi1e是否为文件夹
//        public boolean isFile()           判断此路径名表示的Fi1e是否为文件
//        public boolean exists()           判断此路径名表示的Fi1e是否存在

        //1.对一个文件的路径进行判断
        File f1 = new File("E:\\Java_space\\File\\a.txt");
        System.out.println(f1.isDirectory());//false
        System.out.println(f1.isFile());//true
        System.out.println(f1.exists());//true
        System.out.println("----------------------");

        //2.对一个文件夹的路径进行判断
        File f2 = new File("E:\\Java_space\\File\\bbb");
        System.out.println(f2.isDirectory());//true
        System.out.println(f2.isFile());//false
        System.out.println(f2.exists());//true
        System.out.println("----------------------");
        //3.对一个不存在的路径进行判断

        File f3 = new File("E:\\Java_space\\File\\aaa");
        System.out.println(f3.isDirectory());//false
        System.out.println(f3.isFile());//false
        System.out.println(f3.exists());//false
    }
}
