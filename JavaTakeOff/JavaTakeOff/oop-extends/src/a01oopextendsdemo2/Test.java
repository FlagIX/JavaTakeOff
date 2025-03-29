package a01oopextendsdemo2;

public class Test {
    public static void main(String[] args) {
        /*
        1.继承中成员变量访问特点：就近原则。
        先在局部位置找，本类成员位置找，父类成员位置找，逐级往上。
        2.如果出现了重名的成员变量怎么办？
        System.out.println(name);
        从局部位置开始往上找
        System.out.println(this.name);
        从本类成员位置开始往上找
        System.out.println(super.name);
        从父类成员位置开始往上找
        */
    }
}
