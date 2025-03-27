package a01oopextendsdemo7;

public class Test {
    public static void main(String[] args) {
        manager m = new manager("001","zhangsan",7000,2000);
        System.out.println(m.getId()+","+m.getName()+","+m.getMoney()+","+m.getManageBonuses());
        m.work();
        m.eat();

        System.out.println("=======================");

        cook c = new cook("002","lisi",5000);
        System.out.println(c.getId()+","+c.getName()+","+c.getMoney());
        c.work();
        c.eat();
    }
}
