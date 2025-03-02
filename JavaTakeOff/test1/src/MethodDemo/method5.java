package MethodDemo;

//方法重载
//方法重载：指在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或者参数类型不同即可。
//特点：与返回值类型无关，只看参数列表，且参数列表必须不同。(参数个数或参数类型)。调用时，根据方法参数列表的不同来区别。
//好处：方便于记住，只需要记住唯一一个方法名称即可。
public class method5 {
    public static void main(String[] args) {

        //需求：使用方法重载的思想，设计比较两个整数是否相同的方法。
        //要求：兼容全整数类型(byte,short,int,long)

        //compare(10, 20);
        byte b1 = 10;
        byte b2 = 20;
        compare(b1, b2);

    }

    public static void compare(byte b1, byte b2) {
        System.out.println("byte");
        System.out.println(b1==b2);
    }

    public static void compare(short s1, short s2) {
        System.out.println("short");
        System.out.println(s1==s2);
    }

    public static void compare(int i1, int i2) {
        System.out.println("int");
        System.out.println(i1==i2);
    }

    public static void compare(long l1, long l2) {
        System.out.println("long");
        System.out.println(l1==l2);
    }
}
