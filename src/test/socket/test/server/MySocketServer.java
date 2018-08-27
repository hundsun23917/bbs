package socket.test.server;


import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MySocketServer {
    public static void main(String[] args) throws IOException {
        int port = 33333;
        ServerSocket serverSocket = new ServerSocket(port);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len;
        StringBuilder stringBuilder = new StringBuilder();
        while ((len = inputStream.read(bytes))!=-1){
            stringBuilder.append(new String(bytes,0,len,"utf-8"));
        }
        System.out.println("服务端收到数据："+stringBuilder);
        socket.close();
        serverSocket.close();
    }
}
