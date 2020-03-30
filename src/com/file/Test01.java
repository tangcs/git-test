package com.file;

import java.io.File;

public class Test01 {
    public static void main(String[] args) {
        //1.创建文件对象，绝对路径
        File file1=new File("G:/file/1.txt");
        //2.创建文件对象，相对路径
        File file2=new File("2.txt");
    }
}
