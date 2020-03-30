package com.outandin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test_03 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象并关联文件
        FileInputStream fin=new FileInputStream("G:/test/1634120137_汤保砚_优乐购商城.docx");
        //创建字节输出流对象并关联文件
        FileOutputStream fos=new FileOutputStream("G:/test/初稿.docx");
        long start = System.currentTimeMillis();
        int len=-1;
        while((len=fin.read())!=-1){
            fos.write((char)len);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制文件共耗时"+(end-start)+"毫秒");
        //关闭资源
        fin.close();
        fos.close();
    }
}
