package a04mytreemap;

import java.util.Comparator;
import java.util.TreeMap;

public class a01TreeMapDemo1 {
    public static void main(String[] args) {
        //TreeMap集合：基本应用
        //需求1：
        //键：整数表示id
        //值：字符串表示商品名称
        //要求：按照id的升序排列、按照id的降序排列


        //按照id的升序排列
        //创建集合
        TreeMap<Integer,String> tm1 = new TreeMap<>();

        //添加元素
        tm1.put(1,"雪碧");
        tm1.put(3,"冰红茶");
        tm1.put(2,"可乐");

        System.out.println(tm1);

        //按照id的降序排列
        TreeMap<Integer,String> tm2 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        //添加元素
        tm2.put(1,"雪碧");
        tm2.put(3,"冰红茶");
        tm2.put(2,"可乐");

        //按照id的降序排列
        System.out.println(tm2);

    }
}
