package mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo7 {
    public static void main(String[] args) {
        //利用try...catch..finally捕获拷贝文件中代码出现的异常

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("D:\\source\\易子建\\2017401390-易子建-飞扬的小鸟\\2017401390-易子建-飞扬的小鸟-录屏.avi");
            fos = new FileOutputStream("myio\\copy.avi");

            byte[] bytes = new byte[1024 * 1024 * 5];
            //边读边写
            int len;

            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            //释放资源
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }


            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
