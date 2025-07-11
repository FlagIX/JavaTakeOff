package test;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //在当前模块下的aaa文件夹中创建一个a.txt文件

//        File f = new File("E:\\Java_space\\File\\aaa\\a.txt");
//        boolean newFile = f.createNewFile();
//        System.out.println(newFile);

        //1.创建a.txt的父级路径
        File f = new File("E:\\\\Java_space\\\\File\\\\aaa");
        //2.创建父级路径
        //如果aaa是存在的，那么此时创建失败的。
        //如果aaa是不存在的，那么此时创建成功的。
        f.mkdirs();
        //3.拼接父级路径和子级路径
        File src = new File(f,"a.txt");
        boolean b = src.createNewFile();
        System.out.println(b);
    }
}
