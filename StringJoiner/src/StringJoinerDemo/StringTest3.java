package StringJoinerDemo;

import java.util.Random;
import java.util.Scanner;

public class StringTest3 {
    public static void main(String[] args) {
        //键盘输入一个字符串，打乱里面的内容
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        String s = dislocateStr(str);
        //打印打乱后的字符串
        System.out.println(s);
    }

    //打乱字符串
    public static String dislocateStr(String str){
        //将字符串变为字符数组
        char[] charArray = str.toCharArray();

        //从0索引开始于随机索引交换来打乱数组
        Random random = new Random();
        for (int i = 0; i < charArray.length; i++) {
            int randonIndex = random.nextInt(charArray.length);
            char temp = charArray[i];
            charArray[i] = charArray[randonIndex];
            charArray[randonIndex] = temp;
        }
        String result = new String(charArray);
        return result;
    }
}
