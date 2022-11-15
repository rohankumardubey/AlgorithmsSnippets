package com.Sample.algorithms.CloneSingleton;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
      //

        SingletonSample instance1 = SingletonSample.getInstance();
        SingletonSample instance2 = (SingletonSample) instance1.clone();
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
