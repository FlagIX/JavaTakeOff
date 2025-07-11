package a01mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class a03CollectionDemo3 {
    public static void main(String[] args) {
        /*
            Collection.系列集合三种通用的遍历方式：
            1.迭代器遍历
            2.增强for遍历
            3.Lambda表达式遍历


            迭代器遍历相关的三个方法：
            Iterator<E> iterator()：获取一个迭代器对象
            boolean hasNext()
            :判断当前指向的位置是否有元素
            E next()
            :获取当前指向的元素并移动指针
*/

        //创建一个集合
        Collection<String> coll = new ArrayList<>();

        //向集合中添加元素
        coll.add("下");
        coll.add("次");
        coll.add("一");
        coll.add("定");
        coll.add("！");

        //创建迭代器
        //迭代器就好比是一个箭头，默认指向集合的索引处
        Iterator<String> iterator = coll.iterator();

        //利用循环不断的去获取集合中的每一个元素
        while (iterator.hasNext()){
            //4.next方法的两件事情：获取元素并移动指针
            String str = iterator.next();
            System.out.print(str);
        }
    }
}
