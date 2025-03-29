package MethodDemo;

public class test4 {
    public static void main(String[] args) {

        //需求：设计一个方法用于数组遍历，要求遍历的结果是在一行上的。例如：[11,22,33,44,55]
        int [] arr = {11,22,33,44,55};
        printArray(arr);
    }


    //遍历数组
    //需要数组
    public static void printArray(int []arr){
        for(int i = 0;i < arr.length;i++){
          if(i==0){
              System.out.print("["+arr[i]+",");
          }else if(i==arr.length-1){
              System.out.println(arr[i]+"]");
          }else{
              System.out.print(arr[i]+",");
          }
        }
    }
}
