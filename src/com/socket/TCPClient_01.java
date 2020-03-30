package com.socket;

import java.io.*;
import java.net.Socket;

public class TCPClient_01 {
    public static void main(String[] args) throws IOException {
        //创建对象
        Socket socket=new Socket("127.0.0.1",9898);
        //指定路径
        FileInputStream fis=new FileInputStream("G:/photo/idea-background01.jpg");
        //读取服务器数据
        OutputStream os = socket.getOutputStream();
        int len=0;
        byte[] bytes=new byte[1024];
        while((len=fis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }

        //告诉服务器书写完毕
        socket.shutdownOutput();
        //书写到服务器
        InputStream is = socket.getInputStream();
        len=is.read(bytes);
        System.out.println("服务器"+new String(bytes,0,len));
        //关闭资源
        fis.close();
        socket.close();
    }
}
