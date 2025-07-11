package Test1;


public class Test {
    public static void main(String[] args) {
//        1.包的作用？
//        包就是文件夹，用来管理各种不同功能的java类

//        2.包名书写的规则？
//        公司域名反写+包的作用，需要全部英文小写，见名知意

//        3.什么是全类名？
//        包名+类名

//        4.什么时候需要导包？什么时候不需要导包？
//        1.使用同一个包中的类时，不需要导包。
//        2.使用java.lang包中的类时，不需要导包。
//        3.其他情况都需要导包
//        4.如果同时使用两个包中的同名类，需要用全类名。

        //创建对象
//1.使用同一个包中的类时，不需要导包。
        Student s = new Student();
        s.setName("zhangsan");
        s.setAge(23);
        System.out.println(s.getName()+","+s.getAge());


//2.使用java.lang包中的类时，不需要导包。
        String str = "abc";
        System.out.println(str);


//3. 其他情况都需要导包

        domain1.Teacher t1 = new domain1.Teacher();
//4.如果同时使用两个包中的同名类，需要用全类名
        domain2.Teacher t2 = new domain2.Teacher();
    }
}
