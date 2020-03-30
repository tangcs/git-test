package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test_06 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("abc");
        list.add("bcd");
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (String s : list) {
            char[] chars = s.toCharArray();
            for (char ch : chars) {
                Integer num = hashMap.get(ch);
                if(num==null){
                    hashMap.put(ch,1);
                }else {
                    hashMap.put(ch,num+1);
                }
            }
        }
        System.out.println(hashMap);
    }
}
