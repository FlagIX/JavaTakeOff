package myzipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //1.创建Fi1e对象表示要压缩的文件夹
        File src = new File("E:\\Java_space\\File\\aaa");
        //2.创建Fi1e对象表示压缩包放在哪里（压缩包的父级路径）
        File destParent = src.getParentFile();
        //3.创建Fi1e对象表示压缩包的路径
        File dest = new File(destParent, src.getName() + ".zip");
        //4.创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        //5.获取src里面的每一个文件，变成ZipEntry对象，放入到压缩包当中
        toZip(src,zos,src.getName());
        //6.释放资源
        zos.close();
    }

    //作用：获取src里面的每一个文件，变成ZipEntry对象，放入到压缩包当中
    //参数一：数据源
    //参数二：压缩流
    //参数三：压缩包内部的路径
    private static void toZip(File src,ZipOutputStream zos,String name) throws IOException {
        File[] files = src.listFiles();
        for (File file : files) {
            if(file.isFile()){
                //3.判断-文件，变成ZipEntry对象，放入到压缩包当中
                ZipEntry entry = new ZipEntry(name + "\\" + file.getName());
                zos.putNextEntry(entry);
                FileInputStream fis = new FileInputStream(file);
                int b;
                while ((b = fis.read()) != -1){
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();
            }else {
                //4.判断-文件夹，递归
                toZip(file,zos,name + "\\" + file.getName());
            }
        }
    }
}
