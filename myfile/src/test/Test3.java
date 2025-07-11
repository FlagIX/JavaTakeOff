package test;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        //需求：
        //定义一个方法找某一个文件夹中，是否有以avi结尾的电影。
        //(需要考虑子文件夹)

        File f = new File("E:\\Java_space\\File\\aaa");
        foundAVI(f);

    }
    public static void foundAVI(File f){
        File[] files = f.listFiles();
        for (File file : files) {
            if(file.isFile()){
                //判断，如果是文件，就可以执行题目的业务逻辑
                if(file.getName().endsWith(".avi")){
                    System.out.println(file);
                }
            }else {
                //4,判断，如果是文件夹，就可以递归
                //细节：再次调用本方法的时候，参数一定要是f的次一级路径
                foundAVI(file);
            }
        }
    }
}
