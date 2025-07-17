package a01mydynamicprosy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//类的作用：
//创建一个代理
public class Proxy {

    /*
            方法的作用：
                给一个明星的对象，创建一个代理
            形参：
                被代理的明星对象
            返回值：
                给明星创建的代理
    */
    //需求：
    //外面的人想要大明星唱一首歌
    //1.获取代理的对象
    //代理对象=ProxyUtil.createProxy(大明星的对象)；
    //2.再调用代理的唱歌方法
    //代理对象唱歌的方法()；
    public static Star createProxy(BigStar bigStar) {
        /*
        java.lang.ref1ect.Proxy类：提供了为对象产生代理对象的方法：

        public static object newProxyInstance(ClassLoader loader,Class<?>[]interfaces,InvocationHandler h)
        参数一：用于指定用哪个类加载器，去加载生成的代理类
        参数二：指定接口，这些接口用于指定生成的代理长什么，也就是有哪些方法
        参数三：用来指定生成的代理对象要干什么事情
        */
        Star star = (Star) java.lang.reflect.Proxy.newProxyInstance(
                Proxy.class.getClassLoader(),
                new Class[]{Star.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if ("sing".equals(method.getName())) {
                            System.out.println("准备话筒，收钱");
                        } else if ("dance".equals(method.getName())) {
                            System.out.println("准备场地，收钱");
                        }
                        //去找大明星开始唱歌或者跳舞
                        //代码的表现形式：调用大明星里面唱歌或者跳舞的方法
                        return method.invoke(bigStar, args);
                    }
                }

        );
        return star;
    }
}
