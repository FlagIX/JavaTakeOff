package a06test;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        /*班级里有N个学生，学生属性：姓名，年龄，性别。
            实现随机点名器。
            */

        //创建集合
        ArrayList<String> list = new ArrayList<>();
        //向集合添加元素
        Collections.addAll(list,"陈建峰","秦学升","徐浩霖","刘忠武","冯汉民","唐琪伟");
        //随机点名
        //方法一：
//        Random r = new Random();
//        int index = r.nextInt(list.size());
//        System.out.println(list.get(index));

        //方法二：
        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
