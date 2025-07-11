package a04mygenerics;

public class GenericsDemo4 {
    public static void main(String[] args) {
        //泛型接口的两种使用方式：
        //1.实现类给出具体的类型
        //2.实现类延续泛型，创建实现类对象时再确定类型

        MyArrayList2 list2 = new MyArrayList2();
        list2.add("aaa");


        MyArrayList3<String> list3 = new MyArrayList3();
        list3.add("aaa");
        list3.add("bbb");
        list3.add("ccc");
    }
}
