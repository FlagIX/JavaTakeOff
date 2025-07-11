package mybytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //void write(int b)                             一次写一个字节数据
        //void write(byte[]b)                           一次写一个字节数组数据
        //void write(byte[]b,int off,int len)           一次写一个字节数组的部分数据
        //参数一：
        //      数组
        //参数二：
        //      起始索引    0
        //参数三：
        //      个数        3

        //1.创建对象
        //写出输出流    Outputstream
        //本地文件      File
        FileOutputStream fos = new FileOutputStream("myio\\a.txt");
        //2.写出数据
        //1.void write(int b)       一次写一个字节数据
//        fos.write(97);//a

        //2.void write(byte[]b)     一次写一个字节数组数据
        byte[] arr = {97,98,99,100,101};
//

        //3.void write(byte[]b,int off,int len)     一次写一个字节数组的部分数据
        fos.write(arr,1,3);
        //3.释放资源
        fos.close();
    }
}
