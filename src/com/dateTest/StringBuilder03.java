package com.dateTest;

public class StringBuilder03 {
    public static void main(String[] args) {
        sbTest();
    }

    public static void sbTest(){
        String s="789";
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for(int j=0;j<s.length();j++){
                sb.append(s.charAt(j));
            }
            if(i!=2){
                sb.append(" ");
            }
            s=s.substring(1).concat(s.substring(0,1));
        }
        s=sb.toString()+" "+sb.reverse().toString();
        System.out.println(s);

    }
}
