package MethodDemo;

public class method4 {
    public static void main(String[] args) {

        int sum1 = getSum(10,20,30);
        int sum2 = getSum(20,30,40);
        int sum3 = getSum(20,30,40);
        int sum4 = getSum(20,30,40);
        int sum = sum1 + sum2 + sum3 + sum4;
        System.out.println(sum);
    }

    public static int getSum(int num1,int num2,int num3){
        int result = num1 + num2 + num3;
        return result;
    }
}
