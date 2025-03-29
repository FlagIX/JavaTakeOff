package MethodDemo;

public class test5 {
    public static void main(String[] args) {

        //需求：设计一个方法求数组的最大值，并将最大值返回

        int [] arr = {11,22,33,44,55};
        int max = getMax(arr);
        System.out.println(max);
    }

    public static int getMax(int []arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
