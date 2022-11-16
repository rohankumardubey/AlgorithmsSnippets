package com.Sample.algorithms.CloneSingleton;

public class SingletonSample extends cloning{
    private static volatile SingletonSample instance;

    //this is to prevent from cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
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
