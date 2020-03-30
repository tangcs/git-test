package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test_04 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry);
        }
        map.put(5,"李晓红");
        map.remove(1);
        map.put(2,"周林");
        System.out.println(map.get(2));
        System.out.println(map);
    }
}
