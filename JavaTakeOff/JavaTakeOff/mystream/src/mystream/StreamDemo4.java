package mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        //distinct      元素去重，依赖(hashCode和equals方法)
        //concat        合并a和b两个流为一个流
        //注意1：中间方法，返回新的Streami流，原来的Stream流只能使用一次，建议使用链式编程
        //注意2：修改Stream流中的数据，不会影响原来集合或者数组中的数据

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张无忌","张无忌","周芷若","赵敏","张强","张三丰","张翠山","张良","谢广坤");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"王二麻子","谢广坤");

        //distinct      元素去重，依赖(hashCode和equals方法)  底层是HashSet
        list1.stream().distinct().forEach(s-> System.out.println(s));
        System.out.println("----------------------");

        //concat(参数是流)        合并a和b两个流为一个流
        Stream.concat(list1.stream(), list2.stream()).forEach(s-> System.out.println(s));
    }
}
