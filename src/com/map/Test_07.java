package com.map;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test_07 {
    public static void main(String[] args) {
        HashMap<Integer,String> m=new HashMap<>();
        m.put(1930, "乌拉圭");
        m.put(1934, "意大利");
        m.put(1938, "意大利");
        m.put(1950, "乌拉圭");
        m.put(1954, "西德");
        m.put(1958, "巴西");
        m.put(1962, "巴西");
        m.put(1966, "英格兰");
        m.put(1970, "巴西");
        m.put(1974, "西德");
        m.put(1978, "阿根廷");
        m.put(1982, "意大利");
        m.put(1986, "阿根廷");
        m.put(1990, "西德");
        m.put(1994, "巴西");
        m.put(1998, "法国");
        m.put(2002, "巴西");
        m.put(2006, "意大利");
        m.put(2010, "西班牙");
        m.put(2014, "德国");
        System.out.println("请输入年份！");
        Scanner sc=new Scanner(System.in);
        int year = sc.nextInt();
        if(m.containsKey(year)){
            System.out.println(year+"年获得冠军的是"+m.get(year)+"队");
        }else{
            System.out.println(year+"没有举办世界杯！");
        }

        System.out.println("请输入国家名！");
        Scanner g=new Scanner(System.in);
        String country = g.nextLine();
        if(m.containsValue(country)){
            Set<Integer> years = m.keySet();
            for (Integer y : years) {
                if(m.get(y).equals(country)){
                    System.out.println(y+"、\n");
                }
            }
        }else{
            System.out.println(country+"没有获得过世界杯冠军！");
        }
    }
}
