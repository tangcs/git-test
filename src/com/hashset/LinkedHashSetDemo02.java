package com.hashset;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSetDemo02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        LinkedHashSet<Character> chs=new LinkedHashSet<Character>();
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            chs.add(ch);
        }
        System.out.println(chs);
    }
}
