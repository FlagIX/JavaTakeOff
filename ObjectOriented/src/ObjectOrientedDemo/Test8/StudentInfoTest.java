package ObjectOrientedDemo.Test8;

import java.util.Scanner;

public class StudentInfoTest {
    public static void main(String[] args) {
        //创建一个数组
        StudentInfo[] arr = new StudentInfo[3];
        //创建学生对象
        StudentInfo s1 = new StudentInfo(001, "张三", 18);
        StudentInfo s2 = new StudentInfo(002, "李四", 19);

        //把学生对象添加到数组中
        arr[0] = s1;
        arr[1] = s2;


        //在添加一个学生对象
        StudentInfo s4 = new StudentInfo(004, "赵六", 21);
        //要求1
        //添加时对学号进行唯一性判断
        boolean flag = contains(arr, s4.getId());
        //要求2
        if (flag){
            System.out.println("该学号已存在，请重新输入");
        }else{
            //把学生对象添加到数组
            //判断原数组是否存满
            int count = isFull(arr);
            if (count == arr.length){
                //原数组存满
                //创建一个新数组
                //把原数组中的元素复制到新数组中
                StudentInfo[] newArr = createNewArr(arr);
                //把学生对象添加到新数组中
                newArr[count] = s4;
                //遍历新数组
                printArr(newArr);

            }else{
                //原数组未满
                arr[count]=s4;
                //遍历数组
                printArr(arr);

            }
        }

        //要求3
        //根据id删除学生信息
        //键盘录入id
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学号");
        int id = sc.nextInt();
        deleteId(arr,id);

        //要求4
        printArr(arr);

        //要求5
        System.out.println("请输入要修改的学号");
        int idAge = sc.nextInt();
        int index = getIndex(arr, idAge);
        //判断索引
        if(index >= 0){
            StudentInfo stu = arr[index];
            int newAge = stu.getAge() + 1;
            stu.setAge(newAge);
            System.out.println();
            printArr(arr);
        }else{
            System.out.println("未找到");
        }

    }
    //定义一个方法，用于寻找索引
    public static int getIndex(StudentInfo[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null){
                int sid = arr[i].getId();
                if (sid == id){
                    return i;
                }
            }
        }
        return -1;
    }

    //定义一个方法，用于根据id删除学生信息
    public static void deleteId(StudentInfo[] arr, int idAge){
        for (int i = 0; i < arr.length; i++) {
            StudentInfo stu = arr[i];
            if(idAge == stu.getId()){
                arr[i] = null;
                break;
            }if (i == arr.length-1){
                System.out.println("删除失败");
            }
        }
    }

    //遍历数组
    public static void printArr(StudentInfo[] arr){
        for (int i = 0; i < arr.length; i++) {
            StudentInfo stu = arr[i];
            if (stu != null){
                System.out.println(stu.getId() + "," + stu.getName() + "," + stu.getAge());
            }
        }
    }

    //定义一个方法，用于判断学号是否存在
    public static boolean contains(StudentInfo[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            StudentInfo stu = arr[i];
            if (stu != null){
                int sid = stu.getId();
                if (sid == id){
                    return true;
                }
            }
        }
        return false;
    }

    //判断数组是否存满
    public static int isFull(StudentInfo[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                count++;
            }
        }
        return count;
    }


    //建立新数组
    public static StudentInfo[] createNewArr(StudentInfo[] arr){
        //创建一个新数组
        StudentInfo[] newArr = new StudentInfo[arr.length+1];
        //把原数组中的元素复制到新数组中
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
