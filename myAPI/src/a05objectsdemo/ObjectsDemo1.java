package a05objectsdemo;

import java.util.Objects;

public class ObjectsDemo1 {
    public static void main(String[] args) {
        /*
            public static boolean equals(object a,Object b)     先做非空判断，比较两个对象
            public static boolean isNull(Object obj)            判断对象是否为nu11,为nu11返回true,反之
            public static boolean nonNull(object obj)           判断对象是否为nu11,跟isNu11的结果相反
        */

        //创建两个学生对象
        Student s1 = null;
        Student s2 = new Student("zhangsan",23);

        //2.比较两个对象的属性值是否相同
//        if(s1!=null){
//            System.out.println(s1.equals(s2));
//        }else {
//            System.out.println("调用者为空");
//        }
            //需要自己写非空判断太麻烦

        //用objects来解决
        System.out.println(Objects.equals(s1, s2));
        //细节：
        //1.方法的底层会判断s1是否为null,如果为null,直接返回false
        //2.如果s1不为null,那么就利用s1再次调用equals方法
        //3.此时s1是Student类型，所以最终还是会调用Student中的equals方法。
        //如果没有重写，比较地址值，如果重写了，就比较属性值。


        System.out.println("-------------------------------");


        //public static boolean isNull(Object obj)            判断对象是否为nu11,为nu11返回true,反之
        Student s3 = new Student();
        System.out.println(Objects.isNull(s3));
        System.out.println(Objects.isNull(s1));



        System.out.println("-------------------------------");


        //public static boolean nonNull(object obj)           判断对象是否为nu11,跟isNu11的结果相反

        System.out.println(Objects.nonNull(s3));
        System.out.println(Objects.nonNull(s1));
    }
}
