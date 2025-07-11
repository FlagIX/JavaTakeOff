package a01mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class a07CollectionDemo7 {
    public static void main(String[] args) {
        /*Collection系列集合三种通用的遍历方式：
            1.迭代器遍历
            2.增强for遍历
            3.Lambda表达式遍历
            Lambda表达式遍历：
                    default void forEach(Consumer<? super T> action):
*/

        //创建集合
        Collection<String> coll = new ArrayList<>();
        //添加元素
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");

        //2.利用匿名内部类的形式
        //底层原理：
        //其实也会自己遍历集合，依次得到每一个元素
        //把得到的每一个元素，传递给下面的accept方法
        //s依次表示集合中的每一个数据
//        coll.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        //Lambda表达式
        coll.forEach(s -> System.out.println(s));
    }
}
