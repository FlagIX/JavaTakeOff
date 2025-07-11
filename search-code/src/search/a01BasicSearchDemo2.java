package search;

public class a01BasicSearchDemo2 {
    public static void main(String[] args) {
        //课堂练习1：
        //需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
        //要求：不需要考虑数组中元素是否重复

        int [] arr = {131,127,147,81,103,23,7,79};
        int flag = BasicSearchIndex(arr, 23);
        System.out.println(flag);
    }
    public static int BasicSearchIndex(int[] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return i;
            }
        }
        return -1;
    }
}
