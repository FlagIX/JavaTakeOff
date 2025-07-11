package MethodDemo;

public class test2 {
    public static void main(String[] args) {

        getArea(10.1);
    }


    //求圆的面积
    //半径+π
    public static void getArea(double r){
        double area = r*r*3.14;
        System.out.println(area);
    }
}
