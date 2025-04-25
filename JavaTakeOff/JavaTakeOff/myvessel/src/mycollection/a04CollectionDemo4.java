package mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class a04CollectionDemo4 {
    public static void main(String[] args) {
        //细节注意点：
        //1,如果没有hasNext()来判断是否存在元素，则会报错NoSuchElementException
        //2,迭代器遍历完毕，指针不会复位
        //3,循环中只能用一次net方法
        //4,迭代器遍历时，不能用集合的方法进行增加或者删除


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
        Iterator<String> iterator1 = coll.iterator();

        //利用循环不断的去获取集合中的每一个元素
        while (iterator1.hasNext()){
            //4.next方法的两件事情：获取元素并移动指针
            String str1 = iterator1.next();
            System.out.println(str1);
        }


        //当上面循环结束之后，迭代器的指针己经指向了最后没有元素的位置
//        System.out.println(iterator.next());

        //迭代器遍历完毕，指针不会复位
        System.out.println(iterator1.hasNext());
        System.out.println(iterator1.hasNext());

        //如果我们要继续第二次遍历集合，只能再次获取一个新的迭代器对象
        Iterator<String> iterator2 = coll.iterator();
        while (iterator2.hasNext()){
            String str2 = iterator2.next();
            System.out.println(str2);
        }
    }
}
