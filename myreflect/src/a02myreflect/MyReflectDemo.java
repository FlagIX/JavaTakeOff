package a02myreflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class MyReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /*
        class类中用于获取构造方法的方法
            Constructor<?>[]getConstructors()
            Constructor<?>[]getDeclaredConstructors()
            Constructor<T>getConstructor(Class<?>...parameterTypes)
            Constructor<T>getDeclaredConstructor(Class<?>...parameterTypes)


        Constructor类中用于创建对象的方法
            T newInstance(object...initargs)
            setAccessible(boolean flag)
        */

        //1.获取class对象
        Class<?> clazz = Class.forName("a02myreflect.Student");

        //2.获取构造方法
        //Constructor<?>[]getConstructors()   获取所有的公共构造方法
//        Constructor<?>[] con1 = clazz.getConstructors();
//        for (Constructor<?> con : con1) {
//            System.out.println(con);
//        }

        //Constructor<?>[]getDeclaredConstructors()  获取所有的构造方法
//        Constructor<?>[] con2 = clazz.getDeclaredConstructors();
//        for (Constructor<?> con : con2) {
//            System.out.println(con);
//        }


        //Constructor<T>getConstructor(Class<?>...parameterTypes)   获取公共的单个的构造方法
//        Constructor<?> con1 = clazz.getConstructor();
//        System.out.println(con1);
//
//        Constructor<?> con2 = clazz.getConstructor(String.class);
//        System.out.println(con2);


        //Constructor<T>getDeclaredConstructor(Class<?>...parameterTypes)  获取公共的单个的构造方法
//        Constructor<?> con1 = clazz.getDeclaredConstructor();
//        System.out.println(con1);
//
//        Constructor<?> con2 = clazz.getDeclaredConstructor(String.class);
//        System.out.println(con2);
//
//        Constructor<?> con3 = clazz.getDeclaredConstructor(int.class);
//        System.out.println(con3);

        Constructor<?> con4 = clazz.getDeclaredConstructor(String.class,int.class);
        System.out.println(con4);

        //获取构造方法的权限修饰符(是以数字表示的)
        int modifiers = con4.getModifiers();
        System.out.println(modifiers);

        Parameter[] parameters = con4.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        //暴力反射：表示临时取消权限校验
        con4.setAccessible(true);
        Student stu = (Student) con4.newInstance("张三", 23);
        System.out.println(stu);

    }
}
