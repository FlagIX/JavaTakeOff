package a04mygenerics;

import java.util.ArrayList;

public class GenericsDemo3 {
    public static void main(String[] args) {
        //定义一个工具类：ListUtil
        //类中定义一个静态方法addAll,用来添加多个集合的元素。

        ArrayList<String> list1 = new ArrayList<>();
        ListUtil.addAll(list1,"aaa","bbb","ccc");
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        ListUtil.addAll2(list2,123,456,789,2313,23,1);
        System.out.println(list2);

    }
}
