package ObjectOriented.Test1;

import java.util.Random;

public class RoleFight {
    private String name;
    private int blood;

    public RoleFight() {

    }
    public RoleFight(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public RoleFight(String 陈建峰, int i, char 男) {
    }

    public void setname(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }

    public void setblood(int blood){
        this.blood = blood;
    }

    public int getblood(){
        return blood;
    }

    //方法的调用者攻击参数
    // 攻击方法
    public void attack(RoleFight role){
        // 随机伤害1~20
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        // 剩余血量
        int remainBlood = role.blood - hurt;
        // 剩余血量为负数，改为0
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        // 修改血量
        role.setblood(remainBlood);

        // 输出信息
        //this是方法的调用者
        System.out.println(this.getname()+"对"+role.getname()+"造成了"+hurt+"点伤害，"+role.getname()+"还剩余"+remainBlood+"点血");
    }
}
