package myzipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //创建数据源
        File src = new File("E:\\Java_space\\File\\aaa.zip");
        //创建目的地
        File dest = new File("E:\\Java_space\\File");

        //调用方法来解压
        unzip(src,dest);
    }

    private static void unzip(File src,File dest) throws IOException {
        //创建解压流对象
        //解压的本质：把压缩包里面的每一个文件或者文件夹读取出来，按照层级拷贝到目的地当中
        //创建一个解压缩流用来读取压缩包中的数据
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));

        //要先获取到压缩包里面的每一个zipentry对象
        //表示当前在压缩包中获取到的文件或者文件夹
        ZipEntry entry;
        while ((entry = zip.getNextEntry()) != null){
            if(entry.isDirectory()){
                System.out.println(entry);
                //文件夹：需要在目的地dest处创建一个同样的文件爽
                File file = new File(dest,entry.toString());
                file.mkdirs();
            }else {
                //文件：需要读取到压缩包中的文件，并把他存放到目的地dest文件夹中（按照层级目录进行存放）
                FileOutputStream fos = new FileOutputStream(new File(dest,entry.toString()));
                int b;
                while ((b = zip.read()) != -1){
                    fos.write(b);
                }
                fos.close();
                //表示在压缩包中的一个文件处理完毕了。
                zip.closeEntry();
            }
        }
        zip.close();
    }
}
