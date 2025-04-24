package mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class a01CollectionDemo2 {
    public static void main(String[] args) {
        //创建一个集合
        Collection<Student> coll = new ArrayList<>();

        //创建学生对象
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);

        //将学生对象加入到集合中
        coll.add(s1);
        coll.add(s2);
        coll.add(s3);

        //contains(Objectobj)   判断是否包含
        Student s4 = new Student("zhangsan", 23);

        //因为contains方法在底层依赖equals方法判断对象是否一致的
        //如果存的是自定义对象，没有重写equals方法，那么默认使用object类中的equals方法进行判断，而object类中equals方法，依赖地址值进行判断。
        //需求：如果同姓名和同年龄，就认为是同一个学生。
        //所以，需要在自定义的Javabean类中，重写equals方法就可以了。
        System.out.println(coll.contains(s4));//true
    }
}
