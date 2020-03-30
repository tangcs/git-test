package com.file;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sumPeach(n);
        System.out.println("共摘了"+sum+"个桃子！");

    }
    public static int sumPeach(int n){
        if(n==10){
            return 1;
        }else{
            //递归计算前一天的数量
            return 2*sumPeach(n+1)+2;
        }
    }

}
