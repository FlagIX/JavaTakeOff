package ObjectOriented;

public class Brother {
    private int age;


    //就近原则   和    关键字this:可以区分局部变量和成员变量
    public  void Method1(){
        int age = 10;
        System.out.println(age);//局部变量age = 10
        System.out.println(this.age);//this直接引用成员变量age = 0
    }
}
