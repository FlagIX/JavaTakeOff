package StringJoinerDemo;

import java.util.Scanner;

public class StringTest2 {
    public static void main(String[] args) {
        /*
        调整字符串
        给定两个字符串，A和B。
        A 的旋转操作就是将A最左边的字符移动到最右边。
        例如,若 A='abcde'，在移动一次之后结果就是'bcdea′。
        如果在若干次调整操作之后，A能变成B，那么返回True。
        如果不能匹配成功，则返回false
        */

        //获取两个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串A");
        String str1 = sc.next();
        System.out.println("请输入字符串B");
        String str2 = sc.next();

        boolean flag = revolve(str1,str2);
        if(flag){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

    //旋转字符串
    public static boolean revolve(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        if(str1.equals(str2)){
            return true;
        }
        for (int i = 0; i < str1.length(); i++) {
            str1 = str1.substring(1) + str1.charAt(0);
            //判断
            if(str1.equals(str2)){
                return true;
            }
        }
        return false;
    }
}
