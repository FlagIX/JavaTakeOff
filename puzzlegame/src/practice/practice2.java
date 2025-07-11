package practice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class practice2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        //设置游戏界面大小
        jFrame.setSize(603,680);

        //设置游戏标题
        jFrame.setTitle("事件演示");

        //设置游戏界面始终置顶
        jFrame.setAlwaysOnTop(true);

        //设置游戏界面居中
        jFrame.setLocationRelativeTo(null);

        //游戏关闭
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //取消图片居中，只有取消了才会按照XY轴的形式添加组件
        jFrame.setLayout(null);

        //创建一个按键对象
        JButton jbt = new JButton("点我啊");

        //设置按键位置
        jbt.setBounds(0,0,100,50);

        //给对象加动作监听
        //jbt:组件对象，表示你要给哪个组件添加事件
        //addActionListener:表示我要给组件添加哪个事件监听（动作监听包含鼠标左键点击，空格）
        //参数：表示事件被触发之后要执行的代码
        jbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("你看看你后面呢");
            }
        });

        //把按键添加到界面上
        jFrame.getContentPane().add(jbt);

        //设置游戏显示
        jFrame.setVisible(true);
    }
}
