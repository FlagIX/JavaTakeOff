package a04objectdemo;

public class ObjectDemo2 {
    public static void main(String[] args) {
        /*
        public boolean equals(object obj)       比较两个对象是否相等
        */

        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("zhangsan",23);
        boolean result = s1.equals(s2);
        System.out.println(result);

        //结论：
        //1.如果没有重写equa1s方法，那么默认使用Object中的方法进行比较，比较的是地址值是否相等
        //2.一般来讲地址值对于我们意义不大，所以我们会重写，重写之后比较的就是对象内部的属性值了。
    }
}
