package test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        //需求：
        //定义一个继承结构：
        //                      动物
        //          猫                               狗
        //波斯猫       狸花猫                 泰迪          哈士奇
        //属性：名字，年龄
        //行为：吃东西
        //方法体打印：一只叫做XXX的，X岁的波斯猫，正在吃小饼干
        //方法体打印：一只叫做XX的，X岁的狸花猫，正在吃鱼
        //方法体打印：一只叫做XXX的，X岁的泰迪，正在吃骨头，边吃边蹭
        //方法体打印：一只叫做XX的，X岁的哈士奇，正在吃骨头，边吃边拆家


        //测试类中定义一个方法用于饲养动物
        //public static void keepPet(ArrayList<???>list){
        //      //遍历集合，调用动物的eat方法
        //}

        //要求1：该方法能养所有品种的猫，但是不能养狗
        //要求2：该方法能养所有品种的狗，但是不能养猫
        //要求3：该方法能养所有的动物，但是不能传递其他类型

        //创建猫狗对象
        TanukiCat tanukiCat = new TanukiCat();
        tanukiCat.setName("肥猫");
        tanukiCat.setAge(1);

        //创建集合
        ArrayList<TanukiCat> List1 = new ArrayList<>();
        ArrayList<PersianCat> List2 = new ArrayList<>();
        ArrayList<Teddy> List3 = new ArrayList<>();
        ArrayList<Huskies> List4 = new ArrayList<>();

        //将对象添加到集合
        List1.add(tanukiCat);


        keepPet(List1);
        keepPet(List2);
        keepPet(List3);
        keepPet(List4);


    }

    public static void keepPet(ArrayList<?extends Animal>list) {
        //遍历集合，调用动物的eat方法
        for (int i = 0; i < list.size(); i++) {
            Animal animal = list.get(i);
            animal.eat();
        }
    }


//    //要求2：该方法能养所有品种的狗，但是不能养猫
//    public static void keepPet(ArrayList<?extends Dog>list) {
//        //遍历集合，调用动物的eat方法
//        for (int i = 0; i < list.size(); i++) {
//            Dog dog = list.get(i);
//            dog.eat();
//        }
//    }


//    //要求1：该方法能养所有品种的猫，但是不能养狗
//    public static void keepPet(ArrayList<?extends Cat> list){
//        //遍历集合，调用动物的eat方法
//        for (int i = 0; i < list.size(); i++) {
//            Cat cat = list.get(i);
//            cat.eat();
//        }
//    }
}
