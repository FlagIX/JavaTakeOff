package CirculateDemo;
//求平方根
//键盘录入一个大于等于2的整数x，计算并返回x的平方根。结果只保留整数部分，小数部分将被舍去。
import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num = sc.nextInt();
        for(int i =1;i<=num;i++){
            if(i*i==num){
                System.out.println(i+"就是"+num+"的平方根");
                break;
            }
            else if(i*i>num){
                System.out.println((i-1)+"就是"+num+"的平方根");
                break;
            }
        }
    }
}
