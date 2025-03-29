package ArrayListDemo;

import java.util.ArrayList;

public class ArratListTest1 {
    public static void main(String[] args) {
        //集合的遍历方式
        //需求：定义一个集合，添加字符串，并进行遍历
        //遍历格式参照：[元素1，元素2，元素3]。

        //定义集合
        ArrayList<String> list = new ArrayList<>();

        //添加字符串
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //遍历
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if(i==0){
                System.out.print("["+str+",");
            } else if (i==list.size()-1) {
                System.out.print(str+"]");
            }else {
                System.out.print(str+",");
            }
        }
    }
}
