package a02udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ReceiveMessageDemo {
    public static void main(String[] args) throws IOException {
        //接收数据

        //1.创建DatagramSocket对象（快递公司）
        //细节：
        //在接收的时候，一定要绑定端口
        //而且绑定的端口一定要跟发送的端口保持一致
        DatagramSocket ds = new DatagramSocket(10086);

        //接收数据
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,0,bytes.length);

        //该方法是阻塞的
        //程序执行到这一步的时候，会在这里死等
        //等发送端发送消息
        ds.receive(dp);

        //解析数据
        byte[] data = dp.getData();
        int len = dp.getLength();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();

        //打印
        System.out.println("接收到的数据是：" + new String(data,0,len));
        System.out.println("是从" + address + "这个设备的" + port + "端口接收的");

        //释放资源
        ds.close();
    }
}
