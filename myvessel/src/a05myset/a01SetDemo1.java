package a05myset;

import java.util.HashSet;
import java.util.Set;

public class a01SetDemo1 {
    public static void main(String[] args) {
        //利用Set系列的集合，添加字符串，并使用多种方式遍历。
        //迭代器
        //增强for
        //Lambda表达式

        //创建一个set集合
        Set<String> s = new HashSet<>();

        //添加元素
        //不重复
        boolean r1 = s.add("张三");
        boolean r2 = s.add("张三");
        System.out.println(r1);
        System.out.println(r2);
        s.add("李四");
        s.add("王五");

        //打印集合
        //无序
        System.out.println(s);//[李四, 张三, 王五]

        //遍历集合
        //迭代器
//        Iterator<String> it = s.iterator();
//        while (it.hasNext()){
//            String str1 = it.next();
//            System.out.println(str1);
//        }

        //增强for
//        for (String str2 : s) {
//            System.out.println(str2);
//        }

        //Lambda表达式
        s.forEach(str3-> System.out.println(str3));
    }
}
