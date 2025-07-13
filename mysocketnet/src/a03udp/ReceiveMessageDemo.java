package a03udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ReceiveMessageDemo {
    public static void main(String[] args) throws IOException {
        /*
        按照下面的要求实现程序
        UDP发送数据：数据来自于键盘录入，直到输入的数据是886，发送数据结束
        UDP接收数据：因为接收端不知道发送端什么时候停止发送，故采用死循环接收
        */
        //创建对象
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,0,bytes.length);

        while (true){
            //接收消息
            ds.receive(dp);

            //解析消息
            byte[] data = dp.getData();
            InetAddress address = dp.getAddress();
            int length = dp.getLength();
            int port = dp.getPort();

            //打印
            System.out.println("接收到的数据是：" + new String(data,0,length));
            System.out.println("是从" + address + "这个设备的" + port + "端口接收的");
        }


        //释放资源
        //ds.close();
    }
}
