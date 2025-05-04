package a05myset;

import java.util.TreeSet;

public class a06TreeSetDemo2 {
    public static void main(String[] args) {
        //需求：创建TreeSet集合，并添加3个学生对象
        //学生对象属性：
        //姓名，年龄。
        //要求按照学生的年龄进行排序
        //同年龄按照姓名字母排列（暂不考虑中文）
        //同姓名，同年龄认为是同一个人

        //方式一：
        //默认的排序规则/自然排序
        //Student1实现Comparable:接口，重写里面的抽象方法，再指定比较规则

        //创建学生对象
        Student2 s1= new Student2("zhangsan",23);
        Student2 s2= new Student2("lisi",24);
        Student2 s3= new Student2("wangwu",25);

        //创建集合
        TreeSet<Student2> ts = new TreeSet<>();

        ts.add(s3);
        ts.add(s2);
        ts.add(s1);

        //打印
        System.out.println(ts);
    }
}
