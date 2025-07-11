package ObjectOrientedDemo;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        //赋值
        p1.brand = "小米";
        p1.price = 1999;

        System.out.println(p1.brand);
        System.out.println(p1.price);
        //调用方法
        p1.call();
        p1.playGames();

        Phone p2 = new Phone();
        p2.brand = "一加";
        p2.price = 2999;
        System.out.println(p2.brand);
        System.out.println(p2.price);


        p2.call();
        p2.playGames();

    }
}
