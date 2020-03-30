package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Test_02 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("河南","郑州");
        hashMap.put("广东","广州");
        hashMap.put("浙江","杭州");
        hashMap.put("江苏","南京");
        hashMap.put("湖北","武汉");
        Collection<String> values = hashMap.values();
        System.out.println(values);
        for (String value : values) {
            System.out.println(value);
        }
        System.out.println("==================");
        Iterator<String> iterator = values.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
