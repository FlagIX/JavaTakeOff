package a01polymorphismdemo4;

public class Dog extends Animal{

    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁"+"的"+getColor()+"的狗两只前腿死死的抱住"+something+"猛吃");
    }

    public void lookHome(){
        System.out.println("狗看家");
    }
}
