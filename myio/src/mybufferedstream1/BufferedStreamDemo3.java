package mybufferedstream1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
        字符缓冲输入流：
        构造方法：
            public BufferedReader(Reader r)
        特有方法：
            public String readLine()
        读一整行
        */

        //创建对象
        BufferedReader br = new BufferedReader(new FileReader("myio\\a.txt"));

        //读取数据
//        String s = br.readLine();
//        System.out.println(s);

        //readLine()读完后的返回值是null
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }

        //关流
        br.close();
    }
}
