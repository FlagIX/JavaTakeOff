package a01oopextendsdemo7;

public class employee {
    private String id;
    private String name;
    private int money;

    public employee() {
    }

    public employee(String id, String name, int money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void work(){
        System.out.println("工作");
    }

    public void eat(){
        System.out.println("吃米饭");
    }
}
