package ObjectOrientedDemo.Test2;

public class RoleFightTest {
    public static void main(String[] args) {
        //创建角色
        RoleFight role1 = new RoleFight("陈建峰", 100,'男');
        RoleFight role2 = new RoleFight("秦学升", 100,'男');
        //展示角色信息
        role1.showRoleInfo();
        role2.showRoleInfo();

        //回合制战斗
        while (true){
            //r1攻击r2
            role1.attack(role2);
            //判断r2是否死亡
            if(role2.getBlood() == 0){
                System.out.println(role1.getName()+"KO了"+role2.getName());
                break;
            }

            //r2攻击r1
            role2.attack(role1);
            //判断r1是否死亡
            if(role1.getBlood() == 0){
                System.out.println(role2.getName()+"KO了"+role1.getName());
                break;
            }
        }

    }
}
