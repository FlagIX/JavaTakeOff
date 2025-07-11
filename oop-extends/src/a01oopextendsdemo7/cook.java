package a01oopextendsdemo7;

public class cook extends employee{

    public cook() {
    }

    public cook(String id, String name, int money) {
        super(id, name, money);
    }

    @Override
    public void work(){
        System.out.println("炒菜");
    }
}
