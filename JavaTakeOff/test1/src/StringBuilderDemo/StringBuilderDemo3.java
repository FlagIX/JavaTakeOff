package StringBuilderDemo;

import java.util.Scanner;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        //链式编程：
        //当我们在调用一个方法的时候，不需要用变量接收他的结果，可以继续调用其他方法
        int len = getString().substring(1).replace("b","c").length();
        System.out.println(len);

        StringBuilder sb = new StringBuilder();
        sb.append("aaa").append("bbb").append("ccc").append("ddd");
        System.out.println(sb);
    }

    public static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        return str;
    }
}
