package com.linklist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
//"12345","67891","12347809933","98765432102","67891","12347809933"
public class linkListDemo03 {
    public static void main(String[] args) {
        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        List<String> l_list=new LinkedList<String>();
        for (String str : strs) {
            if(!l_list.contains(str)){
                l_list.add(str);
            }
        }

        //使用迭代器遍历
        Iterator<String> iterator = l_list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("===========================");

        //使用增强for循环遍历
        for (String str : l_list) {
            System.out.println(str);
        }

    }
}
