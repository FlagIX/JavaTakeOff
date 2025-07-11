package mybufferedstream1;

import java.io.*;

public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        需求：
             利用字节缓冲流拷贝文件
        字节缓冲输入流的构造方法：
              public BufferedInputstream(Inputstream is)
        字节缓冲输出流的构造方法：
              public Bufferedoutputstream(Outputstream os)
        */

        //创建字节缓冲流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myio\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myio\\copy.txt"));

        //拷贝文件
        int b;
        while ((b = bis.read()) != -1){
            bos.write(b);
        }

        //关流
        bos.close();
        bis.close();
    }
}
