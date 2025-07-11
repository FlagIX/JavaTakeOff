package a05mycollections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        //public static <T>boolean addAll(Collection<T>c,T...elements)
        //批量添加元素
        //public static void shuffle(List<?>list)
        //打乱List集合元素的顺序


        //创建集合
        ArrayList<String> list = new ArrayList<>();

        //addAll(Collection<T>c,T...elements)    批量添加元素
        Collections.addAll(list,"abc","qwer","df","wasd","asdf","qwer","def");

        //打印
        System.out.println(list);

        //shuffle(List<?>list)      打乱List集合元素的顺序
        Collections.shuffle(list);
        System.out.println(list);
    }
}
