package com.Comporable;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private float score;

    public Student(String name, int age, float score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.score>o.score){
            //由高到底排序
            return -1;
        }else if(this.score<o.score) {
            return 1;
        }else{
            if(this.age>o.age) {
                //由底到高排序
                return 1;
            }else if(this.age<o.age) {
                return -1;
            }else {
                return 0;
            }
        }

    }
}
