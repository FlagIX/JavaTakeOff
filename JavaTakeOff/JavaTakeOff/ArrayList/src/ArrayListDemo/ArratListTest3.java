package ArrayListDemo;

import java.util.ArrayList;

public class ArratListTest3 {
    public static void main(String[] args) {
        //集合的遍历方式
        //需求：定义一个集合，添加字符，并进行遍历（用包装类）
        //遍历格式参照：[元素1，元素2，元素3]。

        //定义集合
        ArrayList<Character> list = new ArrayList<>();

        //添加字符串
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');

        //遍历
        for (int i = 0; i < list.size(); i++) {
            char c = list.get(i);
            if(i==0){
                System.out.print("["+c+",");
            } else if (i==list.size()-1) {
                System.out.print(c+"]");
            }else {
                System.out.print(c+",");
            }
        }
    }
}
