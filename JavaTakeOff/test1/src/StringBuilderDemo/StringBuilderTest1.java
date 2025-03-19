package StringBuilderDemo;

import java.util.Scanner;

public class StringBuilderTest1 {
    public static void main(String[] args) {
        /*
        反转字符串
        需求：键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
        对称字符串：123321、111
        非对称字符串：123123
        */

        //接收一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        //创建一个StringBuilder来接收字符串

        StringBuilder sb = new StringBuilder(str);

        //反转
        sb.reverse();
        //转换成字符串
        String result = sb.toString();

        //比较字符串
        boolean flag = result.equals(str);

        //判断是否是反转字符串
        if(flag){
            System.out.println("是");
        }else{
            System.out.println("不是");
        }
    }
}
