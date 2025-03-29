package ArrayListDemo;

import java.util.ArrayList;

public class ArratListTest4 {
    public static void main(String[] args) {
        //需求：定义一个集合，添加一些学生对象，并进行遍历
        //学生类的属性为：姓名，年龄。

        //创建一个集合
        ArrayList<Student1> list = new ArrayList<>();

        //创建学生对象
        Student1 student1 = new Student1("张三",19);
        Student1 student2 = new Student1("李四",18);
        Student1 student3 = new Student1("王五",20);

        //添加学生对象
        list.add(student1);
        list.add(student2);
        list.add(student3);

        //遍历
        for (int i = 0; i < list.size(); i++) {
            Student1 st = list.get(i);
            System.out.println(st.getName()+","+st.getAge());
        }
    }
}
