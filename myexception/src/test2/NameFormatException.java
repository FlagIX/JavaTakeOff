package test2;

public class NameFormatException extends RuntimeException{
    //技巧：
    //NameFormat:当前异常的名字，表示姓名格式化问题
    //Exception:表示当前类是一个异常类

    //运行时：RuntimeException核心就表示由于参数错误而导致的问题
    //编译时：Exception核心提醒程序员检查本地信息


    //定义异常类
    //写继承关系
    //空参构造
    //带参构造

    public NameFormatException() {
    }

    public NameFormatException(String message) {
        super(message);
    }
}
