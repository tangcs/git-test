package com.file;

import java.io.File;
import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个文件夹路径");
        String path = sc.nextLine();
        File dir=new File(path);
        File[] files = dir.listFiles();
        for (File file : files) {
            file.delete();
        }
        System.out.println("删除文件夹！");
        dir.delete();
    }
}
