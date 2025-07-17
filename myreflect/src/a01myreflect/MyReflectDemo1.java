package a01myreflect;

public class MyReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
        获取class对象的三种方式：
        1,Class.forName("全类名")；
        2.类名.class
        3.对象.getclass();
        */

        //第一种方法
        Class clazz1 = Class.forName("a01myreflect.Student");
        System.out.println(clazz1);

        //第二种方法
        Class clazz2 = Student.class;
        System.out.println(clazz2);

        //第三种方法
        Student s = new Student();
        Class clazz3 = s.getClass();
        System.out.println(clazz3);
    }
}
