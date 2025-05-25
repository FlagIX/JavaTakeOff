package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //拷贝一个文件夹，考虑子文件夹

        //创建对象表示数据源
        File src = new File("E:\\Java_space\\File\\aaa");
        //创建对象表示目的地
        File dest = new File("E:\\Java_space\\File\\fff");

        //调用方法拷贝文件夹
        copydir(src,dest);
    }

    private static void copydir(File src, File dest) throws IOException {
        //如果文件夹存在则创建失败但不报错，不存在则创建
        dest.mkdirs();

        //进入数据源
        File[] files = src.listFiles();

        //2.遍历数组
        for (File file : files) {
            if(file.isFile()){
                //3.判断文件，拷贝
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest,file.getName()));

                byte[] bytes = new byte[1024];
                int b;
                while ((b = fis.read(bytes)) != -1){
                    fos.write(bytes,0,b);
                }

                fos.close();
                fis.close();

            }else {
                //4.判断文件夹，递归
                copydir(file,new File(dest,file.getName()));
            }
        }

    }
}
