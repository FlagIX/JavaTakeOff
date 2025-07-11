package a05myset;

import java.util.Iterator;
import java.util.TreeSet;

public class a05TreeSetDemo1 {
    public static void main(String[] args) {
        //创建集合
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(5);
        ts.add(1);
        ts.add(3);
        ts.add(2);
        ts.add(4);


        //对于数值类型：Integer,Double,默认按照从小到大的顺序进行排序。
        //对于字符、字符串类型：按照字符在ASCI川码表中的数字升序进行排序
//        System.out.println(ts);

        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()){
            Integer i = it.next();
            System.out.println(i);
        }

        System.out.println("=======================");

        for (Integer t : ts) {
            System.out.println(t);
        }

        System.out.println("=======================");

        ts.forEach(integer-> System.out.println(integer));
    }
}
