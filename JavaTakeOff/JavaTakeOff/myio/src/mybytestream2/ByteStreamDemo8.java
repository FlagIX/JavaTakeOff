package mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo8 {
    public static void main(String[] args) {
        /*
        JDK7:IO流中捕获异常的写法
            try后面的小括号中写创建对象的代码，
            注意：只有实现了AutoCloseable:接口的类，才能在小括号中创建对象。
            try(){

            }catch(){

            }
        */

        try(FileInputStream fis = new FileInputStream("D:\\source\\易子建\\2017401390-易子建-飞扬的小鸟\\2017401390-易子建-飞扬的小鸟-录屏.avi");
            FileOutputStream fos = new FileOutputStream("JavaTakeOff\\myio\\copy.avi");){

            byte[] bytes = new byte[1024 * 1024 * 5];
            //边读边写
            int len;

            while ((len = fis.read(bytes)) != -1){
                fos.write(bytes,0,len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
