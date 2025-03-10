package ObjectOriented.Test5;

import java.util.Scanner;

public class CarsTest {
    public static void main(String[] args) {
        //创建数组
        Cars[] cars = new Cars[3];

        //把对象添加到数组中（通过键盘录入）
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < cars.length; i++) {
            //创建对象
            Cars c = new Cars();
            //录入品牌
            System.out.println("请输入第" + (i + 1) + "辆车的品牌");
            String brand = sc.next();
            c.setBrand(brand);
            System.out.println("请输入第" + (i + 1) + "辆车的价格");
            double price = sc.nextDouble();
            c.setPrice(price);
            System.out.println("请输入第" + (i + 1) + "辆车的颜色");
            char color = sc.next().charAt(0);
            c.setColor(color);

            //把对象添加到数组中
            cars[i] = c;

        }
        //遍历数组
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getBrand() + "," + cars[i].getPrice() + "," + cars[i].getColor());
        }


    }
}
