package ObjectOriented;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象
        //调用空参构造方法
        //Student s = new Student();

        //调用有参构造方法
        Student s = new Student("张三", 23);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
