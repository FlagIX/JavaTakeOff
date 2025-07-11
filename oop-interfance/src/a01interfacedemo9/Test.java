package a01interfacedemo9;

public class Test {
    public static void main(String[] args) {

        /*1.接口代表规则，是行为的抽象。想要让哪个类拥有一
        个行为，就让这个类实现对应的接口就可以了。
        2.当一个方法的参数是接口时，可以传递接口所有实现
        类的对象，这种方式称之为接口多态。*/


        //接口的多态
        Carry c1 = new Car();

        Carry c2 = new Person();
    }
}
