package StringDemo;

import java.util.Scanner;

public class StringDemo11 {
    public static void main(String[] args) {
        //获取身份证
        Scanner sc = new Scanner(System.in);
        String IDnumber = "";
        while (true) {
            System.out.println("请输入一个身份证");
            IDnumber = sc.next();
            if(IDnumber.length()==18){
                break;
            }else {
                System.out.println("无效身份证");
            }
        }
        //截取身份证7-14位
        //7-10:年
        String year = IDnumber.substring(6,10);
        //11-12:月
        String month = IDnumber.substring(10,12);
        //13-14:日
        String day = IDnumber.substring(12,14);
        //出生日期
        String[] bir = {year,month,day};
        String [] arr = {"年","月","日"};
        String birth = "";
        for (int i = 0; i < bir.length; i++) {
            birth = birth + bir[i] + arr[i];
        }
        System.out.println(birth);

        //截取身份证第17位
        char gender = IDnumber.charAt(16);
        int num = gender - 48;
        //判断性别
        if(num%2==0){
            System.out.println("性别为：女");
        }else{
            System.out.println("性别为：男");
        }
    }
}
