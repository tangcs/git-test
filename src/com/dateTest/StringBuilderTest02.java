package com.dateTest;

public class StringBuilderTest02 {
    public static void main(String[] args) {
        //定义数字字符串数组
        String[] str = {"010","3223","666","7890987","123123"};
        SBTest(str);

    }
    public static void SBTest(String[] str){
        int count=0;
        for (String s : str) {
            StringBuilder sb=new StringBuilder(s);
            //调用reverse()方法，将遍历的数字进行反转，然后用equals()方法对比是否与原数字相同
            if(sb.reverse().toString().equals(s)){
                count++;
                System.out.println(s+"是对称的！");
            }
        }
        System.out.println("总数为:"+count);
    }
}
