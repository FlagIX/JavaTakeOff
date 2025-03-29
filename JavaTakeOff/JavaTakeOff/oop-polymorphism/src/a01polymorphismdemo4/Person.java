package a01polymorphismdemo4;

public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal animal,String something){
        if(animal instanceof Dog dog){
            System.out.println("年龄为"+getAge()+"的"+getName()+"养了一只"+dog.getColor()+"的"+dog.getAge()+"岁的狗");
            dog.eat(something);
            dog.lookHome();
        } else if (animal instanceof Cat cat) {
            System.out.println("年龄为"+getAge()+"的"+getName()+"养了一只"+cat.getColor()+"的"+cat.getAge()+"岁的猫");
            cat.eat(something);
            cat.catchMouse();
        }else {
            System.out.println("没有这个类型，无法转换");
        }
    }
}

