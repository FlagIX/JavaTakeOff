package a01staticDemo1;

public class Student {
    private String name;
    private int age;
    private String gender;

    //static表示静态，是java中的一个修饰符，可以修饰成员方法，成员变量
    //被static修饰的成员变量，叫做静态变量
    //特点：
    //被该类所有对象共享
    //不属于对象，属于类
    //随着类的加载而加载，优先于对象存在
    //调用方式：
    //1.
    //类名调用（推荐)
    //2.
    //对象名调用
    public static String teacher;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //行为
    public void study(){
        System.out.println(name +"正在学习");
    }

    public void show(){
        System.out.println(name+","+age+","+gender+","+teacher);
    }
}

