package ArrayListDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest6 {
    public static void main(String[] args) {
        //添加用户对象并判断是否存在
        //需求：
        //1,main方法中定义一个集合，存入三个用户对象。
        //用户属性为：id,username,password
        //2,要求：定义一个方法，根据id查找对应的用户信息。
        //如果存在，返回true
        //如果不存在，返回false

        //定义一个集合
        ArrayList<User1> list = new ArrayList<>();

        //存入三个对象
        User1 user1 = new User1("001","张三","123456");
        User1 user2 = new User1("002","李四","1234567");
        User1 user3 = new User1("003","王五","12345678");
        list.add(user1);
        list.add(user2);
        list.add(user3);


        //输入查询的id
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查询的id");
        String findId = sc.next();
        boolean flag = findUser(findId, list);

        //打印结果
        System.out.println(flag);

    }

    public static boolean findUser(String id,ArrayList<User1>list){
        for (int i = 0; i < list.size(); i++) {
            User1 u1 = list.get(i);
            String id1 = u1.getId();
            if(id1.equals(id)){
                return true;
            }
        }
        return false;
    }
}
