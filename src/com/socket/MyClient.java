package com.socket;

import java.io.*;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) throws IOException {
        File file = new File("G:/photo/1.jpg");
        if(!file.exists()){
            return;
        }
        if (!file.getName().endsWith(".jpg")){
            return;
        }
        if (file.length()>=1024*1024*2){

            return;
        }

        Socket socket = new Socket("127.0.0.1",9999);

        //输出流
        OutputStream outputStream = socket.getOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        int len;
        byte[] arr = new byte[1024];

        while ((len=fileInputStream.read(arr))!=-1){
            outputStream.write(arr,0,len);
        }
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        int i = inputStream.read(arr);
        System.out.println(new String(arr,0,i));

        fileInputStream.close();
        outputStream.close();
        socket.close();


    }
}
