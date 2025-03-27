package a01staticDemo3;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("张三",18,"男");
        Student s2 = new Student("李四",19,"男");
        Student s3 = new Student("王五",20,"男");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        int maxAge = StudentUtil.getMaxAge(list);
        System.out.println(maxAge);
    }
}
