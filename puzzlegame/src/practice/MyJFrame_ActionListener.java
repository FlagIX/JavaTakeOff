package practice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJFrame_ActionListener extends JFrame implements ActionListener {

    //创建按钮对象
    JButton jbt1 = new JButton("点我啊");

    //再创建一个按钮
    JButton jbt2 = new JButton("再点我啊");


    public MyJFrame_ActionListener(){
        //设置游戏界面大小
        this.setSize(603,680);

        //设置游戏标题
        this.setTitle("拼图游戏单机版v1.0");

        //设置游戏界面始终置顶
        this.setAlwaysOnTop(true);

        //设置游戏界面居中
        this.setLocationRelativeTo(null);

        //设置游戏关闭
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //取消图片居中
        this.setLayout(null);


        //设置按钮位置
        jbt1.setBounds(0,0,100,50);
        //添加一个动作监听
        jbt1.addActionListener(this);



        //设置按钮位置
        jbt2.setBounds(100,0,100,50);
        //添加一个动作监听
        jbt2.addActionListener(this);


        //将按钮添加到界面中
        this.getContentPane().add(jbt1);
        this.getContentPane().add(jbt2);


        //让界面显示出来
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //对当前按钮进行操作

        //获取当前被操作的按钮对象
        Object source = e.getSource();
        if(source == jbt1){
            jbt1.setSize(200,100);
        } else if (source == jbt2) {
            Random random = new Random();
            jbt2.setLocation(random.nextInt(500),random.nextInt(500));
        }
    }
}
