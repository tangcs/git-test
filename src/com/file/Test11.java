package com.file;

import java.io.File;
import java.io.FileFilter;

public class Test11 {
    public static void main(String[] args) {
        File file=new File("G:/IDEA-workspace/exercise/src/com/file");
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.getName().endsWith(".java")){
                    return true;
                }else{
                    return false;
                }
            }
        });
        for (File file1 : files) {
            System.out.println(file1.getName());
        }
    }
}
