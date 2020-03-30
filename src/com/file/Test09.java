package com.file;

import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int sum = getSum(n);
        System.out.println("第"+n+"天有"+sum+"只兔子！");

    }
    public static int getSum(int n){
        if(n==1 || n==2){
            return n=1;
        }else{
            return getSum(n-1)+getSum(n-2);
        }
    }
}
