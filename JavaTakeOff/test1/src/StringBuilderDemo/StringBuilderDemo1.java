package StringBuilderDemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //空参
        //StringBuilder sb = new StringBuilder();

        StringBuilder sb = new StringBuilder("abc");

        //方法
        //添加
        sb.append(1);
        sb.append(2.3);
        sb.append('a');

        //反转
        sb.reverse();

        //得字符串长度
        sb.length();
        System.out.println(sb.length());


        //普及：
        //因为StringBuilder是]ava已经写好的类
        //java在底层对他做了一些特殊处理。
        //打印对象不是地址值而是属性值。
        //打印结果
        System.out.println(sb);
    }
}
