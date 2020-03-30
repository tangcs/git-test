package com.file;

import java.io.File;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        File file=new File("G:/a.txt");
        if(file.exists()){
            System.out.println(true);

        }else{
            file.createNewFile();
        }
    }
}
