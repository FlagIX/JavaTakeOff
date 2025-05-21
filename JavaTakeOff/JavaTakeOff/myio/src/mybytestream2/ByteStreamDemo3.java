package mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //字节输入流循环读取

        //1.创建对象
        FileInputStream fis = new FileInputStream("JavaTakeOff\\myio\\a.txt");

        //2.读取数据
        int b;
        while ((b = fis.read()) != -1){
            System.out.print((char) b);
        }

        //3.释放资源
        fis.close();
    }
}
