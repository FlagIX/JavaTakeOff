package a01oopextendsdemo5;

public class Student extends Person{

    /*
    1.
    继承中构造方法的访问特点是什么？
    1)子类不能继承父类的构造方法，但是可以通过super调用
    2)子类构造方法的第一行，有一个默认的super();
    3)默认先访问父类中无参的构造方法，再执行自己。
    4)如果想要方法文父类有参构造，必须手动书写。
    */
    public Student() {
        //子类构造方法中隐藏的super()去访问父类的无参构造
        //super();
        System.out.println("子类的无参构造");
    }
    public Student(String name,int age){
        super(name,age);
    }
}
