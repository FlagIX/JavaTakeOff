package finalDemo2;

public class Test {
    public static void main(String[] args) {
        /*
        final修改基本数据类型：记录的值不能发生改变
        final修饰引用数据类型：记录的地址值不能发生改变，内部的属性值还是可以改变的
        
        核心：
        常量记录的数据是不能发生改变的。
        字符串是不可变的
        */

        //final修改基本数据类型：记录的值不能发生改变
        final double PI = 3.14;


        //final修饰引用数据类型：记录的地址值不能发生改变，内部的属性值还是可以改变的
        //创建对象
        final Student student = new Student("zhangsan",23);
        //student = new Student();报错
        student.setName("lisi");
        student.setAge(24);
        System.out.println(student.getName()+","+student.getAge());

        //数组
        final int []arr = {1,2,3,4,5};
        //arr = new int[10];报错
        arr[0] = 10;
        arr[1] = 20;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
