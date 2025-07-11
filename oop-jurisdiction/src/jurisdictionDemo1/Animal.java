package jurisdictionDemo1;

public class Animal {

    //权限修饰符的使用规则
    //实际开发中，一般只用private和public
    //成员变量私有
    //方法公开
    //特例：如果方法中的代码是抽取其他方法中共性代码，这个方法一般也私有。

    //权限修饰符：
    //private ,空着不写（默认/缺省）,protected,public
    private String name;

    public void show(){
        System.out.println(name);
    }
}
