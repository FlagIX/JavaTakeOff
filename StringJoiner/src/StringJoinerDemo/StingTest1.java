package StringJoinerDemo;

import java.util.Scanner;

public class StingTest1 {
    public static void main(String[] args) {
        //罗马数字转换
        /*
        键盘录入一个字符串，
        要求1：长度为小于等于9
        要求2：只能是数字
        将内容变成罗马数字
        下面是阿拉伯数字跟罗马数字的对比关系：
        Ⅰ-1、Ⅱ-2、Ⅲ-3、IV-4、V-5、Ⅵ-6、Ⅶ-7、Ⅷ-8、IX-9
        注意点：
        罗马数字里面是没有0的
        如果键盘录入的数字包含0，可以变成""（长度为0的字符串)
        */
        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (true){
            System.out.println("请输入一个字符串");
            str = sc.next();
            //长度小于等于9
            if(str.length()<=9){
                break;
            }else{
                System.out.println("无效字符串");
            }
        }
        //只能是数字
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c>='0'&&c<='9'){

            }else{
                System.out.println("无效字符串");
                continue;
            }
        }

        //将内容变为罗马数字
        //创建数组储存罗马数字
        String [] arr = {" ","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ",};
        int num = 0;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            num = c - '0';
            result = result + arr[num];
        }

        //打印数字
        System.out.println(result);
    }
}
