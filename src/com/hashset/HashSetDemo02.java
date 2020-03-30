package com.hashset;

import java.util.HashSet;
import java.util.Random;

public class HashSetDemo02 {
    public static void main(String[] args) {
        HashSet<Integer> h_set=new HashSet<>();
        Random rn=new Random();
        //6个红色球
        while (h_set.size()<6){
            int num1=rn.nextInt(33)+1;
            h_set.add(num1);
        }
        //1个蓝色球
        int blueball=rn.nextInt(16)+1;
        System.out.println("中奖编号是：");
        System.out.println("红球:");
        for (Integer num : h_set) {
            System.out.print(num+" ");
        }
        System.out.println("篮球是:");
        System.out.println(blueball);
    }
}
