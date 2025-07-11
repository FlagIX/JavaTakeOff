package ObjectOrientedDemo;

public class GirlFriend {
    //属性
    private String name;
    private int age;
    private String gender;

    //name
    //getname:给成员变量name赋值
    //setname:获取成员变量name的值
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    //age
    public void setAge(int age) {
        if(age>=18&&age<=27){
            this.age = age;
        }else{
            System.out.println("年龄不合法");
        }
    }
    public int getAge() {
        return age;
    }

    //gender
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    //方法
    public void eat() {
        System.out.println("吃饭");
    }
    public void sleep() {
        System.out.println("睡觉");
    }
}
