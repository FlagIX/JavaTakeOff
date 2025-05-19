package a01file;

import java.io.File;

public class FileDemo8 {
    public static void main(String[] args) {
        /*
        (掌握)public Fi1e[]   listFi1es()                       获取当前该路径下所有内容


        */

        File f = new File("E:\\Java_space\\File");
        //需求：我现在要获取E:\Java_space\File文件夹里面所有的txt文件

        File[] files = f.listFiles();
        for (File file : files) {
            if(file.isFile() && file.getName().endsWith(".txt")){
                System.out.println(file);
            }
        }
    }
}
