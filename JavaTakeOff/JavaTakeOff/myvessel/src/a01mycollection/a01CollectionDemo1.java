package a01mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class a01CollectionDemo1 {
    public static void main(String[] args) {
        /*
        public boolean add(E e)                      添加
        public void clear()                          清空
        public boolean remove(E e)                   删除
        public boolean contains(Objectobj)           判断是否包含
        public boolean isEmpty()                     判断是否为空
        public int size()                            集合长度



        注意点：
        Collection是一个接口，我们不能直接创建他的对象。
        所以，现在我们学习他的方法时，只能创建他实现类的对象。
        实现类：ArrayList
         */

        //目的：为了学习co1 lection接口里面的方法
        //自己在做一些练习的时候，还是按照之前的方式去创建对象。
        Collection<String> coll = new ArrayList<>();

        //1.add(E e)    添加
        //细节1：如果我们要往List系列集合中添加数据，那么方法永远返回true，因为List系列的是允许元素重复的。
        //细节2：如果我们要往Set系列集合中添加数据，如果当前要添加元素不存在，方法返回true，表示添加成功。
        //      如果当前要添加的元素已经存在，方法返回false，表示添加失败。
        //      因为Set系列的集合不允许重复。
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");

        System.out.println(coll);

        //2.clear() 清空
//        coll.clear();
//        System.out.println(coll);

        //3.remove(E e)     删除
        //细节1：因为collection里面定义的是共性的方法，所以此时不能通过索引进行删除。只能通过元素的对象进行删除。
        //细节2：方法会有一个布尔类型的返回值，删除成功返回true，删除失败返回false
        //如果要删除的元素不存在，就会删除失败。
        coll.remove("aaa");
        System.out.println(coll);


        //4.contains(Objectobj)     判断是否包含
        //细节：底层是依赖equa1s方法进行判断是否存在的。
        //所以，如果集合中存储的是自定义对象，也想通过contains方法来判断是否包含，那么在javabean类中，一定要重写equals方法。
        boolean result1 = coll.contains("bbb");
        System.out.println(result1);

        //5.isEmpty()   判断是否为空
        boolean result2 = coll.isEmpty();
        System.out.println(result2);

        //6.Size()      集合长度
        int size = coll.size();
        System.out.println(size);
    }
}
