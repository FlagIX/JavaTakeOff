package a04objectdemo;

public class ObjectDemo1 {
    public static void main(String[] args) {
        /*
        public String tostring()                返回对象的字符串表示形式
        public boolean equals(object obj)       比较两个对象是否相等
        protected object clone(int a)           对象克隆
        */

        //1.toString    返回对象的字符串表示形式
        Object object = new Object();
        String str1 = object.toString();
        System.out.println(str1);//java.lang.Object@4eec7777

        Student stu = new Student();
        String str2 = stu.toString();
        System.out.println(str2);//a04objectdemo.Student@41629346

        //细节：
        //System:类名
        //out:静态变量
        //System.out:获取打印的对象
        //println():方法
        //参数：表示打印的内容

        //思考：默认情况下，因为object类中的toString方法返回的是地址值
        //所以，默认情况下，打印一个对象打印的就是地址值
        //但是地址值对于我们是没什么意义的？
        //我想要看到对象内部的属性值？我们该怎么办？
        //处理方案：重写父类Object类中的toString方法
        System.out.println(stu);//a04objectdemo.Student@41629346

        //toString方法的结论：
        //如果我们打印一个对象，想要看到属性值的话，那么就重写toString方法就可以了。
        //在重写的方法中，把对象的属性值进行拼接。
    }
}
