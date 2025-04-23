package search;

import java.util.ArrayList;

public class a01BasicSearchDemo3 {
    public static void main(String[] args) {
        //课堂练习2：
        //需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
        //要求：需要考虑数组中元素有重复的可能性
        //{131,127,147,81,163,23,7,79,81}
        //我要查找81，想要返回的是所有索引3  8

        int [] arr = {131,127,147,81,163,23,7,79,81};
        ArrayList<Integer> list = basicSearchIndex(arr, 81);
        for (int i = 0; i < list.size(); i++) {
            int index = list.get(i);
            System.out.println(index);
        }
    }

    public static ArrayList<Integer> basicSearchIndex(int[] arr, int num){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                list.add(i);
            }
        }
        return list;
    }
}
