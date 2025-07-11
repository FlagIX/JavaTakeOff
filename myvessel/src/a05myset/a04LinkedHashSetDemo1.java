package a05myset;

import java.util.LinkedHashSet;

public class a04LinkedHashSetDemo1 {
    public static void main(String[] args) {

        //创建学生对象
        Student1 s1 = new Student1("zhangsan",23);
        Student1 s2 = new Student1("lisi",24);
        Student1 s3 = new Student1("wangwu",25);
        Student1 s4 = new Student1("zhangsan",23);

        //创建集合并添加元素
        LinkedHashSet<Student1> lhs = new LinkedHashSet<>();

        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));


        //打印
        System.out.println(lhs);
    }
}
