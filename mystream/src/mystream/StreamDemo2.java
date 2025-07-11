package mystream;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        //单列集合      default stream<E>stream()       Collection中的默认方法
        //双列集合      无                               无法直接使用stream流
        //数组          public static <T>Stream<T>stream(T[]array)        Arrays工具类中的静态方法
        //一堆零散数据    public static<T>Stream<T>of(T...values)         Stream接口中的静态方法

        //1.单列集合获取stream流
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e");
//        //获取到一条流水线，并把集合中的数据放到流水线上
//        Stream<String> stream = list.stream();
//        //使用终结方法打印一下流水线上的所有数据
//        stream.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        //list.stream().forEach(s-> System.out.println(s));//forEach()遍历打印Stream流（终结方法）

        //2.双列集合获取Stream流(无法直接获取)
        //创建集合
        HashMap<String,Integer> hm = new HashMap<>();
        //添加数据
        hm.put("aaa",1);
        hm.put("bbb",2);
        hm.put("ccc",3);
        hm.put("ddd",4);
        hm.put("eee",5);

        //第一种获取Stream流的方法(keySet)
        Set<String> keySet = hm.keySet();
        //keySet.stream().forEach(s-> System.out.println(s));

        //第二种获取Stream流的方法(entrySet)
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        //entries.stream().forEach(s-> System.out.println(s));

        //3.数组获取Stream流
        //创建数组
        int[] arr1 = {1,2,3,4,5};
        String[] arr2 = {"1","2","3","4","5"};

        //获取Stream流(Arrays)
        //Arrays.stream(arr1).forEach(s-> System.out.println(s));

        //Arrays.stream(arr2).forEach(s-> System.out.println(s));

        //4.一堆零散数据获取Stream流(Stream接口中的静态方法:Stream.of)
        Stream.of(1,2,3,4,5).forEach(s-> System.out.println(s));
        Stream.of("a","b","c","d","e").forEach(s-> System.out.println(s));

        //注意：
        //Stream接口中静态方法of的细节
        //方法的形参是一个可变参数，可以传递一堆零散的数据，也可以传递数组
        //但是数组必须是引用数据类型的，如果传递基本数据类型，是会把整个数组当做一个元素，放到Stream当中。
        Stream.of(arr1).forEach(s-> System.out.println(s));//[I@3d075dc0
    }
}
