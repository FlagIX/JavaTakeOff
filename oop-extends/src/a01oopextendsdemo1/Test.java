package a01oopextendsdemo1;

public class Test {
    public static void main(String[] args) {
        //创建一个狸花猫的对象
        chinesePastoralCat cpc = new chinesePastoralCat();
        cpc.eat();
        cpc.drink();
        cpc.catchMice();

        System.out.println("==================");

        //创建一个哈士奇的对象
        huskies h = new huskies();
        h.eat();
        h.drink();
        h.special();
        h.dismantleHouse();
    }
}
