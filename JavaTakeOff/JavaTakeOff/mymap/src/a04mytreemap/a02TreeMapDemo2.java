package a04mytreemap;

import java.util.Comparator;
import java.util.TreeMap;

public class a02TreeMapDemo2 {
    public static void main(String[] args) {
        //TreeMap集合：基本应用
        //需求2：
        //键：学生对象
        //值：籍贯
        //要求：按照学生年龄的升序排列，年龄一样按照姓名的字母排列，同姓名年龄视为同一个人。

        //创建学生对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("wangwu",25);

        //创建集合
        TreeMap<Student,String> tm = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int i = o1.getAge() - o2.getAge();
                i = i == 0?o1.getName().compareTo(o2.getName()):i;
                return i;
            }
        });

        tm.put(s2,"湖南");
        tm.put(s3,"安徽");
        tm.put(s1,"北京");
        tm.put(s4,"江西");

        System.out.println(tm);
    }
}
