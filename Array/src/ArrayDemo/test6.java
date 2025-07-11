package ArrayDemo;

import java.util.Random;

//需求：定义一个数组，存入1~5。要求打乱数组中所有数据的顺序
public class test6 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            Random r = new Random();
            int IndexRandom = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[IndexRandom];
            arr[IndexRandom] = temp;
        }
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
