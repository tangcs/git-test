package com.map;

import java.util.HashMap;
import java.util.Map;

public class Test_01 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("河南","郑州");
        map.put("广东","广州州");
        map.put("浙江","杭州");
        map.put("湖北","武汉");
        System.out.println(map);
        System.out.println(map.get("河南"));
        System.out.println(map.remove("湖北"));
        System.out.println(map);
    }
}
