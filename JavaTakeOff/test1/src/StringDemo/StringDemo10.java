package StringDemo;

import java.util.Scanner;

public class StringDemo10 {
    public static void main(String[] args) {
        //手机号屏蔽
        //155****2028
        //获取一个手机号
        Scanner sc = new Scanner(System.in);
        String phoneNumber = "";
        while (true) {
            System.out.println("请输入一个手机号码");
            phoneNumber = sc.next();
            if(phoneNumber.length() != 11){
                System.out.println("无效号码");
            }else {
                break;
            }
        }
        /*
        字符串截取
        string.substring();
        * */

        //截取前三位
        String start = phoneNumber.substring(0,3);//(包头不包尾)

        //截取后四位
        String end = phoneNumber.substring(7,11);

        //拼接手机号码
        String newPhoneNumber = "";
        newPhoneNumber = start + "****" + end;
        System.out.println(newPhoneNumber);
    }
}
