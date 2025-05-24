package mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo6 {
    public static void main(String[] args) throws IOException {
        //练习：
        //文件拷贝
        //把D:\source\易子建\2017401390-易子建-飞扬的小鸟\2017401390-易子建-飞扬的小鸟-录屏.avi拷贝到当前模块下。

        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("D:\\source\\易子建\\2017401390-易子建-飞扬的小鸟\\2017401390-易子建-飞扬的小鸟-录屏.avi");
        FileOutputStream fos = new FileOutputStream("JavaTakeOff\\myio\\copy.avi");

        byte[] bytes = new byte[1024 * 1024 * 5];
        //边读边写
        int len;

        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }

        //释放资源
        fos.close();
        fis.close();

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
