package test2;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        Scanner sc = new Scanner(System.in);

        while (true){

            try {
                System.out.println("请输入名字");
                gf1.setName(sc.nextLine());
                System.out.println("请输入年龄");
                gf1.setAge(Integer.parseInt(sc.nextLine()));
                break;
            }catch (NameFormatException e){
                e.printStackTrace();
            } catch (AgeOutOfBoundsException e) {
                e.printStackTrace();
            }
        }

        //打印
        System.out.println(gf1);
    }
}
