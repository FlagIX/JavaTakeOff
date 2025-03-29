package ComprehensiveTrainingDemo;

import java.util.Scanner;

public class Training5 {
    public static void main(String[] args) {
        /*
        需求：
        在唱比赛中，有6名评委给选手打分，分数范围是[0-100]之间的整数。选手的最后得分为：去掉最
        高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
        */
        int[] arr = getScore();
        //求最大值
        int max = getMax(arr);
        //求最小值
        int min = getMin(arr);
        //求总分
        int sum = getSum(arr);
        //求平均值
        printArr(arr);
        int avg = (sum-max-min)/(arr.length-2);
        System.out.println("选手的最后得分为："+avg);
    }

    //遍历数组
    public static void printArr(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    //求和
    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    //求最大值
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    //求最小值
    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    //求平均值
    public static int[] getScore(){
        int []arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length;) {
            System.out.println("请输入第"+(i+1)+"个评委的分数");
            int score = sc.nextInt();
            if(score>=0&&score<=100){
                arr[i] = score;
                i++;
            }else{
                System.out.println("输入有误,请重新输入");
            }
        }
        return arr;
    }


}
