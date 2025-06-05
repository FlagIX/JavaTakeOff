package myiotest7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws IOException {
        /*
        需求：写一个登陆小案例。
        步骤：
            将正确的用户名和密码手动保存在本地的userinfo.txt文件中。
            保存格式为：username=zhangsan&password=123
            让用户键盘录入用户名和密码
            比较用户录入的和正确的用户名密码是否一致
            如果一致则打印登陆成功
            如果不一致则打印登陆失败
        */

        BufferedReader br = new BufferedReader(new FileReader("JavaTakeOff\\myio\\myiotest\\src\\myiotest7\\userinfo.txt"));
        ArrayList<String> usernameList = new ArrayList<>();
        ArrayList<String> passwordList = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null){
            String[] arr1 = line.split("&");
            usernameList.add(arr1[0].split("=")[1]);
            passwordList.add(arr1[1].split("=")[1]);
        }
        br.close();

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();

        int index = usernameList.indexOf(username);
        if(index == -1){
            System.out.println("该用户不存在");
        }

        if(username.equals(usernameList.get(index)) && password.equals(passwordList.get(index))){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
    }
}
