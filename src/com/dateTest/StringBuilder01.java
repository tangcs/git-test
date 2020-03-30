package com.dateTest;

public class StringBuilder01 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        //testString();
        testStringBuilder();
        long end = System.currentTimeMillis();
        System.out.println("所花费的时间为:"+(end-start));

    }

    public static void testString(){
        String str="hello";
        for (int i = 0; i < 100000; i++) {
            str+="world";
        }
    }

    public static void testStringBuilder(){
        StringBuilder sb=new StringBuilder("hello");
        for (int i = 0; i < 100000; i++) {
            sb.append("world");
        }
        String newStr = sb.toString();
    }
}
