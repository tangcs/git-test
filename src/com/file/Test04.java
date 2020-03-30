package com.file;

import java.io.File;

public class Test04 {
    public static void main(String[] args) {
        //删除文件
        File file1=new File("G:/mini.txt");
        file1.delete();
        File dir1=new File("G:/2345Downloads");
        dir1.delete();
    }
}
