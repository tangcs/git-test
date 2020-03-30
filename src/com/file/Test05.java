package com.file;

import java.io.File;

public class Test05 {
    public static void main(String[] args) {
        File file=new File("G:/Solr/solr-5.3.1/README.txt");
        String fileName = file.getName();
        System.out.println("文件名："+fileName);
        long fileLength = file.length();
        System.out.println("文件大小为："+fileLength);
        String absolutePath = file.getAbsolutePath();
        System.out.println("文件的绝对路径"+absolutePath);
        String parentPath = file.getParent();//返回字符串
        System.out.println("文件的父路径为："+parentPath);
        File parentFile = file.getParentFile();//返回文件对象
        System.out.println("文件的父路径为："+parentFile);
    }
}
