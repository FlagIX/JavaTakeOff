package finalDemo1;

public class Test {
    public static void main(String[] args) {
        /*
        final修饰方法：
        表明该方法是最终方法，不能被重写
        final修饰类：
        表明该类是最终类，不能被继承
        final修饰变量：
        叫做常量，只能被赋值一次
                */

        final int a = 10;
        //a = 20;不能赋值
    }
}


class Fu{
    public final void show(){
        System.out.println("父类的show方法");
    }
}

class Zi extends Fu{
//    @Override
//    public void show() {
//        System.out.println("子类的show方法");
//    }
}