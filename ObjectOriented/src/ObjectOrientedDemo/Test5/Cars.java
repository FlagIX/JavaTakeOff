package ObjectOrientedDemo.Test5;

public class Cars {
    //属性
    private String brand;
    private double price;
    private char color;

    //构造方法


    public Cars() {
    }

    public Cars(String brand, double price, char color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    //get set方法

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }
}
