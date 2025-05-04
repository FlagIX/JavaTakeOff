package a05myset;

import java.util.Comparator;
import java.util.TreeSet;

public class a08TreeSetDemo4 {
    public static void main(String[] args) {
        //需求：创建5个学生对象
        //属性：（姓名，年龄，语文成绩，数学成绩，英语成绩)，
        //按照总分从高到低输出到控制台
        //如果总分一样，按照语文成绩排
        //如果语文一样，按照数学成绩排
        //如果数学成绩一样，按照英语成绩排
        //如果英文成绩一样，按照年龄排
        //如果年龄一样，按照姓名的字母顺序排
        //如果都一样，认为是同一个学生，不存。

        //创建学生对象
        Student3 s1 = new Student3("theshy",21,91,92,93);
        Student3 s2 = new Student3("jiejie",22,95,91,89);
        Student3 s3 = new Student3("rookie",23,88,91,94);
        Student3 s4 = new Student3("gala",24,95,90,93);
        Student3 s5 = new Student3("meiko",25,97,92,93);

        //创建集合并添加元素
        TreeSet<Student3> ts = new TreeSet<>(new Comparator<Student3>() {
            @Override
            public int compare(Student3 o1, Student3 o2) {
                int i = o2.getSum() - o1.getSum();
                i = i==0?o2.getChineseGrade()-o1.getChineseGrade():i;
                i = i==0?o2.getMathGrade()-o1.getMathGrade():i;
                i = i==0?o2.getEnglishGrade()-o1.getEnglishGrade():i;
                i = i==0?o2.getAge()-o1.getAge():i;
                i = i==0?o2.getName().compareTo(o1.getName()):i;
                return i;
            }
        });

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        //打印
        //System.out.println(ts);
        for (Student3 t : ts) {
            System.out.print(t+" ");
            System.out.println(t.getSum());
        }
    }
}
