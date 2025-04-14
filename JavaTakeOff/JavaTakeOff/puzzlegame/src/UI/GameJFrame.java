package UI;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, MouseListener {
    //JFrame界面，窗体
    //子类呢？也表示界面，窗体
    //规定：GameJFrame这个界面表示的就是游戏的主界面
    //以后跟游戏相关的所有逻辑都写在这个类中

    //创建一个二维数组
    //目的：用来管理数据
    //加载图片的时候，会根据二维数组中的数据进行加载
    int[][] data = new int[4][4];


    //记录空白图片在二维数组中的位置
    int x = 0;
    int y = 0;

    //记录当前图片的路径
    String path = "JavaTakeOff\\puzzlegame\\image\\animal\\animal2\\";


    //创建游戏胜利数组
    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0},
    };

    //创建一个成员变量来统计步数
    int step = 0;

    //创建功能下的条目
    JMenuItem rePlayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenuItem girlItem = new JMenuItem("美女");
    JMenuItem animalItem = new JMenuItem("动物");
    JMenuItem sportItem = new JMenuItem("运动");

    JMenuItem accountItem = new JMenuItem("公众号");

    public GameJFrame() {

        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //初始化数据（打乱）
        initData();

        //初始化图片
        initImage();

        //让界面显示出来
        this.setVisible(true);
    }

    public void viewTheOriginalImage() {
        //清除所有图片
        this.getContentPane().removeAll();

        //添加完整图片
        ImageIcon all = new ImageIcon(path + "all.jpg");
        JLabel allpicture = new JLabel(all);
        this.getContentPane().add(allpicture);

        allpicture.setBounds(83, 134, 420, 420);

        //添加背景图片
        ImageIcon bg = new ImageIcon("JavaTakeOff\\puzzlegame\\image\\background.png");
        JLabel background = new JLabel(bg);
        this.getContentPane().add(background);

        background.setBounds(40, 40, 508, 560);

        //刷新图片
        this.getContentPane().repaint();
    }

    private void initData() {
        //定义一个数组
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //创建随机数
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = random.nextInt(tempArr.length);
            int temp;
            temp = tempArr[i];
            tempArr[i] = tempArr[randomIndex];
            tempArr[randomIndex] = temp;
        }

        int index = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (tempArr[index] == 0) {
                    x = i;
                    y = j;
                }
                data[i][j] = tempArr[index];
                index++;
            }
        }
    }

    private void initImage() {
        //清空图片
        this.getContentPane().removeAll();

        //显示游戏胜利图片
        ImageIcon winner = new ImageIcon("JavaTakeOff\\puzzlegame\\image\\win.png");
        JLabel victory = new JLabel(winner);
        boolean victory1 = victory();
        if (victory1) {
            this.getContentPane().add(victory);
            victory.setBounds(203, 283, 197, 73);
        }

        //将步数显示到游戏中
        JLabel stepcount = new JLabel("步数：" + step);
        stepcount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepcount);

        //路径分为两种：
        //绝对路径：一定是从盘符开始的。C:\   D: \
        //相对路径：不是从盘符开始的
        //相对路径相对当前项目而言的。  aaa\\bbb
        //在当前项目下，去找aaa文件夹，里面再找bbb文件夹。


        //细节：
        //先加载的图片在上方，后加载的图片塞在下面。


        //外循环---添加四行
        for (int i = 0; i < 4; i++) {
            //内循环---在一行添加四张图片
            for (int j = 0; j < 4; j++) {
                //获取当前要加载图片的序号
                int number = data[i][j];

                //创建imageIcon对象将图片加入进去
                //创建JLabel来管理imageIcon
                JLabel jLabel = new JLabel(new ImageIcon(path + number + ".jpg"));

                //设置图片坐标
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);

                //给小图片设置边框
                //0:表示让图片凸起来(RAISED)
                //1:表示让图片凹下去(LOWERED)
                jLabel.setBorder(new BevelBorder(BevelBorder.RAISED));

                //获取隐藏小容器
                this.getContentPane();

                //将JLabal加入到JFrame中
                this.add(jLabel);

            }
        }

        //添加背景图片
        ImageIcon bg = new ImageIcon("JavaTakeOff\\puzzlegame\\image\\background.png");
        JLabel background = new JLabel(bg);
        this.getContentPane().add(background);

        background.setBounds(40, 40, 508, 560);


        //刷新界面
        this.getContentPane().repaint();
    }

    private void initJFrame() {
        //设置游戏界面大小
        this.setSize(603, 680);

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
    }

    private void initJMenuBar() {
        //创建菜单
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单下的功能
        JMenu functionMenu = new JMenu("功能");
        JMenu usMenu = new JMenu("关于我们");
        JMenu changePictureMenu = new JMenu("更换图片");


        //给条目添加鼠标监听
        rePlayItem.addMouseListener(this);
        reLoginItem.addMouseListener(this);
        closeItem.addMouseListener(this);
        accountItem.addMouseListener(this);
        girlItem.addMouseListener(this);
        animalItem.addMouseListener(this);
        sportItem.addMouseListener(this);

        //将条目添加到功能中
        functionMenu.add(changePictureMenu);
        functionMenu.add(rePlayItem);
        functionMenu.add(reLoginItem);
        functionMenu.add(closeItem);
        changePictureMenu.add(girlItem);
        changePictureMenu.add(animalItem);
        changePictureMenu.add(sportItem);

        usMenu.add(accountItem);

        //将功能添加到菜单
        jMenuBar.add(functionMenu);
        jMenuBar.add(usMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);

        //给整个界面添加键盘监听
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        //游戏胜利就结束所有操作
        if (victory()) {
            return;
        }


        int keyCode = e.getKeyCode();
        //查看完整图片
        if (keyCode == 65) {
            viewTheOriginalImage();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //游戏胜利就结束所有操作
        if (victory()) {
            return;
        }


        int keyCode = e.getKeyCode();
        //System.out.println(keyCode);


        //对上，下，左，右进行判断
        //左：37上：38右：39下：40
        if (keyCode == 37) {
            if (y == 3) {
                return;
            }
            System.out.println("向左");
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            //每移动一次步数加1
            step++;
            initImage();
        } else if (keyCode == 38) {
            if (x == 3) {
                return;
            }
            System.out.println("向上");
            //逻辑：
            //把空白方块下方的数字往上移动
            //x,y表示空白方块
            //×+1,y表示空白方块下方的数字
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            //每移动一次步数加1
            step++;
            initImage();
        } else if (keyCode == 39) {
            if (y == 0) {
                return;
            }
            System.out.println("向右");
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            //每移动一次步数加1
            step++;
            initImage();
        } else if (keyCode == 40) {
            if (x == 0) {
                return;
            }
            System.out.println("向下");
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            //每移动一次步数加1
            step++;
            initImage();
        } else if (keyCode == 65) {
            initImage();
        } else if (keyCode == 87) {
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0},
            };
            initImage();
        }
    }

    //判断游戏是否胜利
    public boolean victory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

        Random random = new Random();

        Object source = e.getSource();
        if (source == rePlayItem) {
            //步数清零
            step = 0;

            initData();

            initImage();
        } else if (source == reLoginItem) {
            //关闭当前的游戏界面
            this.setVisible(false);
            //打开登录界面
            new LoginJFrame();
        } else if (source == closeItem) {
            System.exit(0);
        } else if (source == accountItem) {
            //创建一个弹窗对象
            JDialog jDialog = new JDialog();


            //创建图片对象
            ImageIcon account = new ImageIcon("JavaTakeOff\\puzzlegame\\image\\about.png");
            JLabel jLabel = new JLabel(account);
            jLabel.setBounds(0, 0, 258, 258);
            jDialog.getContentPane().add(jLabel);


            //设置弹窗大小
            jDialog.setSize(344, 344);
            //弹窗置顶
            jDialog.setAlwaysOnTop(true);
            //弹窗居中
            jDialog.setLocationRelativeTo(null);
            //弹窗不关闭则无法操作下面的界面
            jDialog.setModal(true);
            //将弹窗显示在界面上
            jDialog.setVisible(true);

        } else if (source == girlItem) {
            path = "JavaTakeOff\\puzzlegame\\image\\girl\\girl" + (random.nextInt(13) + 1) + "\\";
            //步数清零
            step = 0;
            initData();
            initImage();
        } else if (source == animalItem) {
            path = "JavaTakeOff\\puzzlegame\\image\\animal\\animal" + (random.nextInt(8) + 1) + "\\";
            //步数清零
            step = 0;
            initData();
            initImage();
        } else if (source == sportItem) {
            path = "JavaTakeOff\\puzzlegame\\image\\sport\\sport" + (random.nextInt(10) + 1) + "\\";
            //步数清零
            step = 0;
            initData();
            initImage();
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
