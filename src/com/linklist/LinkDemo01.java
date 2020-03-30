package com.linklist;

import java.util.Iterator;
import java.util.LinkedList;
/*
* 普通方法
* add set get size  clear
* 遍历一般使用Iterator
* */
public class LinkDemo01 {
    public static void main(String[] args) {
        LinkedList<String> l_list=new LinkedList<>();
        l_list.add("张三");
        l_list.add("李四");
        l_list.add("王五");
        l_list.add("赵六");
        l_list.add("钱七");
        System.out.println(l_list);
        l_list.set(1,"大音音");
        String s1 = l_list.get(1);
        System.out.println(s1);
        System.out.println(l_list.size());
        Iterator<String> iterator = l_list.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        l_list.clear();
        System.out.println(l_list);
    }
}
