package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        Scanner sc = new Scanner(System.in);

        while (true){

            try {
                System.out.println("请输入名字");
                gf1.setName(sc.next());
                System.out.println("请输入年龄");
                gf1.setAge(sc.nextInt());
                break;
            }catch (NumberFormatException e){
                e.printStackTrace();
            }catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
    }
}
