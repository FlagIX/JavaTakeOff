package a05mycollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        //public static <T>void sort(List<T>list)
        //排序
        //public static <T>void sort(List<T>list,Comparator<T>c)
        //根据指定的规则进行排序
        //public static <T>int binarySearch (List<T>list,T key)
        //以二分查找法查找元素
        //public static <T>void copy(List<T>dest,List<T>src)
        //拷贝集合中的元素
        //public static <T>int fill (List<T>list,T obj)
        //使用指定的元素填充集合
        //public static <T>void max/min(Collection<T>coll)
        //根据默认的自然排序获取最大/小值
        //public static <T>void swap(List<?>list,int i,int j)
        //交换集合中指定位置的元素

        //创建集合
        ArrayList<Integer> list = new ArrayList<>();
        //添加元素
        Collections.addAll(list,2,4,6,7,1,3,8,10,9,5);
        System.out.println(list);

        //sort(List<T>list)     排序
        System.out.println("---------------sort(List<T>list) 排序-------------------");
        Collections.sort(list);
        System.out.println(list);


        //sort(List<T>list,Comparator<T>c)      根据指定的规则进行排序
        System.out.println("-----------------sort(List<T>list,Comparator<T>c) 根据指定的规则进行排序-----------------------");
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int i = o2 - o1;
                return i;
            }
        });
        System.out.println(list);


        //binarySearch (List<T>list,T key)  以二分查找法查找元素
        System.out.println("-----------binarySearch (List<T>list,T key)  以二分查找法查找元素----------------");
        //元素需要有序
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2,1,2,3,4,5,6,7,8,9,10);
        //list ：被查找的列表，必须是已排序的。
        //key ：要查找的目标元素。
        //返回值是目标元素的索引
        System.out.println(Collections.binarySearch(list2, 9));



        //copy(List<T>dest,List<T>src)  拷贝集合中的元素
        System.out.println("------------copy(List<T>dest,List<T>src)  拷贝集合中的元素---------------");
        //把list3中的元素拷贝到list4中
        //会覆盖原来的元素
        //注意点：如果list3的长度>list4的长度，方法会报错
        ArrayList<Integer> list3 = new ArrayList<>();
        Collections.addAll(list3,0,0,0,0,0,0,0,0,0,0);
        Collections.copy(list3,list);
        System.out.println(list3);



        //fill (List<T>list,T obj)  使用指定的元素填充集合
        System.out.println("-------------fill (List<T>list,T obj)  使用指定的元素填充集合---------------");
        //把集合中所有的元素都修改为指定的元素
        Collections.fill(list3,11);
        System.out.println(list3);



        //max/min(Collection<T>coll)    根据默认的自然排序获取最大/小值
        System.out.println("-----------------max/min(Collection<T>coll)    根据默认的自然排序获取最大/小值--------------------");
        Integer max = Collections.max(list2);
        Integer min = Collections.min(list2);
        System.out.println(max);
        System.out.println(min);



        //swap(List<?>list,int i,int j) 交换集合中指定位置的元素
        System.out.println("--------swap(List<?>list,int i,int j) 交换集合中指定位置的元素--------------");
        //i,j是元素的索引
        Collections.swap(list2,0,9);
        System.out.println(list2);
    }
}
