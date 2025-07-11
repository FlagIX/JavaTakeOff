package a01file;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {
//        public boolean createNewFile()        创建一个新的空的文件
//        public boolean mkdir()                创建单级文件夹
//        public boolean mkdirs()               创建多级文件夹


        //1.createNewFile创建一个新的空的文件
        //细节1：如果当前路径表示的文件是不存在的，则创建成功，方法返回true
        //      如果当前路径表示的文件是存在的，则创建失败，方法返回fa1se
        //细节2：如果父级路径是不存在的，那么方法会有异常I0 Exception
        //细节3：createNewF.1e方法创建的一定是文件，如果路径中不包含后缀名，则创建一个没有后缀的文件

        File f1 = new File("E:\\Java_space\\File\\c.txt");
        boolean result1 = f1.createNewFile();
        System.out.println(result1);

        File f2 = new File("E:\\Java_space\\File\\aaa");
        boolean result2 = f2.createNewFile();
        System.out.println(result2);

        //2.mkdir     创建单级文件夹
        //细节1：windows当中路径是唯一的，如果当前路径已经存在，则创建失败，返回false
        //细节2：mkdir方法只能创建单级文件夹，无法创建多级文件夹。
        File f3 = new File("E:\\Java_space\\File\\eee");
        boolean result3 = f3.mkdir();
        System.out.println(result3);

        //3.mkdirs      创建多级文件夹
        //细节：既可以创建单级的，又可以创建多级的文件夹
        File f4 = new File("E:\\Java_space\\File\\ggg\\bbb\\ccc");
        boolean result4 = f4.mkdirs();
        System.out.println(result4);

        File f5 = new File("E:\\Java_space\\File\\ddd");
        boolean result5 = f5.mkdirs();
        System.out.println(result5);
    }
}
