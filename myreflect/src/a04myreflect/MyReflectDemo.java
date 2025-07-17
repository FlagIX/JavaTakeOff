package a04myreflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class MyReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        /*
        Class类中用于获取成员方法的方法
        Method[]getMethods():                                           返回所有公共成员方法对象的数组，包括继承的
        Method[]getDeclaredMethods():                                   返回所有成员方法对象的数组，不包括继承的
        Method getMethod(String name,,Class<?>…parameterTypes):         返回单个公共成员方法对象
        Method getDeclaredMethod(String name,Class<?>.parameterTypes):  返回单个成员方法对象


        Method类中用于创建对象的方法
        Object invoke(Object obj,,Object..args):运行方法
        参数一：用obj对象调用该方法
        参数二：调用方法的传递的参数（如果没有就不写）
        返回值：方法的返回值（如果没有就不写）
        */

        //1.获取class对象
        Class<?> clazz = Class.forName("a04myreflect.Student");

        //获取成员方法
//        Method[] methods1 = clazz.getMethods();
//        for (Method method : methods1) {
//            System.out.println(method);
//        }

//        Method[] methods2 = clazz.getDeclaredMethods();
//        for (Method method : methods2) {
//            System.out.println(method);
//        }

//        Method sleep = clazz.getMethod("sleep");
//        System.out.println(sleep);

        Method eat = clazz.getDeclaredMethod("eat", String.class);
        System.out.println(eat);

        int modifiers = eat.getModifiers();
        System.out.println(modifiers);

        String n = eat.getName();
        System.out.println(n);

        //获取方法的形参
        Parameter[] parameters = eat.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        //获取方法的抛出的异常
        Class[] exceptionTypes = eat.getExceptionTypes();
        for (Class exceptionType : exceptionTypes) {
            System.out.println(exceptionType);
        }

        //方法运行
        /*
        Object invoke(Object obj,,Object..args):运行方法
        参数一：用obj对象调用该方法
        参数二：调用方法的传递的参数（如果没有就不写）
        返回值：方法的返回值（如果没有就不写）
        */
        Student s = new Student();
        eat.setAccessible(true);
        Object result = eat.invoke(s, "趴鸭");
        System.out.println(result);

        //获取方法的返回值

    }
}
