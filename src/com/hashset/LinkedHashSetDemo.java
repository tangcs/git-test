package com.hashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
* linkedHahsSet 元素不允许重复
* */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> l_hashSet=new LinkedHashSet<>();
        l_hashSet.add("王昭君");
        l_hashSet.add("王昭君");
        l_hashSet.add("王昭君");
        l_hashSet.add("西施");
        l_hashSet.add("貂蝉");
        Iterator<String> iterator = l_hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        /*
        增强for循环
        * */
        for (String name : l_hashSet) {
            System.out.println(name);
        }
    }
}
