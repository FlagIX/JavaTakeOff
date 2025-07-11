package a01interfacedemo8;

public interface Inter {
    public default void startDefault(){
        System.out.println("程序开始");
        logDefault();
    }

    public default void endDefault(){
        System.out.println("程序结束");
        logDefault();
    }

    //普通的私有方法，给默认方法服务的
    private void logDefault(){
        System.out.println("记录程序运行日志");
    }

    public static void startStatic(){
        System.out.println("程序开始");
        logStatic();
    }

    public static void endStatic(){
        System.out.println("程序结束");
        logStatic();
    }

    private static void logStatic(){
        System.out.println("记录程序运行日志");
    }

//      1.JDK7以前：接口中只能定义抽象方法。
//      2.JDK8:接口中可以定义有方法体的方法。(默认、静态)
//      3.JDK9:接口中可以定义私有方法。
//      4.私有方法分为两种：普通的私有方法，静态的私有方法
}
