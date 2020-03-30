package com.hashset;

import com.domain.Person;

import java.util.HashSet;

public class HashSetDemo01 {
    public static void main(String[] args) {
        HashSet<Person> h_set=new HashSet<>();
        h_set.add(new Person("张三",20));
        h_set.add(new Person("李四",21));
        h_set.add(new Person("王五",22));
        h_set.add(new Person("张三",20));
        h_set.add(new Person("李四",21));
        for (Person p : h_set) {
            System.out.println(p);
        }
    }
}
