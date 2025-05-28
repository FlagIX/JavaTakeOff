package myconvertstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConvertStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*将本地文件中的GBK文件，转成UTF-8*/

        //创建对象
        FileReader fr = new FileReader("JavaTakeOff\\\\myio\\\\gbkfile.txt", Charset.forName("GBK"));

        FileWriter fw = new FileWriter("JavaTakeOff\\\\myio\\\\c.txt",Charset.forName("UTF-8"));

        //读取数据并写入数据
        int ch;
        while ((ch = fr.read()) != -1){
            fw.write(ch);
        }
        //关流
        fw.close();
        fr.close();


    }
}
