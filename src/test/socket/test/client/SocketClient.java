package socket.test.client;

import socket.test.utils.FileUtils;

import java.io.*;
import java.net.Socket;

public class SocketClient {
    public static void main(String[] args) throws IOException {
        String host = "127.0.0.1";
        int port =33333;
        Socket socket = new Socket(host,port);
        OutputStream outputStream = socket.getOutputStream();
        StringBuilder message = FileUtils.getFileStr("d://socket.txt");
        System.out.println("客户端发送数据："+message);
        outputStream.write(message.toString().getBytes("utf-8"));
        socket.close();
    }
}
