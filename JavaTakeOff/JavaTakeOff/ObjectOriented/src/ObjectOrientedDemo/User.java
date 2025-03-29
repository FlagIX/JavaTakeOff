package ObjectOrientedDemo;
/*
标准的JavaBean类：
1.类名需要见名知意
2.成员变量使用private修饰
3.提供至少两个构造方法
  无参构造方法
  带全部参数的构造方法
4.成员方法
  提供每一个成员变量对应的setXxx()/getXxx()
  如果还有其他行为，也需要写上
*/
public class User {

    //快捷键：alt + insert

    //插件：ptg

    //属性
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;

    //空参构造方法
    public User() {}

    //带全部参数的构造方法
    public User(String username, String password, String email, String gender, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    //Setter and Getter
    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

}
