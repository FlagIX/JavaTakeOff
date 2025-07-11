package a01abstractdemo1;

public class Test {
    public static void main(String[] args) {
        //抽象类不能创建对象
        //Person p = new person();

        Student s = new Student("zhangsan",23);
        System.out.println(s.getName()+","+s.getAge());
        s.work();
        s.sleep();
    }
}
