package com.dateTest;

public class StringBuilder04 {
    public static void main(String[] args) {
        subTest();
    }
    public static void subTest(){
        String str="123456";
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < 6; i++) {
            for(int j=0;j<str.length();j++){
                sb.append(str.charAt(j));
            }
            if(i!=5){
                sb.append(" ");
            }
            str=str.substring(1).concat(str.substring(0,1));
        }
        str=sb.toString()+" "+sb.reverse().toString();
        System.out.println(str);
    }
}
