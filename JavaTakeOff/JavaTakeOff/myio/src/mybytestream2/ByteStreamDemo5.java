package mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo5 {
    public static void main(String[] args) throws IOException {
        //public int read(byte[]buffer)     一次读一个字节数组数据

        //创建对象
        FileInputStream fis = new FileInputStream("JavaTakeOff\\myio\\a.txt");

        byte[] bytes = new byte[2];
        //读取数据
        int len = 0;
        while ((len = fis.read(bytes))!= -1){
            System.out.println(len);
            System.out.println(new String(bytes,0,len));
        }

        //释放资源
        fis.close();
    }
}
