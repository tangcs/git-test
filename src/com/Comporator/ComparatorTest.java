package com.Comporator;

public class ComparatorTest {
    public static void main(String[] args) {
        Student stu[]={new Student("liusan",20,90.0f),
                new Student("lisi",22,90.0f),
                new Student("wangwu",20,99.0f),
                new Student("sunliu",22,100.0f)};
        java.util.Arrays.sort(stu,new StudentComparator());
        for(Student s:stu) {
            System.out.println(s);
        }
    }
}

