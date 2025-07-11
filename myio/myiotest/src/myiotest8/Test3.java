package myiotest8;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test3 {
    public static void main(String[] args) throws IOException {
        //创建集合对象
        Properties prop = new Properties();

        //从本地properties文件中读取数据
        FileInputStream fis = new FileInputStream("myio\\myiotest\\src\\myiotest8\\a.properties");
        prop.load(fis);
        fis.close();

        System.out.println(prop);
    }
}
