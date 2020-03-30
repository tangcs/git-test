package com.outandin;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test_04 {
    public static void main(String[] args) throws IOException {
        FileWriter fos=new FileWriter("G:/h.txt");
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入内容！");
            String stent = sc.nextLine();
            if("8868".equals(stent)){
                break;
            }
            fos.write(stent);
            fos.write(System.lineSeparator());
        }
        //关闭资源
        fos.close();
    }
}
