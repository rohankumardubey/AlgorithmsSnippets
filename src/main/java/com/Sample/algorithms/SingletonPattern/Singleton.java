package com.Sample.algorithms.SingletonPattern;

public class Singleton {

////  noob style
//    private static Singleton instance ;


//    public static Singleton getInstance(){
//        if(instance==null){
//            instance=new Singleton();
//        }
//        return instance;
//    }
//


    // pro style
    private volatile static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
    }

}
