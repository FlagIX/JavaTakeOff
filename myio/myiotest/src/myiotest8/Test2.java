package myiotest8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //Properties跟IO流结合的操作

        //创建集合
        Properties prop = new Properties();

        //添加数据
        prop.put("aaa","111");
        prop.put("bbb","222");
        prop.put("ccc","333");
        prop.put("ddd","444");

        //将集合以键值对的形式写入文件
        FileOutputStream fos = new FileOutputStream("myio\\myiotest\\src\\myiotest8\\a.properties");
        prop.store(fos,"test");
        fos.close();
    }
}
