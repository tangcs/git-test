package com.linklist;

import java.util.LinkedList;
/*
* 特有方法
* addFirst addlast getFirst getLast removeFirst removeFirst push pop clear
* */
public class LinkDemo02 {
    public static void main(String[] args) {
        LinkedList<String> l_list=new LinkedList<>();
        l_list.add("云澈");
        l_list.add("大音音");
        l_list.add("千影");
        l_list.add("倾月");
        l_list.add("媚音");
        System.out.println(l_list);
        l_list.addFirst("Tom");
        l_list.addLast("Jack");
        System.out.println(l_list);
        System.out.println(l_list.getFirst());
        System.out.println(l_list.getLast());
        l_list.removeFirst();
        l_list.removeLast();
        System.out.println(l_list);
        System.out.println(l_list.pop());
        l_list.push("小妖后");
        System.out.println(l_list);
        l_list.clear();
        System.out.println(l_list);
    }
}
