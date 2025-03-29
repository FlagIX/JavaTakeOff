package ArrayListDemo;

import java.util.ArrayList;

public class ArratListTest2 {
    public static void main(String[] args) {
        //集合的遍历方式
        //需求：定义一个集合，添加数字，并进行遍历（用包装类）
        //遍历格式参照：[元素1，元素2，元素3]。

        //定义集合
        ArrayList<Integer> list = new ArrayList<>();

        //添加字符串
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //遍历
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if(i==0){
                System.out.print("["+num+",");
            } else if (i==list.size()-1) {
                System.out.print(num+"]");
            }else {
                System.out.print(num+",");
            }
        }
    }
}
