package CirculateDemo;

import java.util.Scanner;

//求质数
//质数：大于1的自然数中，除了1和它本身以外不再有其他因数的自然数，否则就叫合数
public class practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int number = sc.nextInt();
        boolean flag = true;
        for(int i = 2;i<number;i++){
            if(number%i==0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(number+"是质数");
        }else{
            System.out.println(number+"不是质数");
        }
    }
}

