package a02mylist;

import java.util.ArrayList;
import java.util.List;

public class a01ListDemo1 {
    public static void main(String[] args) {
        /*
        List系列集合独有的方法：
        void add(int index,E element)       在此集合中的指定位置插入指定的元素
        E remove(int index)                 删除指定索引处的元素，返回被删除的元素
        E set(int index,E element)          修改指定索引处的元素，返回被修改的元素
        E get(int index)                    返回指定索引处的元素
*/

        //创建一个集合
        List<String> list = new ArrayList<>();

        //添加元素
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");

        //void add(int index,E element)     在此集合中的指定位置插入指定的元素
        list.add(1,"QQQ");


        //E remove(int index)       删除指定索引处的元素，返回被删除的元素
        String remove = list.remove(2);
        System.out.println(remove);


        //E set(int index,E element)          修改指定索引处的元素，返回被修改的元素
        String result = list.set(0, "ZZZ");
        System.out.println(result);

        //E get(int index)                    返回指定索引处的元素
        String str = list.get(2);
        System.out.println(str);

        System.out.println(list);
    }
}
