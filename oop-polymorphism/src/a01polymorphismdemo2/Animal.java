package a01polymorphismdemo2;

public class Animal {
    String name = "动物";


    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("show ----  动物");
    }
}
