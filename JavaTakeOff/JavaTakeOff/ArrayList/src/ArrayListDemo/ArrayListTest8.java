package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListTest8 {
    public static void main(String[] args) {
        //添加手机对象并返回要求数据
        //需求：
        //定义Javabean类：Phone
        //Phone属性：品牌，价格。
        //main方法中定义一个集合，存入三个手机对象。
        //分别为：小米，1000。苹果，8000。锤子2999。
        //定义一个方法，将价格低于3000的手机信息返回。

        //创建一个集合
        ArrayList<Phone1> list = new ArrayList<>();

        //创建手机对象并添加到集合
        Phone1 phone1 = new Phone1("小米",1000);
        Phone1 phone2 = new Phone1("苹果",8000);
        Phone1 phone3 = new Phone1("锤子",2999);
        list.add(phone1);
        list.add(phone2);
        list.add(phone3);

        //返回数据
        ArrayList<Phone1> phoneInfo = getPhoneInfo(list);
        //遍历集合
        for (int i = 0; i < phoneInfo.size(); i++) {
            Phone1 phone = phoneInfo.get(i);
            System.out.println(phone.getBrand()+","+phone.getPrice());
        }
    }
    public static ArrayList<Phone1> getPhoneInfo(ArrayList<Phone1>list){
        //定义一个新集合用来储存价格低于3000的手机
        ArrayList<Phone1> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone1 phone = list.get(i);
            int price = phone.getPrice();
            if(price<=3000){
                resultList.add(phone);
            }
        }
        return resultList;
    }
}
