package com.socket;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer_02 {
    public static void main(String[] args) throws IOException {
        //1.创建服务器对象
        ServerSocket server=new ServerSocket(9898);
        //2.获取连接
        Socket socket= server.accept();
        //3.从服务中读取数据
        InputStream is = socket.getInputStream();
        //4.将数据写到六中
        FileOutputStream fos=new FileOutputStream("G:/photo/复制品.jpg");
        int len=0;
        byte[] bytes=new byte[1024];
        while((len=is.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        //写完数据提示上传成功
        socket.getOutputStream().write("上传成功".getBytes());
        fos.close();
        socket.close();
        server.close();
    }
}
