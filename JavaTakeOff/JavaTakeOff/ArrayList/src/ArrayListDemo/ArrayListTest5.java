package ArrayListDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest5 {
    public static void main(String[] args) {
        //需求：定义一个集合，用键盘录入的方式添加一些学生对象，并进行遍历
        //学生类的属性为：姓名，年龄

        //定义一个集合
        ArrayList<Student1> list = new ArrayList<>();

        //添加学生对象
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student1 stu = new Student1();
            System.out.println("请输入学生姓名");
            String name = sc.next();
            System.out.println("请输入学生年龄");
            int age = sc.nextInt();

            //把姓名年龄赋值给学生对象
            stu.setName(name);
            stu.setAge(age);

            //把学生对象放入集合
            list.add(stu);

        }

        //遍历
        for (int i = 0; i < list.size(); i++) {
            Student1 s = list.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
