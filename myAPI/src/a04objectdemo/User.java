package a04objectdemo;

import java.util.StringJoiner;


//Cloneable
//如果一介接口里面没有抽象方法
//表示当前的接口是一个标记性接口
//现在cloneab1e表示一旦了实现，那么当前类的对象就可以被克隆
//如果没有实现，当前类的对象就不能克隆
public class User implements Cloneable{
    private int id;//游戏角色
    private String username;//用户名
    private String password;//密码
    private String path;//游戏图片
    private int[] data;//游戏进度

    public User() {
    }

    public User(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", path='" + path + '\'' +
                ", data=" + arrToString(data) +
                '}';
    }

    public String arrToString(int[] arr){
        StringJoiner stringJoiner = new StringJoiner(",","[","]");
        for (int i = 0; i < arr.length; i++) {
            stringJoiner.add(arr[i] + " ");
        }
        return stringJoiner.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //调用父类中的clone方法
        //相当于让Java帮我们克隆一个对象，并把克隆之后的对象返回出去

//
//        //获取数组
//        int[] data = this.data;
//        //创建一个新数组
//        int [] newdata = new int[data.length];
//        //将数组克隆到新数组中
//        for (int i = 0; i < data.length; i++) {
//            newdata[i] = data[i];
//        }
//        //调用父类中的方法克隆对象
//        User u = (User) super.clone();
//        //因为父类中的克隆方法克隆出来对象中的数组地址值
//        u.data = newdata;
//        return u;

        return super.clone();

    }
}
