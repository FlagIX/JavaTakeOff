package a04udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ReceiveMessageDemo3 {
    public static void main(String[] args) throws IOException {

        //创建对象
        MulticastSocket ms = new MulticastSocket(10086);

        //2.将当前本机，添加到224.0.0.1的这一组当中
        InetAddress address = InetAddress.getByName("224.0.0.1");
        ms.joinGroup(address);

        //接收消息
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,0,bytes.length);

        ms.receive(dp);

        //解析消息
        byte[] data = dp.getData();
        InetAddress ip = dp.getAddress();
        int len = dp.getLength();
        int port = dp.getPort();

        //打印
        System.out.println("接收到的数据是：" + new String(data,0,len));
        System.out.println("是从" + ip + "这个设备的" + port + "端口接收的");

        //释放资源
        ms.close();
    }
}
