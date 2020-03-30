package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(33);
        list.add(11);
        list.add(77);
        list.add(55);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
