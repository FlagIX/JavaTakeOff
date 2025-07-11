package a10lambdademo;

import java.util.Arrays;

public class LambdaDemo1 {
    public static void main(String[] args) {
        //初识1 ambda表达式
        Integer[]arr={2,3,1,5,6,7,8,4,9};

        /*Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });*/


        Arrays.sort(arr, (Integer o1, Integer o2)-> {
                return o1 - o2;
            }
        );

        System.out.println(Arrays.toString(arr));
    }
}
