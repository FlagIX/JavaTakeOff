package test;

import java.io.File;

public class Test5 {
    public static void main(String[] args) {
        //统计一个文件夹的总大小
        File f= new File("E:\\Java_space\\File\\aaa");
        long len = getLen(f);
        System.out.println(len);
    }
    public static long getLen(File src){
        long len = 0;
        File[] files = src.listFiles();
        for (File file : files) {
            if(file.isFile()){
                len = len + file.length();
            }else {
                len = len + getLen(file);
            }
        }
        return len;
    }
}
