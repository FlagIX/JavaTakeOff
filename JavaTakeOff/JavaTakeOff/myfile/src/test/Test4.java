package test;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        //删除一个多级文件夹
        //1,先除文件夹里面所有的内容
        //2.再删除自己

        File f= new File("E:\\Java_space\\File\\aaa\\ddd");
        deleteDirectory(f);

    }

    public static void deleteDirectory(File f){
        File[] files = f.listFiles();

        //1,先除文件夹里面所有的内容
        for (File file : files) {
            if(file.isFile()){
                file.delete();
            }else {
                deleteDirectory(file);
            }
        }

        //2.再删除自己
        f.delete();
    }
}
