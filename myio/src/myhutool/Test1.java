package myhutool;

import cn.hutool.core.io.FileUtil;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        /*FileUtil类：
            file:根据参数创建一个file对象
            touch:
            根据参数创建文件
            writeLines:把集合中的数据写出到文件中，覆盖模式。
            appendLines:把集合中的数据写出到文件中，续写模式
            readLines:指定字符编码，把文件中的数据，读到集合中。
            readUtf8Lines:按照UTF-8的形式，把文件中的数据，读到集合中
            copy:拷贝文件或者文件夹t
         */

        File file = FileUtil.file("E:\\Java_space","File", "bbb", "a.txt");
        System.out.println(file);

        FileUtil.touch(file);


    }
}
