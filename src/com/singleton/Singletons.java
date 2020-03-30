package com.singleton;

public class Singletons {
    private volatile static Singleton uniqueInstance;
    public Singletons(){

    }
    public static Singleton getUniqueInstance(){
        if(uniqueInstance==null){
            synchronized (Singletons.class){
                if(uniqueInstance==null){
                    uniqueInstance=new Singleton();
                }
            }
        }
            return uniqueInstance;
        }
}
