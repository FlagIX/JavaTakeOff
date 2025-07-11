package mycharstream1;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*第一步：创建对象
        public Filewriter(Filefile)                             创建字符输出流关联本地文件
        public FileWriter(String pathname)                      创建字符输出流关联本地文件
        public FileWriter(File file,boolean append)             创建字符输出流关联本地文件，续写
        public FileWriter(String pathname,boolean append)       创建字符输出流关联本地文件，续写
        第二步：读取数据
        void write(int c)                           写出一个字符
        void write(string str)                      写出一个字符串
        void write(String str,int off,int len)      写出一个字符串的一部分
        void write(char[]cbuf)                      写出一个字符数组
        void write(char[]cbuf,int off,int len)      写出字符数组的一部分
        第三步：释放资源
        public void close() 释放资源/关流
        我   25105
        */

        //1.创建对象
        FileWriter fw = new FileWriter("myio\\copy.txt");
        //2.写入数据
        fw.write(25105);
        fw.write("\r\n");
        fw.write("下次一定");
        fw.write("\r\n");
        char[]chars = {'a','b','c'};
        fw.write(chars);
        //3.释放资源
        fw.close();
    }
}
