package a01innerclassdemo4;

public class Outer {
        int b = 20;
    public void show(){
        int a = 10;

        class Inner{
            String name;
            int age;
            public void method1(){
                System.out.println(a);
                System.out.println(b);
                System.out.println("内部类的method1的非静态方法");
            }
            public static void method2(){
                System.out.println("内部类的method2的静态方法");
            }
        }

        //创建内部类对象
        Inner i = new Inner();
        System.out.println(i.name);
        System.out.println(i.age);
        i.method1();
        Inner.method2();
    }
}
