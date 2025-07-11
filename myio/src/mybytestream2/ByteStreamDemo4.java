package mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        /*
        练习：
        文件拷贝
        把D:\source\易子建\2017401390-易子建-飞扬的小鸟\2017401390-易子建-飞扬的小鸟-录屏.avi拷贝到当前模块下。
        注意：
        选择一个比较小的文件，不要太大。大文件拷贝我们下一个视频会说。
        */

        //1.创建对象
        FileInputStream fis = new FileInputStream("D:\\source\\易子建\\2017401390-易子建-飞扬的小鸟\\2017401390-易子建-飞扬的小鸟-录屏.avi");
        FileOutputStream fos = new FileOutputStream("myio\\copy.avi");

        //2.拷贝
        //核心思想：边读边写
        int b;
        long start = System.currentTimeMillis();
        while ((b = fis.read())!= -1){
            fos.write(b);
        }

        //3.释放资源
        //规则：先开的最后关闭
        fos.close();
        fis.close();

        long end = System.currentTimeMillis();

        System.out.println(end - start);

    }
}
