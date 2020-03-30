package com.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo01 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("二丫");
        list.add("钱六");
        list.add("孙七");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if("二丫".equals(name)){
                list.set(i,"王二丫");
            }
        }
        System.out.println(list);
    }
}
