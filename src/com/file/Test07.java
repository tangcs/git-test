package com.file;

import java.io.File;

public class Test07 {
    public static void main(String[] args) {
        File file1=new File("G:/Download");
        File[] files = file1.listFiles();
        testFile(files);
    }
    public static void testFile(File[] files){
        for (File file : files) {
            if(file.isFile()){
                System.out.println(file+"是一个文件");
            }else if(file.isDirectory()){
                System.out.println(file+"是一个文件夹");
                File[] files1 = file.listFiles();
                testFile(files1);
            }
        }
    }
}
