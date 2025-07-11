package codeblockDemo1;

public class codeblock1 {
    public static void main(String[] args) {
        //局部代码块
//        {
//           int a = 10;
//        }
        //代码运行完局部代码块时，变量a就从内存消失了
        //System.out.println(a);

        Student s1 = new Student();

        Student s2 = new Student("zhangsan",23);
    }
}
