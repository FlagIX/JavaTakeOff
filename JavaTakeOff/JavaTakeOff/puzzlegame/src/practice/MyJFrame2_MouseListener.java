package practice;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJFrame2_MouseListener extends JFrame implements MouseListener {

    //创建一个按钮对象
    JButton jbt = new JButton("点我啊");


    public MyJFrame2_MouseListener(){
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

        //取消图片居中，只有取消了才会按照xy轴来添加组件
        this.setLayout(null);

        //这只按钮位置和大小
        jbt.setBounds(0,0,100,50);

        //给按钮绑定鼠标监听
        jbt.addMouseListener(this);

        //将按钮在界面显示出来
        this.getContentPane().add(jbt);

        //让界面显示出来
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按住不松");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("划入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("划出");
    }
}
