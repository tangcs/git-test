package com.singleton;


public class Singleton {
    //方式一
    /*private Singleton(){}
    private static Singleton instance=new Singleton();
    public static Singleton getInstance(){
        return instance;
    }*/

    //方式二
    private static Singleton instance=null;
    public static synchronized Singleton getInstance(){
        if(instance==null)
            instance=new Singleton();
            return instance;

    }
}
