package JavaBasicConcepts;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
    //键盘录入一个数，获取其中的个位，十位，百位

    //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个实数");
        int number = sc.nextInt();

        //个位
        int ge = number % 10;
        //十位
        int shi = number / 10 % 10;
        //百位
        int bai = number / 100 % 10;
        System.out.println("个位是："+ge);
        System.out.println("十位是："+shi);
        System.out.println("百位是："+bai);
    }
}
