package myobjectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectStreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
        需求：
            利用反序列化流/对象操作输入流，把文件中中的对象读到程序当中

        构造方法：
            public objectInputstream(Inputstream out)       把基本流变成高级流

        成员方法：
            public object readobject()                      把序列化到本地文件中的对象，读取到程序中来

       */

        //1.创建反序列化流/对象操作输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("JavaTakeOff\\myio\\a.txt"));
        //2.把序列化到本地文件中的对象，读取到程序中来
        Student o = (Student) ois.readObject();
        //3.关流
        ois.close();
        //4.打印对象
        System.out.println(o);

    }
}
