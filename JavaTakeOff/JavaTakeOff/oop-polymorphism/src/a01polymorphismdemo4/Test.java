package a01polymorphismdemo4;

public class Test {
    public static void main(String[] args) {
        //创建两个饲养员对象
        Person p1 = new Person("老王",30);
        Person p2 = new Person("老李",25);

        //创建狗对象和猫对象(多态方式)
        Animal a1 = new Dog();
        a1.setAge(2);
        a1.setColor("黑颜色");
        Animal a2 = new Cat();
        a2.setAge(3);
        a2.setColor("灰颜色");

        //饲养员喂动物吃东西
        p1.keepPet(a1,"骨头");
        p2.keepPet(a2,"鱼");
    }
}
