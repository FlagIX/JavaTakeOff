package a05myset;

import java.util.LinkedHashSet;

public class a04LinkedHashSetDemo1 {
    public static void main(String[] args) {

        //创建学生对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhangsan",23);

        //创建集合并添加元素
        LinkedHashSet<Student> lhs = new LinkedHashSet<>();

        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));


        //打印
        System.out.println(lhs);
    }
}
