package MethodDemo;

public class test6 {
    public static void main(String[] args) {
        //定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处
        int [] arr = {11,22,33,44,55};
        boolean judge = judge(arr, 21);
        System.out.println(judge);
    }

    public static boolean judge(int [] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                return true;
            }
        }
        //什么时候才能判定数字在数组中是不存在
        //循环结束后才能判定，所以在循环结束后返回false
        return false;
    }
}
