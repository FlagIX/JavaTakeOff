package a06test;

import java.util.ArrayList;
import java.util.Collections;

public class Test3 {
    public static void main(String[] args) {
        /*班级里有10个学生
        要求：
        被点到的学生不会再被点到。
        但是如果班级中所有的学生都点完了，需要重新开启第二轮点名。*/

        //创建集合
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        Collections.addAll(list, "范闲", "范建", "范统", "杜子腾", "杜琦燕", "宋合泛", "侯笼凑", "朱益群", "朱穆朗玛峰", "袁明媛");

        //创建一个临时的集合来存储原集合中被删掉的元素
        ArrayList<String> temporaryList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            System.out.println("----第"+i+"次点名------");
            //点名(不重复)
            while (!list.isEmpty()) {
                Collections.shuffle(list);
                String name = list.remove(0);
                System.out.println(name);
                temporaryList.add(name);
            }

            list.addAll(temporaryList);
            temporaryList.clear();
        }


    }
}
