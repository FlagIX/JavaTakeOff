package ObjectOriented;

//构造方法
//构造方法是一种特殊的方法，它的主要作用是完成对新对象的初始化
//格式：
// public 类名(参数列表){
//     // 方法体
// }
/*
特点
1.方法名与类名相同，大小写也要一致
2.没有返回值类型，连void都没有
3.没有具体的返回值（不能由retrun带回结果数据)
*/


/*
构造方法注意事项
①构造方法的定义
·如果没有定义构造方法，系统将给出一个默认的无参数构造方法
·如果定义了构造方法，系统将不再提供默认的构造方法
②构造方法的重载
·带参构造方法，和无参数构造方法，两者方法名相同，但是参数不同，这叫做构造方法的重载
③推荐的使用方式
·无论是否使用，都手动书写无参数构造方法，和带全部参数的构造方法
*/
public class Student {
    private String name;
    private int age;

    //如果我们自己没有写任何的构造方法
    //那么虚拟机给我们加一个空参构造方法
    public Student(){
        System.out.println("看看我执行了吗");
    }

    //带参构造方法
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
