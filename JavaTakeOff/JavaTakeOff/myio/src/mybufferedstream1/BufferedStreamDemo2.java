package mybufferedstream1;

import java.io.*;

public class BufferedStreamDemo2 {
    public static void main(String[] args) throws IOException {


        //创建字节缓冲流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("JavaTakeOff\\myio\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("JavaTakeOff\\myio\\copy2.txt"));

        //拷贝文件
        int len;
        byte[] bytes = new byte[1024];
        while ((len = bis.read()) != -1){
            bos.write(bytes,0,len);
        }

        //关流
        bos.close();
        bis.close();
    }
}
