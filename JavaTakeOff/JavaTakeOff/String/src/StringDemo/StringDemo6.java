package StringDemo;

import java.util.Scanner;

//键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数
//(不考虑其他字符)
public class StringDemo6 {
    public static void main(String[] args) {
        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        //计数器
        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        int otherCount = 0;

        //遍历数组
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //判断字符类型
            //数字字符
            if(c>='1'&&c<='9'){
                numCount++;
            }
            //大写字符
            else if (c>='A'&&c<='Z') {
                bigCount++;
            }
            //小写字符
            else if (c>='a'&&c<='z') {
                smallCount++;
            }else{
                otherCount++;
            }
            if(i==str.length()-1){
                System.out.println(c);
            }else{
                System.out.print(c+" ");
            }
        }
        System.out.println("大写字符出现此数"+bigCount);
        System.out.println("小写字符出现此数"+smallCount);
        System.out.println("数字字符出现此数"+numCount);
    }
}
