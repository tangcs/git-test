package com.outandin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test_02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin=new FileInputStream("G:/g.txt");
        int len=-1;
        while((len=fin.read())!=-1){
            System.out.println((char)len);
        }
        //关闭资源
        fin.close();
    }
}
