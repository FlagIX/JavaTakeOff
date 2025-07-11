package a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {

        /*
        1.什么是多态？
        对象的多种形态。
        2.多态的前提？
        有继承/实现关系
        有父类引用指向子类对象
        有方法的重写
        3.多态的好处
        使用父类型作为参数，可以接收所有子类对象，
        体现多态的扩展性便利。
        */


        //创建三个对象并调用register方法
        Student s = new Student();
        s.setName("zhangsan");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("yizijian");
        t.setAge(26);

        Administrator admin = new Administrator();
        admin.setName("guanliyuan");
        admin.setAge(38);

        register(s);
        register(t);
        register(admin);
    }


    //这个方法既能接收老师，又能接收学生，还能接收管理员
    //只能把参数写成这三个类型的父类
    public static void register(Person p){
        p.show();
    }
}
