package domain;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Poker extends JLabel implements MouseListener {
    //自己练习

    //属性：名字   格式：数字-数字
    private String name;
    //牌显示的是正面还是反面
    private boolean up;
    //是否可以点击
    private boolean canClick = false;
    //是否已经被点击
    private boolean clicked = false;

    public Poker(String name, boolean up) {
        this.name = name;
        this.up = up;

        //判断当前的牌是否显示正面
        if(this.up){
            //显示正面
            turnFront();
        }else {
            //显示反面
            turnRear();
        }

        //设置牌的宽高
        this.setSize(71,96);
        //让牌显示出来
        this.setVisible(true);
        //给牌添加监听
        this.addMouseListener(this);
    }

    //显示正面
    public void turnFront(){
        //给牌设置正面
        this.setIcon(new ImageIcon("doudizhu\\image\\poker\\"+name+".png"));
        //修改成员变量
        this.up = true;
    }
    //显示反面
    public void turnRear(){
        //给牌设置反面
        this.setIcon(new ImageIcon("doudizhu\\image\\poker\\rear.png"));
        //修改成员变量
        this.up = false;

    }
    //被点击
    public void clicked(){
        int step = 0;
        //判断牌是否可以点击
        if(canClick){
            //判断牌是否已经被点击
            if(canClick){
                //如果牌已经被点击，则再次点击牌下降
                step = 20;
            }else {
                //如果牌没有被点击，则点击牌上升
                step = -20;
            }
            //修改成员变量
            canClick = !canClick;
            //改变牌的位置
            //牌改变前的位置
            Point from = this.getLocation();
            //牌改变后的位置
            Point to = new Point(from.x,from.y+step);
            //并把牌改变后的位置返还给牌
            this.setLocation(to);

        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public boolean isCanClick() {
        return canClick;
    }

    public void setCanClick(boolean canClick) {
        this.canClick = canClick;
    }

    public boolean isClicked() {
        return clicked;
    }

    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    @Override
    public String toString() {
        return "Poker{" +
                "name='" + name + '\'' +
                ", up=" + up +
                ", canClick=" + canClick +
                ", clicked=" + clicked +
                '}';
    }
}
