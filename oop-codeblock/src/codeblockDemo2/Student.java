package codeblockDemo2;

public class Student {
    private String name;
    private int age;

    //静态代码块
    //格式：static{}
    //特点：需要通过static:关键字修饰，随着类的加载而加载，并且自动触发、只执行一次
    //使用场景：在类加载的时候，做一些数据初始化的时候使用。


    //执行时机：
    //随着类的加载而加载的，并且只执行一次。
    static {
        System.out.println("静态代码块开始了");
    }
    public Student() {
        System.out.println("空参构造");
    }

    public Student(String name, int age) {
        System.out.println("有参构造");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
