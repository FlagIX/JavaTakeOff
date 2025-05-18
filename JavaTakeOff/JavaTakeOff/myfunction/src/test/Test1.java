package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        //集合中存储一些字符串的数据，比如：张三，23
        //收集到Student:类型的数组当中（使用方法引用完成)

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三-23","李四-24","王五-25");

        Student[] newArr = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(newArr));
    }
}
