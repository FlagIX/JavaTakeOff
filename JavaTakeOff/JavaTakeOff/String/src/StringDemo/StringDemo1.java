package StringDemo;

public class StringDemo1 {
    //字符串特点
    //1.Strin是」ava定义好的一个类。定义在java.lang包中，
    //所以使用的时候不需要导包。
    //2.Java程序中的所有字符串文字（例如“abcdefg”)。
    //都被实为此类的对象。
    //3.字符串不可变，它们的值在创建后不能被更改
    public static void main(String[] args) {
        //创建字符串的两种方式
        //1.直接使用""
        String s1 = "hello";
        System.out.println(s1);

        //new一个字符串对象
        //1.空参构造
        String s2 = new String();
        System.out.println(s2);

        //2.传递一个字符串（脱裤子放屁）
        String s3 = new String("world");
        System.out.println(s3);

        //传递一个字符数组，根据字符数组的内容再创建一个新的字符串对象
        //需求：我要修改字符串的内容。abc Qbc
        //abc-->{'a','b','c'}-->{'Q','b','c'}-->"Qbc"
        char[] array = {'a','b','c','d','e'};
        String s4 = new String(array);
        System.out.println(s4);

        //传递一个字节数组，根据字节数组的内容再创建一个新的字符串对象
        //应用场景：以后在网络当中传输的数据其实都是字节信息
        //我们一般要把字节信息进行转换，转成字符串，此时就要用到这个构造了。
        byte[] bytes = {97,98,99,100,101};
        String s5 = new String(bytes);
        System.out.println(s5);

    }
}
