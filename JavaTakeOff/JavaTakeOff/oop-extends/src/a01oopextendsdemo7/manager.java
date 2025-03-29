package a01oopextendsdemo7;

public class manager extends employee{
    public int manageBonuses;

    public manager() {
    }

    public manager(String id, String name, int money, int manageBonuses) {
        super(id, name, money);
        this.manageBonuses = manageBonuses;
    }

    public int getManageBonuses() {
        return manageBonuses;
    }

    public void setManageBonuses(int manageBonuses) {
        this.manageBonuses = manageBonuses;
    }

    @Override
    public void work(){
        System.out.println("管理其他人");
    }
}
