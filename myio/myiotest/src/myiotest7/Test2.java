package myiotest7;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws IOException {
        /*
        需求：写一个登陆小案例（添加锁定账号功能）
        步骤：
            将正确的用户名和密码手动保存在本地的userinfo.txt文件中。
            保存格式为：username=zhangsan&password=123&count=0
                        username=lisi&password=1234&count=0
                        username=wangwu&password=12345&count=0
            让用户键盘录入用户名和密码
            比较用户录入的和正确的用户名密码是否一致
            如果一致则打印登陆成功
            如果不一致则打印登陆失败，连续输错三次被锁定
        */
        BufferedReader br = new BufferedReader(new FileReader("myio\\myiotest\\src\\myiotest7\\userinfo.txt"));
        ArrayList<String> usernameList = new ArrayList<>();
        ArrayList<String> passwordList = new ArrayList<>();
        ArrayList<String> countList = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null){
            String[] arr1 = line.split("&");
            usernameList.add(arr1[0].split("=")[1]);
            passwordList.add(arr1[1].split("=")[1]);
            countList.add(arr1[2].split("=")[1]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();

        int index = usernameList.indexOf(username);
        if(index == -1){
            System.out.println("该用户不存在");
        }

        int count = Integer.parseInt(countList.get(index));
        if(count >= 3){
            System.out.println("该账户已被锁定");
            return;
        }

        if(username.equals(usernameList.get(index)) && password.equals(passwordList.get(index))){
            System.out.println("登陆成功");
            count = 0;
            countList.set(index,String.valueOf(count));
        }else {
            count++;
            countList.set(index, String.valueOf(count));
            if(count >= 3){
                System.out.println("错误超出三次，账户锁定");
            }else {
                System.out.println("登陆失败，剩余"+(3 - count)+"次机会");
            }
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("myio\\myiotest\\src\\myiotest7\\userinfo.txt"));
        for (int i = 0; i < usernameList.size(); i++) {
            String user = "username="+usernameList.get(i)+"&password="+passwordList.get(i)+"&count="+countList.get(i);
            bw.write(user);
            bw.newLine();
        }
        bw.close();
    }
}
