package MethodDemo;

//需求：定义一个方法求长方形的周长，并将结果打印
public class test1 {
    public static void main(String[] args) {

        getPerimeter(10.1,20.5);
        getArea(10.1,20.5);
    }

    //我要干什么？求长方形的周长  方法体
    //我需要什么才能算？长和宽    参数列表
    public static void getPerimeter(double length,double width){
        double Perimeter = (length + width) * 2;
        System.out.println(Perimeter);
    }

    public static void getArea(double length,double width){
        double Area = length * width;
        System.out.println(Area);
    }
}
