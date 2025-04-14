package a01innerclassdemo5;

public class Test2 {
    public static void main(String[] args) {


        //整体我们可以理解为Swim接口的实现类对象
        //接口多态
        Swim s = new Swim(){

            @Override
            public void swim() {
                System.out.println("重写的swim方法");
            }
        };

        //编译看左边，运行看右边
        s.swim();

        new Swim(){

            @Override
            public void swim() {
                System.out.println("重写的swim方法");
            }
        }.swim();
    }
}
