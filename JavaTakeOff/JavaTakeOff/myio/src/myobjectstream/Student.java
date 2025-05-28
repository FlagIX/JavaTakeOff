package myobjectstream;

import java.io.Serial;
import java.io.Serializable;

/*
        Serializable接口里面是没有抽象方法，标记型接口
        一旦实现了这个接口，那么就表示当前的Student类可以被序列化
        理解：
        一个物品的合格证
*/

/*
        ①
        使用序列化流将对象写到文件时，需要让Javabean类实现Serializable接口。
        否则，会出现NotSerializableException.异常
        ②
        序列化流写到文件中的数据是不能修改的，一旦修改就无法再次读回来了
        ③
        序列化对象后，修改了Javabean类，再次反序列化，会不会有问题？
        会出问题，会抛出InvalidClassException异常
        解决方案：给Javabean:类添加serialVersionUID（序列号、版本号)
        ④
        如果一个对象中的某个成员变量的值不想被序列化，又该如何实现呢？
        解决方案：给该成员变量加transient关键字修饰，该关键字标记的成员变量不参与序列化过程
*/
public class Student implements Serializable {


    //版本号
    @Serial
    private static final long serialVersionUID = -6836389873013001547L;
    private String name;
    private int age;

    //transient:瞬态关键字
    //作用：不会把当前属性序列化到本地文件当中
    private transient String address;

    public Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", address = " + address + "}";
    }
}
