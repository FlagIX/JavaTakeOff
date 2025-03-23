import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
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
                    System.out.println("退出");
                    //break loop;
                    System.exit(0);//虚拟机停止运行
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

    //根据id查找索引
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
}
