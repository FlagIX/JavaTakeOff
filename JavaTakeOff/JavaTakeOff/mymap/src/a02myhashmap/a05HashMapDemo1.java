package a02myhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class a05HashMapDemo1 {
    public static void main(String[] args) {
        //需求：创建一个HashMap集合，键是学生对象(Student),值是籍贯(String)。
        //存储三个键值对元素，并遍历
        //要求：同姓名，同年龄认为是同一个学生

        //核心点：
        //HashMap的键位置如果存储的是自定义对象，需要重写nashCode和equals方法。


        //创建学生对象
        Student s1 = new Student("张三",23);
        Student s2 = new Student("李四",24);
        Student s3 = new Student("王五",25);
        Student s4 = new Student("王五",25);

        //创建集合
        Map<Student, String> map = new HashMap<>();

        //添加元素
        map.put(s1,"湖南");
        map.put(s2,"湖北");
        map.put(s3,"江西");
        map.put(s4,"安徽");

        //遍历集合
        map.forEach(new BiConsumer<Student, String>() {
            @Override
            public void accept(Student student, String s) {
                System.out.println(student + " " + s);
            }
        });

        System.out.println("--------------------------");

        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        System.out.println("--------------------------");

        Set<Student> keys = map.keySet();
        for (Student key : keys) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
