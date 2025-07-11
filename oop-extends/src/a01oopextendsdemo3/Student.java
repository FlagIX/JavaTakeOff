package a01oopextendsdemo3;

public class Student extends person{

    public void lunch(){
        this.eat();
        this.drink();

        super.eat();
        super.drink();
    }
}
