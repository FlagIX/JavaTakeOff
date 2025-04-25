package mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class a06CollectionDemo6 {
    public static void main(String[] args) {
        /*Co1 lection系列集合三种通用的遍历方式：
        1.迭代器遍历
        2.增强for遍历
        3.lambda表达式遍历


        增强for格式：
        for(数据类型 变量名：集合/数组){

            }

        快速生成方式：
            集合的名字 + for 回车
         */

        //创建集合
        Collection<String> coll = new ArrayList<>();
        //添加元素
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");

        //用增强for循环来遍历集合
        for(String s : coll){
            System.out.println(s);

            //修改增强for中的变量，不会改变集合中原本的数据
            s = "zhao";
        }

        System.out.println(coll);//[zhangsan, lisi, wangwu]

    }
}