package a01file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileDemo9 {
    public static void main(String[] args) {
        /*
        public File[]   listFiles(FileFilter filter)            利用文件名过滤器获取当前该路径下所有内容
        public File[]   listFiles(FilenameFilter filter)        利用文件名过滤器获取当前该路径下所有内容
        */

        //调用File[]   listFiles(FileFilter filter)
        File f = new File("E:\\Java_space\\File");
        File[] arr1 = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile() && pathname.getName().endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(arr1));

        //调用File[]   listFiles(FilenameFilter filter)
        File[] arr2 = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);
                return src.isFile() && src.getName().endsWith(".txt");
            }
        });

        System.out.println(Arrays.toString(arr2));
    }
}
