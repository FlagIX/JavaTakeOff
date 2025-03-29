package a01oopextendsdemo3;

public class overseaPerson extends person{


    //应用场景：当父类中方法，不能满足子类现在的需求时，我们就需要把这个方法进行重写。
    //注意：子类中重写的方法上面需要加上@override


    /*
    方法重写注意事项和要求
1.重写方法的名称、形参列表必须与父类中的一致。
2.子类重写父类方法时，访问权限子类必须大于等于父类（暂时了解：空着不写<protected<public)
3.子类重写父类方法时，返回值类型子类必须小于等于父类
4.建议：重写的方法尽量和父类保持一致。
5.只有被添加到虚方法表中的方法才能被重写
    */
    @Override
    public void eat(){
        System.out.println("吃意大利面");
    }

    @Override
    public void drink(){
        System.out.println("喝凉水");
    }
    public void lunch(){
        this.eat();
        this.drink();

        super.eat();
        super.drink();
    }
}
