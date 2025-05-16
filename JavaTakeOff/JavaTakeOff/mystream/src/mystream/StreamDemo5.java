package mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class StreamDemo5 {
    public static void main(String[] args) {
        //map       转换流中的数据类型
        //注意I:中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
        //注意2：修改Stream流中的数据，不会影响原来集合或者数组中的数据

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌-21","周芷若-18","赵敏-16","张强-21","张三丰-100","张翠山-32","张良-49","谢广坤-33");

        //需求：只获取里面的年龄并进行打印
        //String->int

        //当map方法执行完毕之后，流上的数据就变成了整数
        //所以在下面forEach当中，s依次表示流里面的每一个数据，这个数据现在就是整数了
        
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] arr = s.split("-");
                String str = arr[1];
                int age = Integer.parseInt(str);
                return age;
            }
        }).forEach(s-> System.out.println(s));

        System.out.println("--------------------");

        list.stream().map(s->Integer.parseInt(s.split("-")[1])).forEach(s-> System.out.println(s));
    }
}
