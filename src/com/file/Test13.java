package com.file;

import java.io.File;
import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //输入一个文件夹路径
        String path = sc.nextLine();
        //根据路径创建文件对象
        File file=new File(path);
        long fileSize = calculate(file);
        System.out.println("文件的大小文"+fileSize);

    }
    public static long calculate(File dir) {
        long length=0;
        File[] files = dir.listFiles();
        for (File file : files) {
            if(file.isFile()){
                length+=file.length();
            }else{
                length+=calculate(file);
            }
        }
        return length;
    }
}
