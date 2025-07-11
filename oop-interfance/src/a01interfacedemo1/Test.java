package a01interfacedemo1;

public class Test {
    public static void main(String[] args) {
        //创建对象

        Dog d = new Dog("小白",3);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();
        d.swim();

        rabbit r = new rabbit("小灰",2);
        System.out.println(r.getName()+","+r.getAge());
        r.eat();

        frog f = new frog("小黑",1);
        System.out.println(f.getName()+","+f.getAge());
        f.eat();
        f.swim();
    }
}
