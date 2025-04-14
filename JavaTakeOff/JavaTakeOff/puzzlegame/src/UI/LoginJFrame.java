package UI;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class LoginJFrame extends JFrame implements MouseListener {
    //创建一个集合存储正确的用户名和密码
    static ArrayList<User> allUsers = new ArrayList<>();
    static {
        allUsers.add(new User("zhangsan","123"));
        allUsers.add(new User("lisi","1234"));
    }

    JButton login = new JButton();

    JButton register = new JButton();

    JTextField username = new JTextField();

    JTextField password = new JTextField();

    JTextField code = new JTextField();

    JLabel rightCode = new JLabel();


    String codeStr = "";

    public LoginJFrame() {
        //初始化界面
        initJFrame();

        //在这个界面中添加内容
        initView();

        //让当前界面显示出来
        this.setVisible(true);
    }

    public void initView() {
        //1. 添加用户名文字
        JLabel usernameText = new JLabel(new ImageIcon("JavaTakeOff\\puzzlegame\\image\\login\\用户名.png"));
        usernameText.setBounds(116, 135, 47, 17);
        this.getContentPane().add(usernameText);

        //2.添加用户名输入框
        username.setBounds(195, 134, 200, 30);
        this.getContentPane().add(username);

        //3.添加密码文字
        JLabel passwordText = new JLabel(new ImageIcon("JavaTakeOff\\puzzlegame\\image\\login\\密码.png"));
        passwordText.setBounds(130, 195, 32, 16);
        this.getContentPane().add(passwordText);

        //4.密码输入框
        password.setBounds(195, 195, 200, 30);
        this.getContentPane().add(password);

        //验证码提示
        JLabel codeText = new JLabel(new ImageIcon("JavaTakeOff\\puzzlegame\\image\\login\\验证码.png"));
        codeText.setBounds(133, 256, 50, 30);
        this.getContentPane().add(codeText);

        //验证码的输入框
        code.setBounds(195, 256, 100, 30);
        this.getContentPane().add(code);

        codeStr = createCaptcha.createCaptchaCode();
//        System.out.println(codeStr);

        //设置内容
        rightCode.setText(codeStr);
        //给验证码绑定鼠标监听
        rightCode.addMouseListener(this);
        //位置和宽高
        rightCode.setBounds(300, 256, 50, 30);
        //添加到界面
        this.getContentPane().add(rightCode);

        //5.添加登录按钮
        login.setBounds(123, 310, 128, 47);
        login.setIcon(new ImageIcon("JavaTakeOff\\puzzlegame\\image\\login\\登录按钮.png"));
        //去除按钮的默认边框
        login.setBorderPainted(false);
        //去除按钮的默认背景
        login.setContentAreaFilled(false);
        this.getContentPane().add(login);

        //6.添加注册按钮
        register.setBounds(256, 310, 128, 47);
        register.setIcon(new ImageIcon("JavaTakeOff\\puzzlegame\\image\\login\\注册按钮.png"));
        //去除按钮的默认边框
        register.setBorderPainted(false);
        //去除按钮的默认背景
        register.setContentAreaFilled(false);
        this.getContentPane().add(register);

        //给按钮绑定鼠标监听
        login.addMouseListener(this);

        register.addMouseListener(this);

        //7.添加背景图片
        JLabel background = new JLabel(new ImageIcon("JavaTakeOff\\puzzlegame\\image\\login\\background.png"));
        background.setBounds(0, 0, 470, 390);
        this.getContentPane().add(background);
    }


    public void initJFrame() {
        this.setSize(488, 430);//设置宽高
        this.setTitle("拼图游戏 V1.0登录");//设置标题
        this.setDefaultCloseOperation(3);//设置关闭模式
        this.setLocationRelativeTo(null);//居中
        this.setAlwaysOnTop(true);//置顶
        this.setLayout(null);//取消内部默认布局
    }


    //要展示用户名或密码错误
    public void showJDialog(String content) {
        //创建一个弹框对象
        JDialog jDialog = new JDialog();
        //给弹框设置大小
        jDialog.setSize(200, 150);
        //让弹框置顶
        jDialog.setAlwaysOnTop(true);
        //让弹框居中
        jDialog.setLocationRelativeTo(null);
        //弹框不关闭永远无法操作下面的界面
        jDialog.setModal(true);

        //创建Jlabel对象管理文字并添加到弹框当中
        JLabel warning = new JLabel(content);
        warning.setBounds(0, 0, 200, 150);
        jDialog.getContentPane().add(warning);

        //让弹框展示出来
        jDialog.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object source = e.getSource();
        String usernameInput = username.getText();
        String passwordInput = password.getText();
        String codeInput = rightCode.getText();

        //创建一个User对象
        User userInfo = new User(usernameInput, passwordInput);

       if(source == login){
            if(codeInput.isEmpty()){
                showJDialog("验证码不能为空");
            }else if(usernameInput.isEmpty() || passwordInput.isEmpty()){
                showJDialog("用户名或密码不能为空");
            }else if(!codeInput.equalsIgnoreCase(rightCode.getText())){
                showJDialog("验证码错误");
            }else if(contains(userInfo)){
                //关闭登录窗口
                this.setVisible(false);
                //进入游戏窗口
                new GameJFrame();
            }else {
                showJDialog("用户名或密码错误");
            }
        }else if(source == register){
            System.out.println("点击了注册按钮");
        } else if(source == rightCode){
            codeStr = createCaptcha.createCaptchaCode();
            //设置内容
            rightCode.setText(codeStr);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object source = e.getSource();
        if(source == login){
            login.setIcon(new ImageIcon("JavaTakeOff\\puzzlegame\\image\\login\\登录按下.png"));
        }else if(source == register){
            register.setIcon(new ImageIcon("JavaTakeOff\\puzzlegame\\image\\login\\注册按下.png"));
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Object source = e.getSource();
        if(source == login){
            login.setIcon(new ImageIcon("JavaTakeOff\\puzzlegame\\image\\login\\登录按钮.png"));
        }else if(source == register){
            register.setIcon(new ImageIcon("JavaTakeOff\\puzzlegame\\image\\login\\注册按钮.png"));
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    //判断用户在集合中是否存在
    public boolean contains(User userInput){
        for (int i = 0; i < allUsers.size(); i++) {
            User rightUser = allUsers.get(i);
            if(userInput.getUsername().equals(rightUser.getUsername()) && userInput.getPassword().equals(rightUser.getPassword())){
                //有相同的代表存在，返回true，后面的不需要再比了
                return true;
            }
        }
        //循环结束之后还没有找到就表示不存在
        return false;
    }
}
