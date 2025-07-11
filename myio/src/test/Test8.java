package test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) throws IOException {
        /*需求：
            将多个自定义对象序列化到文件中，但是对象的个数不确定，该如何操作呢？
        */

        //创建学生对象并添加到集合中
        Student s1 = new Student("zhangsan",23,"湖南");
        Student s2 = new Student("lisi",24,"安徽");
        Student s3 = new Student("wangwu",26,"广东");

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //将对象序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myio\\a.txt"));
        oos.writeObject(list);

        oos.close();
    }
}
