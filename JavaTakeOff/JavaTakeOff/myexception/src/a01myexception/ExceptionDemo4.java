package a01myexception;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        //异常作用一：异常是用来查询bug的关键参考信息
        //异常作用二：异常可以付为方法内部的一种特殊返回值，以便通知调用者底层的执行情况

        //设置年龄18~40
        Student student = new Student();

        student.setAge(50);



    }
}
