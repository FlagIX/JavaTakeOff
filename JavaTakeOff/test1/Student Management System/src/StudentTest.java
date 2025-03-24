import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        //创建一个集合来储存用户
        ArrayList<User> list = new ArrayList<>();

        loop:while (true){
            //登录界面
            System.out.println("欢迎来到用户管理系统");
            System.out.println("请选择操作1.登录2.注册3.忘记密码4.退出");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose){
                case "1":
                    login(list);
                    break;
                case "2":
                    enrol(list);
                    break;
                case "3":
                    forgetPassword(list);
                    break;
                case "4":
                    System.exit(0);
                default:
                    System.out.println("没有这项选项");
            }
        }
    }

    //注册学生管理系统
    public static ArrayList<User> enrol(ArrayList<User>list){
        //创建一个用户对象
        User user = new User();

        Scanner sc = new Scanner(System.in);

        //用户名
        while (true){
            System.out.println("请输入要注册的用户名");
            String username = sc.next();
            //判断用户名唯一
            boolean flagUserName1 = containsUsernameSole(username, list);
            if(flagUserName1){
                System.out.println("用户已存在，请重新输入");
            }else{

            }

            //判断用户名的有效性
            boolean flagUserName2 = containsUsernameRight(username);
            if(flagUserName2){
                //将用户名存入集合
                user.setUsername(username);
                break;
            }else {
                System.out.println("用户名不合法");
            }
        }

        //密码
        //第一次输入
        System.out.println("请输入注册的密码");
        String password = sc.next();

        while (true){
            //第二次输入
            System.out.println("请再输入注册的密码");
            String passwordAgain= sc.next();

            if(password.equals(passwordAgain)){
                user.setPassword(password);
                break;
            }else{
                System.out.println("密码输入错误，请重新输入");
            }
        }

        //身份证
        while (true){
            System.out.println("请输入身份证");
            String idcode = sc.next();

            //身份证合法性判断
            boolean flagIdCode = containsIdcodeRight(idcode);
            if(flagIdCode){
                user.setIdcode(idcode);
                break;
            }else{
                System.out.println("身份证不合法，请重新输入");
            }
        }

        //手机号码
        while (true){
            System.out.println("请输入你的手机号码");
            String phoneNumber = sc.next();
            //判断手机号码合法性
            boolean flagPhoneNumber = containsPhoneNumberRight(phoneNumber);
            if(flagPhoneNumber){
                user.setPhonenumber(phoneNumber);
                break;
            }else {
                System.out.println("手机号码不合法，请重新输入");
            }
        }

        //将对象添加到集合中
        list.add(user);
        System.out.println("恭喜您注册成功");

        return list;
    }

    //登录学生管理系统
    public static void login(ArrayList<User>list){
        System.out.println("登录学生管理系统");
        String username = "";

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入用户名");
            username = sc.next();

            //判断用户名是否注册
            boolean flag = containsUsernameSole(username, list);
            if(flag){
                break;
            }else{
                System.out.println("用户名未注册，请先注册");
                return;
            }
        }
        //生成验证码
        String rightCaptcha = captcha();
        while (true){
            System.out.println(rightCaptcha);
            System.out.println("请输入验证码");
            String captcha = sc.next();
            if(rightCaptcha.equals(captcha)){
                break;
            }else{
                System.out.println("验证码错误，请重新输入");
            }
        }


        //录入密码
        for (int i = 0; i < 3; i++) {

            //将集合中对应Username的元素放入到集合中
            int index = getUserIndex(username,list);
            User user = list.get(index);

            System.out.println("请输入密码");
            String password = sc.next();
            if(password.equals(user.getPassword())&&username.equals(user.getUsername())){
                break;
            }else {
                System.out.println("用户名或密码错误，请重新输入");
            }
            if(i==2){
                System.out.println("您已经输错3次,将退出登录");
                return;
            }
        }

        //登录成功
        Studentmanagement();


    }

    //忘记密码
    public static ArrayList<User> forgetPassword(ArrayList<User>list){
        System.out.println("请输入用户名");
        Scanner sc = new Scanner(System.in);
        String userName = sc.next();
        boolean flag = containsUsernameSole(userName,list);
        while (true){
            if(flag){
                int userIndex = getUserIndex(userName, list);
                User user = list.get(userIndex);
                System.out.println("请输入手机号码");
                String phoneNumber = sc.next();
                System.out.println("请输入身份证号");
                String idCode = sc.next();
                if(phoneNumber.equals(user.getPhonenumber())||idCode.equals(user.getIdcode())){
                    System.out.println("输入新密码");
                    String newPassword = sc.next();
                    //将新密码赋值给对象
                    user.setPassword(newPassword);
                    //将对象添加到集合
                    list.add(user);
                    System.out.println("密码修改成功");
                    break;
                }else{
                    System.out.println("账号信息不一致修改失败");
                }
            }else {
                System.out.println("用户未注册，请先注册");
                return list;
            }
        }
        return list;
    }

    //判断手机号码的合法性
    public static boolean containsPhoneNumberRight(String phoneNumber){
        if(phoneNumber.length()==11){
            if(phoneNumber.charAt(0)=='1'){
                    for (int i = 0; i < phoneNumber.length(); i++) {
                        char c = phoneNumber.charAt(i);
                        if(c>=48&&c<=57){

                        }else {
                            return false;
                        }
                    }
            }else {
                return false;
            }
        }else {
            return false;
        }
        return true;
    }
    //判断身份证的合法性
    public static boolean containsIdcodeRight(String idcode){
        if(idcode.length()==18){
            if(!(idcode.charAt(0)=='0')){
                if((idcode.charAt(17)>=48&&idcode.charAt(17)<=57)||(idcode.charAt(17)=='X')||(idcode.charAt(17)=='x')){
                    for (int i = 0; i < idcode.length()-1; i++) {
                        char c = idcode.charAt(i);
                        if(c>=48&&c<=57){

                        }else {
                            return false;
                        }
                    }
                }else {
                    return false;
                }
            }else {
                return false;
            }
        }else {
            return false;
        }
        return true;
    }
    //判断用户名的合法性
    public static boolean containsUsernameRight(String username){
        int countnum = 0;
        int countchar = 0;
        if(username.length()>=3&&username.length()<=15){
            for (int i = 0; i < username.length(); i++) {
                char c = username.charAt(i);
                if(c>='0'&&c<='9'){
                    countnum++;

                } else if (c>='A'&&c<='Z'&&c>='a'&&c<='z') {
                    countchar++;
                } else{
                    return false;
                }
            }
            //不能纯数字或者纯字母
            if(countnum == username.length()||countchar == username.length()){
                return false;
            }else {
                return true;
            }
        }
        return false;
    }
    //生成一个验证码
    public static String captcha(){
        char[] arr = new char[5];
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int num = random.nextInt(51);
            if(num<26){
                arr[i] = (char)('A'+num);//大写字母
            }else{
                arr[i] = (char)('a'+(num-26));//小写字母
            }
        }
        int number = random.nextInt(10);
        arr[4] = (char)('0'+number) ;
        //将数组打乱
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = random.nextInt(5);
            char temp = arr[randomIndex];
            arr[randomIndex] = arr[i];
            arr[i] = temp;
        }
        String result = new String(arr);
        return result;
    }
    //判断用户名是否注册
    public static boolean containsUsernameSole(String username,ArrayList<User>list){
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String username1 = user.getUsername();
            if(username1.equals(username)){
                return true;
            }
        }
        return false;
    }

    //学生管理系统
    public static void Studentmanagement(){
        //创建一个集合来储存学生信息
        ArrayList<Student> list = new ArrayList<>();

        loop:while (true){
            //初始菜单
            System.out.println("-----------欢迎来到黑马学生管理系统-----------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入你的选择:");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose){
                case "1":
                    addStudent(list);
                    break;
                case "2":
                    deleteStudent(list);
                    break;
                case "3":
                    updateStudent(list);
                    break;
                case "4":
                    selectStudent(list);
                    break;
                case "5":
                    System.out.println("退出学生管理系统");
                    //break loop;
                    return;
                default:
                    System.out.println("没有这个选项");
            }
        }
    }

    //添加学生(id唯一)
    public static void addStudent(ArrayList<Student> list){
        System.out.println("1:添加学生");
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        String id = "";

        while (true){
            System.out.println("请输入添加学生的id");
            id = sc.next();

            //判断id是否唯一
            boolean flag = containsId(id,list);
            if(flag){
                System.out.println("id已存在，请重新录入");
            }else{
                student.setId(id);
                break;
            }
        }
            System.out.println("请输入添加学生的name");
            String name = sc.next();
            student.setName(name);
            System.out.println("请输入添加学生的age");
            int age = sc.nextInt();
            student.setAge(age);
            System.out.println("请输入添加学生的address");
            String address = sc.next();
            student.setAddress(address);
            //将学生对象储存到集合中
            list.add(student);

            System.out.println("学生信息添加成功");
    }

    //删除学生
    public static void deleteStudent(ArrayList<Student> list){
        System.out.println("2:删除学生");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入删除学生的id");
        String id = sc.next();
        //判断id是否存在
        boolean flag = containsId(id, list);
        if(flag){
            //寻找删除学生id对应的索引
            int index = getIndex(id,list);
            //根据索引删除学生信息
            list.remove(index);
            System.out.println("学生删除成功");
        }else {
            System.out.println("id不存在");
        }
    }

    //修改学生
    public static void updateStudent(ArrayList<Student>list){
        System.out.println("3:修改学生");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入修改学生的id");
        String id = sc.next();
        //判断id是否存在
        boolean flag = containsId(id, list);
        if(flag){
            //寻找修改学生id对应的索引
            int index = getIndex(id, list);

            Student stu = list.get(index);


            //输入要修改的信息
            System.out.println("请输入添加学生的name");
            String newName = sc.next();
            stu.setName(newName);
            System.out.println("请输入添加学生的age");
            int newAge = sc.nextInt();
            stu.setAge(newAge);
            System.out.println("请输入添加学生的address");
            String newAddress = sc.next();
            stu.setAddress(newAddress);

            System.out.println("学生信息修改成功");

        }else{
            System.out.println("id不存在");
        }
    }

    //查询学生
    public static void selectStudent(ArrayList<Student>list){
        System.out.println("4:查询学生");
        if(list.size()==0){
            System.out.println("当前无学生信息，请先添加后再查询");
        }

        //打印表头
        System.out.println("id\t\t姓名\t年龄\t家庭住址");

        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getId()+"\t"+student.getName()+"\t"+student.getAge()+"\t"+student.getAddress());
        }
    }

    //判断id是否唯一
    public static boolean containsId(String id,ArrayList<Student>list){
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student student1 = list.get(i);
            String id1 = student1.getId();
            if(id1.equals(id)){
                return true;
            }
        }
        return false;
    }

    //根据学生id查找索引
    public static int getIndex(String id,ArrayList<Student>list){
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String sid = stu.getId();
            if(sid.equals(id)){
                return i;
            }
        }
        return -1;
    }
    //根据用户id查找索引
    public static int getUserIndex(String userName,ArrayList<User>list){
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String uname = user.getUsername();
            if(uname.equals(userName)){
                return i;
            }
        }
        return -1;
    }
}