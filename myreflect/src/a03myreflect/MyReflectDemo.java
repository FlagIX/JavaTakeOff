package a03myreflect;

import java.lang.reflect.Field;

public class MyReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        /*
        c1ass类中用于获取成员变量的方法
        Field[]getFields():                         返回所有公共成员变量对象的数组
        Field[]getDeclaredFields():                 返回所有成员变量对象的数组
        Field getField(String name):                返回单个公共成员变量对象
        Field getDeclaredField(String name):        返回单个成员变量对象


        Field类中用于创建对象的方法
        void set(Object obj,object value):          赋值
        object get(object obj)                      获取值
        */

        //1.获取class对象
        Class<?> clazz = Class.forName("a03myreflect.Student");

        //获取成员变量
//        Field[] fields1 = clazz.getFields();
//        for (Field field : fields1) {
//            System.out.println(field);
//        }

//        Field[] fields2 = clazz.getDeclaredFields();
//        for (Field field : fields2) {
//            System.out.println(field);
//        }

        Field name = clazz.getDeclaredField("name");
        System.out.println(name);

        //获取权限修饰符
        int modifiers = name.getModifiers();
        System.out.println(modifiers);

        //获取成员变量的名字
        String n = name.getName();
        System.out.println(n);

        //获取成员变量的类型
        Class<?> type = name.getType();
        System.out.println(type);

        //获取成员变量的值
        Student stu = new Student("zhangsan",23,"男");
        name.setAccessible(true);
        Object value = name.get(stu);
        System.out.println(value);

        //修改成员变量的值
        name.set(stu,"lisi");
        System.out.println(stu);
    }
}
