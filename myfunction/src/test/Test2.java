package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test2 {
    public static void main(String[] args) {
        //创建集合添加学生对象，学生对象属性：name,age
        //只获取姓名并放到数组当中（使用方法引用完成）

        //技巧：
        //1.现在有没有一个方法符合我当前的需求
        //2.如果有这样的方法，这个方法是否满足引用的规则
        //      静态      类名：：方法名
        //      成员方法    类名：：方法名(方法在此类中,例如Student，getName方法)，对象名::方法名（方法在其他类）
        //                  this::方法名(方法在本类中)，super::方法名(方法在父类中)
        //      构造方法

        ArrayList<Student> list = new ArrayList<>();

        //创建学生对象
        Student s1 = new Student("张三",23);
        Student s2 = new Student("李四",24);
        Student s3 = new Student("王五",25);

        Collections.addAll(list,s1,s2,s3);

        //Student -> String(只取姓名)

        String[] newArr = list.stream().map(Student::getName).toArray(String[]::new);
        //对象：：方法名  要求形参和返回值完全一样
        //类名：：方法名  被引用的方法形参是跟抽象方法第二个参数后面的保持一致

        //String[] newArr = list.stream().map(student -> student.getName()).toArray(String[]::new);

        /*String[] newArr = list.stream().map(new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName();
            }
        }).toArray(String[]::new);*/

        System.out.println(Arrays.toString(newArr));
    }
}
