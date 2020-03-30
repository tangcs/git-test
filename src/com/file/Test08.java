package com.file;

import java.io.File;
import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String path = sc.nextLine();
        File file=new File(path);
        if (file.isFile()){
            System.out.println("文件的大小为："+file.length());
        }else if(file.isDirectory()){
            File[] files = file.listFiles();
            long dirSize = getDirSize(files);
            System.out.println(file.getName()+"文件夹的大小文："+dirSize);
        }
    }
    public static long getDirSize(File[] files){
        long length=0;
        for (File file : files) {
            if(file.isFile()){
                length+=file.length();
            }else{
                length+=getDirSize(file.listFiles());
            }
        }
        return length;
    }

}
