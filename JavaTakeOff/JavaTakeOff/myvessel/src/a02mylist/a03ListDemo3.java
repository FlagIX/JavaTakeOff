package a02mylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class a03ListDemo3 {
    public static void main(String[] args) {
        /*
        List系列集合的五种遍历方式：
        1.迭代器
        2.列表迭代器
        3.增强for
        4.Lambda表达式
        5.普通for循环

            细节：  在遍历的过程中需要删除元素，请使用迭代器。
                    在遍历的过程中需要添加元素，请使用列表迭代器
                    仅仅想遍历，那么使用增强for或Lambda表达式。
                    如果遍历的时候想操作索引，可以用普通for。
                */

        //创建集合并添加元素
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //1.迭代器
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()){
//            String str = it.next();
//            System.out.println(str);
//        }

        //2.增强for
        //下面的变量s,其实就是一个第三方的变量而己。
        //在循环的过程中，依次表示集合中的每一个元素
//        for (String s : list) {
//            System.out.println(s);
//        }


        //3.Lambda表达式
        //forEach方法的底层其实就是一个循环遍历，依次得到集合中的每一个元素
        //并把每一个元素传递给下面的accept方法
        //accept方法的形参s,依次表示集合中的每一个元素
//        list.forEach((String s)-> {
//                    System.out.println(s);
//                }
//        );

        //4.普通for循环
        //size方法跟get方法还有循环结合的方式，利用索引获取到集合中的每一个元素
//        for (int i = 0; i < list.size(); i++) {
//            String str = list.get(i);
//            System.out.println(str);
//        }


        //5.列表迭代器
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()){
            String str1 = lit.next();
            if(str1.equals("bbb")){
                //不能用集合的方法给迭代器进行添加
                //list.add("qqq");
                lit.add("qqq");
            }
            System.out.println(str1);
        }

        System.out.println(list);

        //hasPrevious(),previous()这两个方法使迭代器反过来遍历
        //但是有局限性：因为迭代器的指针不会复位，所以这两个方法不能直接使用，得让迭代器遍历过之后再使用

//        while (lit.hasPrevious()){
//            String str2 = lit.previous();
//            System.out.println(str2);
//        }

    }
}
