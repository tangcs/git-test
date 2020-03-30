package com.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        //获取socket客户端对象
        Socket socket=new Socket("127.0.0.1",8002);
        //获取字节输入流对象
        //OutputStream os = socket.getOutputStream();
        InputStream is = socket.getInputStream();
        int len;
        byte[] buffer=new byte[1024];
        if((len=is.read(buffer))!=-1){
            System.out.println(new String(buffer,0,len));
        }
        /*//写数据
        os.write("服务器，我是客户端".getBytes());
        //关闭资源
        os.close();*/

        is.close();
        socket.close();
    }
}
