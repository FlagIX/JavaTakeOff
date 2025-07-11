package a03runtimedemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

public class TrickyGames extends JFrame implements MouseListener {
    JButton topjbt = new JButton("太帅了");
    JButton midjbt = new JButton("一般般");
    JButton lowjbt = new JButton("不帅");

    JButton dadbut = new JButton("放过我吧");

    boolean flag = false;

    public TrickyGames() {

        initJFrame();

        initView();

        this.setVisible(true);

    }

    private void initView() {
        this.getContentPane().removeAll();

        if(flag){
            dadbut.setBounds(200,0,100,50);
            this.getContentPane().add(dadbut);
            dadbut.addMouseListener(this);
        }

        JLabel jLabel = new JLabel("你长得怎么样");
        jLabel.setBounds(150,100,300,100);
        jLabel.setFont(new Font("雅黑软体",0,30));
        this.getContentPane().add(jLabel);

        topjbt.setBounds(200,200,100,50);
        midjbt.setBounds(200,300,100,50);
        lowjbt.setBounds(200,400,100,50);

        this.getContentPane().add(topjbt);
        this.getContentPane().add(midjbt);
        this.getContentPane().add(lowjbt);

        topjbt.addMouseListener(this);
        midjbt.addMouseListener(this);
        lowjbt.addMouseListener(this);
    }

    private void initJFrame() {

        this.setSize(500,600);

        this.setTitle("整蛊小游戏");

        this.setAlwaysOnTop(true);

        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setLayout(null);

    }

    public static void showJDialog(String text){
        JDialog jDialog = new JDialog();

        jDialog.setSize(400,150);

        jDialog.setLocationRelativeTo(null);

        jDialog.setAlwaysOnTop(true);

        jDialog.setModal(true);

        JLabel jLabel = new JLabel(text);
        jLabel.setBounds(0,0,200,150);
        jDialog.getContentPane().add(jLabel);

        jDialog.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object source = e.getSource();
        if(source == topjbt){
            showJDialog("你真不要脸，我要给你一点惩罚");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 3600");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            flag = true;
            initView();
        }else if(source == midjbt){
            showJDialog("你还是不要脸，我还要给你一点惩罚");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 1800");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            flag = true;
            initView();
        }else if(source == lowjbt){
            showJDialog("你真不自信，我更要给你一点惩罚");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 900");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            flag = true;
            initView();
        }else if(source == dadbut){
            showJDialog("这次就放过你吧");
            try {
                Runtime.getRuntime().exec("shutdown -a");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
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
}
