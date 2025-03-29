package a01oopextendsdemo8;

public class Test {
    public static void main(String[] args) {
        Lecturer l =new Lecturer();
        l.setId("001");
        l.setName("zhangsan");
        System.out.println(l.getId()+","+l.getName());
        l.work();

        System.out.println("=============");

        Tutor t = new Tutor();
        t.setId("002");
        t.setName("lisi");
        System.out.println(t.getId()+","+t.getName());
        t.work();

        System.out.println("=============");

        Maintainer m = new Maintainer();
        m.setId("003");
        m.setName("wangwu");
        System.out.println(m.getId()+","+m.getName());
        m.work();

        System.out.println("=============");

        Buyer b = new Buyer();
        b.setId("004");
        b.setName("zhaoliu");
        System.out.println(b.getId()+","+b.getName());
        b.work();
    }
}
