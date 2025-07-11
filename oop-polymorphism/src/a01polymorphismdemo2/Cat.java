package a01polymorphismdemo2;

public class Cat extends Animal{
    String name = "猫";

    @Override
    public void show() {
        System.out.println("show ----  猫");
    }
}
