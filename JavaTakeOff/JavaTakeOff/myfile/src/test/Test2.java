package test;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        //需求：
        //定义一个方法找某一个文件夹中，是否有以avi结尾的电影。
        //(暂时不需要考虑子文件夹)
        File f = new File("E:\\Java_space\\File\\aaa");
        foundAvi(f);
    }

    public static void foundAvi(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile() && file1.getName().endsWith(".avi")) {
                System.out.println(file1);
            }
        }
    }
}
