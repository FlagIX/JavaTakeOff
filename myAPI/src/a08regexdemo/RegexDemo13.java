package a08regexdemo;

public class RegexDemo13 {
    public static void main(String[] args) {
        /*需求：
        将字符串：我要学学编编编编程程程程程程
        替换为：我要学编程
*/

        //需求：把重复的内容替换为单个的
        //学学                学
        //编编编编              编
        //程程程程程程            程
        //  (.)       表示把重复内容的第一个字符看做一组
        // \\1  表示第一字符再次出现
        //  +   至少一次
        //  $1  表示把正则表达式中第一组的内容，再拿出来用

        String str = "我要学学编编编编程程程程程程";
        String s = str.replaceAll("(.)\\1+", "$1");
        System.out.println(s);
    }
}
