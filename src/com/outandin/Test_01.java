package com.outandin;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test_01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream out=new FileOutputStream("G:/g.txt",true);
        String content="I love java \r\n";
        for (int i = 0; i < 5; i++) {
            out.write(content.getBytes());
        }
        //关闭资源
        out.close();
    }
}
