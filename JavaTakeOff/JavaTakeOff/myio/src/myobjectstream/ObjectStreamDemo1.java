package myobjectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*需求：
            利用序列化流/对象操作输出流，把一个对象写到本地文件中

          构造方法：
            public objectoutputstream   (Outputstream out)      把基本流变成高级流

          成员方法：
            public final void writeobject   (object obj)        把对象序列化（写出）到文件中去
*/
        //1.创建对象
        Student stu = new Student("zhangsan",23,"湖南");
        //2.创建序列化流/对象操作输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("JavaTakeOff\\myio\\a.txt"));
        //3.将对象写入文件
        oos.writeObject(stu);
        //4.关流
        oos.close();


    }
}
