package a01interfacedemo3;

import a01interfacedemo2.Inter;


/*
接口和类之间的关系
        类和类的关系
        继承关系，只能单继承，不能多继承，但是可以多层继承
        类和接口的关系
        实现关系，可以单实现，也可以多实现，还可以在继承一个类的同时实现多个接口
        接口和接口的关系
        继承关系，可以单继承，也可以多继承

        */

//类和接口的关系
//        实现关系，可以单实现，也可以多实现，还可以在继承一个类的同时实现多个接口
public class Test implements Inter,Inter2 {
    @Override
    public void method() {
        System.out.println("method1");
    }

    @Override
    public void method1() {
        System.out.println("method1");
    }

    @Override
    public void method3() {
        System.out.println("method3");
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }

    @Override
    public void method4() {
        System.out.println("method4");
    }
}
