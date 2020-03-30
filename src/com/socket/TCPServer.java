package com.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1.创建服务器对象
        ServerSocket serverSocket=new ServerSocket(8002);
        //2.等待连接
        Socket socket= serverSocket.accept();
        //3.获取输入流对象
        //InputStream ins = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        os.write("hello world!".getBytes());
        //关闭资源
        os.close();
    }
}
