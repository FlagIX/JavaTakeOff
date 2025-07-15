package a05tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //TCP协议，接收数据
        //1.创建对象ServerSocker
        ServerSocket ss = new ServerSocket(10001);

        //监听客户端的链接
        Socket socket = ss.accept();

        //从连接通道中获取输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        //输出字符
        int b;
        while ((b = br.read()) != -1){
            System.out.print((char) b);
        }

        //释放资源
        br.close();
        socket.close();
        ss.close();
    }
}
