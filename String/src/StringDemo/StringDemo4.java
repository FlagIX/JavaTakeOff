package StringDemo;
//用户登录
import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        String RightUsername = "zhangsan";
        String RightPassword = "123456";

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String Username = sc.next();
            System.out.println("请输入密码：");
            String Password = sc.next();
            if(Username.equals(RightUsername) && Password.equals(RightPassword)){
                System.out.println("登陆成功");
                break;
            }else{
                if(2-i == 0){
                    System.out.println("您的账号已被锁定，请与管理员联系");
                }else{
                    System.out.println("登陆失败，您还有"+(2-i)+"次机会");
                }
            }
        }
    }
}
