package a01abstractdemo2;

public class Test {
//1.抽象类的作用是什么样的？
//    抽取共性时，无法确定方法体，就把方法定义为抽象的。
//    强制让子类按照某种格式重写。
//    抽象方法所在的类，必须是抽象类。
//2.抽象类和抽象方法的格式？
//    public abstract返回值类型方法名（参数列表）；
//    public abstract class类名();
//3.继承抽象类有哪些要注意？
//    要么重写抽象类中的所有抽象方法
//    要么是抽象类
    public static void main(String[] args) {
        //创建对象
        frog f = new frog("小青蛙",1);
        System.out.println(f.getName()+","+f.getAge());
        f.eat();
        f.drink();

        Dog d = new Dog("小狗",2);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();
        d.drink();

        Sheep s = new Sheep("山羊",3);
        System.out.println(s.getName()+","+s.getAge());
        s.eat();
        s.drink();
    }
}
