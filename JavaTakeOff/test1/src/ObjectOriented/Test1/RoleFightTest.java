package ObjectOriented.Test1;

public class RoleFightTest {
    public static void main(String[] args) {
        RoleFight role1 = new RoleFight("陈建峰",100);
        RoleFight role2 = new RoleFight("秦学升",100);
        while (true){
            //r1攻击r2
            role1.attack(role2);
            //判断r2是否死亡
            if(role2.getblood() == 0){
                System.out.println(role1.getname()+"KO了"+role2.getname());
                break;
            }

            //r2攻击r1
            role2.attack(role1);
            //判断r1是否死亡
            if(role1.getblood() == 0){
                System.out.println(role2.getname()+"KO了"+role1.getname());
                break;
            }
        }

    }
}
