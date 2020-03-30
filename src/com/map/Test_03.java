package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test_03 {
    public static void main(String[] args) {
        HashMap<Car,Integer> hashMap=new HashMap<>();
        hashMap.put(new Car("奔驰","黑色"),300000);
        hashMap.put(new Car("宝马x5","黑色"),350000);
        hashMap.put(new Car("奥迪Q5","黑色"),330000);
        hashMap.put(new Car("Jeep","黑色"),250000);
        hashMap.put(new Car("比亚迪","红色"),300000);
        System.out.println(hashMap);
        Set<Car> cars = hashMap.keySet();
        for (Car car : cars) {
            Integer price = hashMap.get(car);
            System.out.println(car+"价格:"+price);
        }
        System.out.println("=================");
        Set<Map.Entry<Car, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<Car, Integer> entry : entries) {
            System.out.println(entry);
        }
    }
}
