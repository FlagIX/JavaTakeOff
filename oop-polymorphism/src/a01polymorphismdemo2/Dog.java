package a01polymorphismdemo2;

public class Dog extends Animal{
    String name = "狗";

    @Override
    public void show() {
        System.out.println("show ----  狗");
    }
}
