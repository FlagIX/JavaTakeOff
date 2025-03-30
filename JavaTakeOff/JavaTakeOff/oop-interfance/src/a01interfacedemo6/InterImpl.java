package a01interfacedemo6;

public class InterImpl implements Inter,Inter2{

    @Override
    public void method() {
        System.out.println("method");
    }

    @Override
    public void show() {
        System.out.println("重写的show方法");
    }
}
