package practice;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame3_KeyListener extends JFrame implements KeyListener {

    public MyJFrame3_KeyListener(){
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

        //给整个窗口绑定键盘监听
        //调用者this:本类对象，当前的界面对象，表示我要给整个界面添加监听
        //addKeyListener:表示要给本界面添加键盘监听
        //参数this:当事件被触发之后，会执行本类中的对应代码
        this.addKeyListener(this);

        //让界面显示出来
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按着不松");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开按键");
        int keyCode = e.getKeyCode();
        System.out.println(keyCode);
        char keyChar = e.getKeyChar();
        System.out.println(keyChar);
    }
}
