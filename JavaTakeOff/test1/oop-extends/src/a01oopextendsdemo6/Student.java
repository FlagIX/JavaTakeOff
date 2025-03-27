package a01oopextendsdemo6;

public class Student {
    private String name;
    private int age;
    private String shcool;

    //要求给shcool一个默认的值"北京大学"
    public Student() {
        this(null,0,"北京大学");
    }

    public Student(String name, int age, String shcool) {
        this.name = name;
        this.age = age;
        this.shcool = shcool;
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

    public String getShcool() {
        return shcool;
    }

    public void setShcool(String shcool) {
        this.shcool = shcool;
    }
}
