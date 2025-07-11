package a01staticDemo4;

public class Student {
    //总结：
    //静态方法中没有this关键字
    //静态方法中，只能访问静态。
    //非静态方法可以访问所有。

    String name;
    int age;
    static String teacherName;


    //this:表示当前方法调用者的地址值
    //这个this:是由虚拟机赋值的。
    public void show1(Student this){
        System.out.println("this:"+this);
        System.out.println(name+","+age+","+teacherName);
    }

    public static void method(){
        System.out.println("静态方法");
    }
}
