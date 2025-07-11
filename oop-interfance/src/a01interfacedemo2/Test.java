package a01interfacedemo2;

/*
成员变量
只能是常量，默认修饰符：pub1 ic static final
构造方法
没有
成员方法
只能是抽象方法，默认修饰符：public abstract
*/
public class Test {
    public static void main(String[] args) {
//        System.out.println(Inter.a);
//
//        Inter.a = 10;//a是final修饰不能修改

        InterImpl ii = new InterImpl();
        ii.method();

//        Scanner sc = new Scanner(System.in);
//        sc.next();
    }
}
