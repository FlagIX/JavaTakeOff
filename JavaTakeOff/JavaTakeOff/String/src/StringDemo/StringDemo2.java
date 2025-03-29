package StringDemo;

public class StringDemo2 {
    public static void main(String[] args) {
        //字符串比较
        //创建两个字符串对象
        String s1 = "hello";
        String s2 = new String("Hello");

        //==号计较
        //基本数据类型：比的是数据值
        //引用数据类型：比的是地址值
        System.out.println(s1 == s2);//false

        //equals方法
        //比较字符串内容是否相同
        //需要字符串完全相同才会返回true
        boolean result1 = s1.equals(s2);//false
        System.out.println(result1);

        //忽略大小写比较
        //equalsIgnoreCase方法
        boolean result2 = s1.equalsIgnoreCase(s2);//true
        System.out.println(result2);
    }
}
