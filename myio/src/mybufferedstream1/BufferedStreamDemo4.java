package mybufferedstream1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamDemo4 {
    public static void main(String[] args) throws IOException {
        /*
        字符缓冲输出流
        构造方法：
            public BufferedWriter(Writer r)
        特有方法：
            public void newLine()
        跨平台的换行
        */

        //创建对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("myio\\b.txt",true));

        //写入数据
        bw.write("哈哈哈");
        //跨平台的换行(BufferedWriter独有)
        bw.newLine();
        bw.write("下次一定");

        //关流
        bw.close();
    }
}
