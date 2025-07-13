package a04udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class SendMessageDemo {
    public static void main(String[] args) throws IOException {
        //单播就是之前的代码
        //广播就是将地址改为255.255.255.255

        //组播发送端代码

        //创建对象
        MulticastSocket ms = new MulticastSocket();

        //打包数据
        String s = "你好世界";
        byte[] bytes = s.getBytes();
        InetAddress address = InetAddress.getByName("224.0.0.1");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bytes,0,bytes.length,address,port);

        //发送数据
        ms.send(dp);

        //释放资源
        ms.close();
    }
}
