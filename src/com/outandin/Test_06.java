package com.outandin;

import java.io.*;

public class Test_06 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin=new FileInputStream("G:/test/1634120137_汤保砚_优乐购商城.docx");
        BufferedInputStream bis=new BufferedInputStream(fin);
        FileOutputStream fos=new FileOutputStream("G:/test/初稿3.docx");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        long start = System.currentTimeMillis();
        byte[] buffer=new byte[1024];
        int len=-1;
        while ((len=bis.read(buffer))!=-1){
            bos.write(buffer,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制文件共耗时"+(end-start)+"毫秒");
        //释放资源
        bis.close();
        bos.close();
    }
}
