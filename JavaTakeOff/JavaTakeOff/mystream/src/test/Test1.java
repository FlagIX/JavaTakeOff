package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        //定义一个集合，并添加一些整数1,2,3,4,5,6,7,8,9,10
        //过滤奇数，只留下偶数。
        //并将结果收集起来

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);

        List<Integer> even = list.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());
        System.out.println(even);
    }
}
