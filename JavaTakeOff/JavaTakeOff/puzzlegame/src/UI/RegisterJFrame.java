package UI;

import javax.swing.*;

public class RegisterJFrame extends JFrame {

    public RegisterJFrame(){


        //设置游戏界面大小
        this.setSize(488,500);

        //设置游戏标题
        this.setTitle("拼图 注册");

        //设置游戏界面始终置顶
        this.setAlwaysOnTop(true);

        //设置游戏界面居中
        this.setLocationRelativeTo(null);

        //设置游戏关闭
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //让界面显示出来
        this.setVisible(true);
    }
}
