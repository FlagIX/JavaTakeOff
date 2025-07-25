package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        /*
        为了保证文件的安全性，就需要对原始文件进行加密存储，再使用的时候再对其进行解密处理。
        加密原理：
        对原始文件中的每一个字节数据进行更改，然后将更改以后的数据存储到新的文件中。
        解密原理：
        读取加密之后的文件，按照加密的规则反向操作，变成原始文件。

        ^:异或
        两边相同：false
        两边不同：true

        0:false
        1:true

        100:1100100
        10:1010

        1100100
       ^0001010
       --------
        1101110
       ^0001010
       --------
        1100100
        十进制：100
        */

        //创建对象关联原始文件
        FileInputStream fis = new FileInputStream("myio\\ency.txt");
        //创建对象关联加密文件
        FileOutputStream fos = new FileOutputStream("myio\\a.txt");

        int b;
        while ((b = fis.read()) != -1){
            fos.write(b^2);
        }

        fos.close();
        fis.close();
    }
}
