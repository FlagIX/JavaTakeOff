package MethodDemo;

public class test3 {

    //需求：定义方法，比较两个长方形的面积
    public static void main(String[] args) {
        getArea(10,20);
        getArea(10,30);
        if(getArea(10,20) > getArea(10,30)){
            System.out.println("第一个长方形的面积大于第二个长方形的面积");
        }
        else{
            System.out.println("第二个长方形的面积大于第一个长方形的面积");
        }
    }

    public static int getArea(int length,int width){
        int area = length * width;
        return area;
    }
}
