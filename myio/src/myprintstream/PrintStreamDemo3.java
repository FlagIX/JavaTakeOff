package myprintstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*字符打印流：
                构造方法
                public PrintWriter(Write/File/String)                           关联字节输出流/文件/文件路径
                public Printwriter(String fileName,Charset charset)             指定字符编码
                public PrintWriter(Write,boolean autoFlush)                     自动刷新
                public PrintWriter(Write out,boolean autoFlush,String encoding) 指定字符编码且自动刷新
                成员方法：
                public void write(int b)                        常规方法：规则跟之前一样，将指定的字节写出
                public void println(Xxx xx)                     特有方法：打印任意数据，自动刷新，自动换行
                public void print(Xxx xx)                       特有方法：打印任意数据，不换行
                public void printf(String format,object...args) 特有方法：带有占位符的打印语句，不换行
        */

        //创建字节打印流对象
        PrintWriter pw = new PrintWriter(new FileWriter("myio\\c.txt"),true);
        //打印数据
        pw.println("一键三联");
        pw.print("下次一定");
        pw.println();
        pw.printf("%s爱上了%s","阿珍","阿强");

        //关流
        pw.close();
    }
}
