package ObjectOrientedDemo.Test4;

import java.util.Scanner;

public class keyboard {
    public static void main(String[] args) {
        //键盘录入：
        //第一套体系：
        //nextInt();接收整数
        //nextDouble();接收小数
        //next();接收字符串
        //遇到空格，制表符，回车就停止接受。这些符号后面的数据就不会接受了
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num1 = sc.nextInt();
        System.out.println(num1);
        System.out.println("请输入一个整数：");
        int num2 = sc.nextInt();
        System.out.println(num2);
*/

/*
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str1 = sc.next();
        System.out.println(str1);
        System.out.println("请输入一个字符串：");
        String str2 = sc.next();
        System.out.println(str2);
*/

        //第二套体系：
        //nextLine();接收字符串
        //可以接收空格，制表符，回车才停止接受。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line1 = sc.nextLine();
        System.out.println(line1);
        System.out.println("请输入一个字符串：");
        String line2 = sc.nextLine();
        System.out.println(line2);
    }
}
