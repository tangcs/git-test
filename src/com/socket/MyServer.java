package com.socket;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);


        while (true){

            Socket socket = serverSocket.accept();

            new Thread(){

                @Override
                public void run() {

                    try {

                        InputStream inputStream = socket.getInputStream();

                        FileOutputStream fileOutputStream = new FileOutputStream("G:/photo/"+System.currentTimeMillis()+".jpg");

                        int len;
                        byte[] arr = new byte[1024];

                        while ((len=inputStream.read(arr))!=-1){

                            fileOutputStream.write(arr,0,len);
                        }

                        OutputStream outputStream = socket.getOutputStream();
                        outputStream.write("上传成功".getBytes());

                        outputStream.close();
                        fileOutputStream.close();
                        inputStream.close();
                        socket.close();

                    }catch (Exception e){

                        e.printStackTrace();
                    }

                }
            }.start();

        }

    }
}
