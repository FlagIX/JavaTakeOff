package a01innerclassdemo5;

public class Test {
    public static void main(String[] args) {
        //匿名内部类：隐藏了名字的内部类，可以写在成员位置，也可以写在局部位置。

        /*
        需要大家理解匿名内部类的格式，而不是硬记：
        new类名或者接口名(){
        重写方法；
        };
*/

        //格式的细节：包含了继承或实现，方法重写，创建对象。
        //           整体就是一个类的子类对象或者接口的实现类对象

        //使用场景：当方法的参数是接口或者类时，
        //         以接口为例，可以传递这个接口的实现类对象，
        //         如果实现类只要使用一次，就可以用匿名内部类简化代码。

        //编写匿名内部类
        new Swim(){

            @Override
            public void swim() {
                System.out.println("重写了游泳的方法");
            }
        };

        new Animal(){

            @Override
            public void eat() {
                System.out.println("重写了eat方法");
            }
        };

        //在测试类中调用下面的method方法？
        //以前的方式如何调用？
        //要自己写一个子类继承Animal类
        //再创建子类的对象，传递给method方法
        //Dog d new Dog();
        //method(d);
        //如果Dog类我只要用一次，那么还需要单独定义一个类太麻烦了。

        method(
                new Animal(){

                    @Override
                    public void eat() {
                        System.out.println("狗吃骨头");
                    }
                }
        );

    }
    public static void method(Animal a){
        a.eat();
    }
}
