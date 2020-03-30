package com.file;

import java.io.File;

public class Test06 {
    public static void main(String[] args) {
        File f1=new File("G:/Solr/solr-5.3.1/README.txt");
        if(f1.isFile()){
            System.out.println("f1是一个文件");
        }else{
            System.out.println("f1是一个文件夹");
        }

        File f2=new File("G:/Solr");
        if(f2.isDirectory()){
            System.out.println("f2是一个文件夹");
        }else{
            System.out.println("f2是一个文件");
        }
    }
}
