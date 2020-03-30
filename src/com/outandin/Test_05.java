package com.outandin;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Test_05 {
    public static void main(String[] args) throws FileNotFoundException {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一行字符串：");
        // 接收用户输入的数据
        String line = sc.nextLine();
        // 创建字节打印流对象
        PrintStream ps = new PrintStream("d.txt");
        // 将字符串写出到文件中
        ps.println(line);
        // 关流
        ps.close();

    }
}
