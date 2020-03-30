package com.file;

import java.io.File;

public class Testo3 {
    public static void main(String[] args) {
        //创建单级文件夹
        File file1=new File("G:/aaa");
        createDir(file1);
        //创建多级文件夹
        File file2=new File("G:/bbb/ccc/ddd");
        createDirs(file2);
    }
    public static void createDir(File file){
        file.mkdir();
    }
    public static void createDirs(File file){
        file.mkdirs();
    }
}
