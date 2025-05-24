package mycharset;

import java.io.FileInputStream;
import java.io.IOException;

public class CharSetDemo1 {
    public static void main(String[] args) throws IOException {
        //字节流读取中文会出现乱码

        //如何不产生乱码
        //不要用字节流读取文本文件
        //编码解码时使用同一个码表，同一个编码方式

        FileInputStream fis = new FileInputStream("JavaTakeOff\\myio\\a.txt");

        int b;
        while ((b = fis.read()) != -1){
            System.out.print((char) b);
        }

        fis.close();
    }
}
