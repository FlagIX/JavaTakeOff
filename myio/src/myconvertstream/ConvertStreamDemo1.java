package myconvertstream;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConvertStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        利用转换流按照指定字符编码读取

        利用转换流按照指定字符编码读取（了解）
        因为JDK11:这种方式被淘汰了。替代方案（掌握）
        */

        /*
        //创建对象并指定字符编码
        InputStreamReader isr = new InputStreamReader(new FileInputStream("myio\\gbkfile.txt"),"GBK");
        //读取数据
        int ch;
        while ((ch = isr.read()) != -1){
            System.out.print((char)ch);
        }
        //关流
        isr.close();
        */

        //替代方案
        FileReader fr = new FileReader("\\myio\\\\gbkfile.txt", Charset.forName("GBK"));
        //读取数据
        int ch;
        while ((ch = fr.read()) != -1){
            System.out.print((char)ch);
        }
        //关流
        fr.close();
    }
}
