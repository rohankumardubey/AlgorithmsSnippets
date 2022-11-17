package com.Sample.algorithms.CloneSingleton;

public class SingletonSample implements Cloneable{
    private static volatile SingletonSample instance;

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static SingletonSample getInstance(){
        if(instance==null){
            synchronized (SingletonSample.class){
                if(instance==null)
                    instance=new SingletonSample();
            }
        }
        return instance;
    }

}
