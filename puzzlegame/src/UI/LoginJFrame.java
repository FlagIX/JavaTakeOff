package UI;

import cn.hutool.core.io.FileUtil;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoginJFrame extends JFrame implements MouseListener {
    //创建一个集合存储正确的用户名和密码
    ArrayList<User> allUsers = new ArrayList<>();
    List<String> userInfoList;
    ArrayList<String> usernameList = new ArrayList<>();
    ArrayList<String> passwordList = new ArrayList<>();
    ArrayList<String> countList = new ArrayList<>();

    JButton login = new JButton();

    JButton register = new JButton();

    JTextField username = new JTextField();

    JTextField password = new JTextField();

    JTextField code = new JTextField();

    JLabel rightCode = new JLabel();


    String codeStr = "";

    public LoginJFrame() {
        //读取本地用户信息
        readUserInfo();

        //初始化界面
        initJFrame();

        //在这个界面中添加内容
        initView();

        //让当前界面显示出来
        this.setVisible(true);
    }

    //读取本地用户信息
    private void readUserInfo() {
        userInfoList = FileUtil.readUtf8Lines("E:\\Java_space\\JavaTakeOff\\puzzlegame\\userinfo.txt");
        for (String s : userInfoList) {
            String[] userInfoArr = s.split("&");
            String[] username = userInfoArr[0].split("=");
            String[] password = userInfoArr[1].split("=");
            String[] count = userInfoArr[2].split("=");
            allUsers.add(new User(username[1], password[1]));
            usernameList.add(username[1]);
            passwordList.add(password[1]);
            countList.add(count[1]);
        }
    }

    public void initView() {
        //1. 添加用户名文字
        JLabel usernameText = new JLabel(new ImageIcon("puzzlegame\\image\\login\\用户名.png"));
        usernameText.setBounds(116, 135, 47, 17);
        this.getContentPane().add(usernameText);

        //2.添加用户名输入框
        username.setBounds(195, 134, 200, 30);
        this.getContentPane().add(username);

        //3.添加密码文字
        JLabel passwordText = new JLabel(new ImageIcon("puzzlegame\\image\\login\\密码.png"));
        passwordText.setBounds(130, 195, 32, 16);
        this.getContentPane().add(passwordText);

        //4.密码输入框
        password.setBounds(195, 195, 200, 30);
        this.getContentPane().add(password);

        //验证码提示
        JLabel codeText = new JLabel(new ImageIcon("puzzlegame\\image\\login\\验证码.png"));
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
        login.setIcon(new ImageIcon("puzzlegame\\image\\login\\登录按钮.png"));
        //去除按钮的默认边框
        login.setBorderPainted(false);
        //去除按钮的默认背景
        login.setContentAreaFilled(false);
        this.getContentPane().add(login);

        //6.添加注册按钮
        register.setBounds(256, 310, 128, 47);
        register.setIcon(new ImageIcon("puzzlegame\\image\\login\\注册按钮.png"));
        //去除按钮的默认边框
        register.setBorderPainted(false);
        //去除按钮的默认背景
        register.setContentAreaFilled(false);
        this.getContentPane().add(register);

        //给按钮绑定鼠标监听
        login.addMouseListener(this);

        register.addMouseListener(this);

        //7.添加背景图片
        JLabel background = new JLabel(new ImageIcon("puzzlegame\\image\\login\\background.png"));
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

        if (source == login) {
            int index = usernameList.indexOf(username.getText());
            int count = Integer.parseInt(countList.get(index));
            if(count >= 3){
                showJDialog("该账户已被锁定");
                return;
            }
            if (codeInput.isEmpty()) {
                showJDialog("验证码不能为空");
            } else if (usernameInput.isEmpty() || passwordInput.isEmpty()) {
                showJDialog("用户名或密码不能为空");
            } else if (!codeInput.equalsIgnoreCase(rightCode.getText())) {
                showJDialog("验证码错误");
            } else if (index == -1) {
                showJDialog("该用户不存在，请先注册");
            } else if (contains(userInfo)) {
                showJDialog("登陆成功");
                count = 0;
                countList.set(index,String.valueOf(count));



                //关闭登录窗口
                this.setVisible(false);
                //进入游戏窗口
                new GameJFrame();
            } else {
                count++;
                countList.set(index, String.valueOf(count));
                if(count >= 3){
                    showJDialog("错误超出三次，账户锁定");
                }else {
                    showJDialog("用户名或密码错误，剩余"+(3 - count)+"次机会");
                }
            }
        } else if (source == register) {
            //关闭登录窗口
            this.setVisible(false);
            //进入注册窗口
            new RegisterJFrame(allUsers);
        } else if (source == rightCode) {
            codeStr = createCaptcha.createCaptchaCode();
            //设置内容
            rightCode.setText(codeStr);
        }

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("E:\\Java_space\\JavaTakeOff\\puzzlegame\\userinfo.txt"));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        for (int i = 0; i < usernameList.size(); i++) {
            String user = "username="+usernameList.get(i)+"&password="+passwordList.get(i)+"&count="+countList.get(i);
            try {
                bw.write(user);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            try {
                bw.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        try {
            bw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object source = e.getSource();
        if (source == login) {
            login.setIcon(new ImageIcon("puzzlegame\\image\\login\\登录按下.png"));
        } else if (source == register) {
            register.setIcon(new ImageIcon("puzzlegame\\image\\login\\注册按下.png"));
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Object source = e.getSource();
        if (source == login) {
            login.setIcon(new ImageIcon("puzzlegame\\image\\login\\登录按钮.png"));
        } else if (source == register) {
            register.setIcon(new ImageIcon("puzzlegame\\image\\login\\注册按钮.png"));
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    //判断用户在集合中是否存在
    public boolean contains(User userInput) {
        for (int i = 0; i < allUsers.size(); i++) {
            User rightUser = allUsers.get(i);
            if (userInput.getUsername().equals(rightUser.getUsername()) && userInput.getPassword().equals(rightUser.getPassword())) {
                //有相同的代表存在，返回true，后面的不需要再比了
                return true;
            }
        }
        //循环结束之后还没有找到就表示不存在
        return false;
    }
}
