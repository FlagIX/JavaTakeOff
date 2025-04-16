package a04objectdemo;

import com.google.gson.Gson;

public class ObjectDemo4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //protected object clone(int a)           对象克隆

        //1.创建一个对象
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0};
        User u1 = new User(1,"zhangsan","1234qwer","animal1",data);

        //2.克隆对象
        Object u2 = (User)u1.clone();

        //浅克隆:不管对象内部的属性是基本数据类型还是引用数据类型，都完全拷贝过来（拷贝过来的是地址）
        //深克隆:基本数据类型拷贝过来
        //       字符串复用
        //       引用数据类型会重新创建新的


        System.out.println(u1);
        System.out.println(u2);

        //第三方的工具
        //1.第三方写的代码导入到项目中
        //2.编写代码
        Gson gson = new Gson();
        //将对象变为一个字符串
        String s = gson.toJson(u1);
        //再把字符串变为对象
        User user = gson.fromJson(s,User.class);


        int[] arr = u1.getData();
        arr[0] = 100;


        //打印
        System.out.println(user);
    }
}
