package StringBuilderDemo;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        //使用StringBuilder的场景：
        //1.字符串的拼接
        //2.字符串的反转
        //StringBuilder只是一个容器
        StringBuilder sb = new StringBuilder();

        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.append("ddd");

        System.out.println(sb);

        //toString将StringBuilder转换为字符串，使其能够使用字符串的方法

        String str = sb.toString();
        str.length();

        System.out.println(str.length());
    }
}
