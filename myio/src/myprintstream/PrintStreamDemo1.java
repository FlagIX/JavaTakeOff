package myprintstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class PrintStreamDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        /*字节打印流：
                构造方法
                public Printstream(OutputStream/File/String)                            关联字节输出流/文件/文件路径
                public Printstream(String fileName,Charset charset)                     指定字符编码
                public Printstream(OutputStreamout,boolean autoFlush)                   自动刷新
                public Printstream(OutputStream out,boolean autoFlush,String encoding)  指定字符编码且自动刷新
                成员方法：
                public void write(int b)                            常规方法：规则跟之前一样，将指定的字节写出
                public void println(Xxx xx)                         特有方法：打印任意数据，自动刷新，自动换行
                public void print(Xxx xx)                           特有方法：打印任意数据，不换行
                public void printf(String format,Object.args)       特有方法：带有占位符的打印语句，不换行
         */
        //创建字节打印流对象
        PrintStream ps = new PrintStream(new FileOutputStream("myio\\b.txt"),true, Charset.forName("UTF-8"));

        //打印数据
        ps.println("一键三联");
        ps.print("下次一定");
        ps.println();
        ps.printf("%s爱上了%s","阿珍","阿强");

        //关流
        ps.close();
    }
}
