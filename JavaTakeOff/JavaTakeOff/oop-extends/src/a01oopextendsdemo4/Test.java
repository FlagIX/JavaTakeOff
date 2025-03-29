package a01oopextendsdemo4;

public class Test {
    public static void main(String[] args) {

        /*
        1.继承中成员方法的访问特点：
        this调用：就近原则。
        super调用：直接找父类。
        2.什么是方法重写？
        在继承体系中，子类出现了和父类中一模一样的方法声明，
        我们就称子类的这个方法是重写的方法。
        3.方法重写建议加上哪个注解，有什么好处？
        @Override注解可以校验重写是否正确，同时可读性好。
        4.重写方法有哪些基本要求？
        1)子类重写的方法尽量跟父类中的方法保持一致。
        2)只有虚方法表里面的方法可以被重写
        5.方法重写的本质
        覆盖虚方法表中的方法
        */
        haShiQi hsq = new haShiQi();
        hsq.eat();
        hsq.drink();
        hsq.lookHome();
        hsq.breakHome();

        System.out.println("============");

        shaPiDog sp = new shaPiDog();
        sp.eat();
        sp.drink();
        sp.lookHome();

        System.out.println("============");

        chineseTianYuanDog ctyd = new chineseTianYuanDog();
        ctyd.eat();
        ctyd.drink();
        ctyd.lookHome();
    }
}
