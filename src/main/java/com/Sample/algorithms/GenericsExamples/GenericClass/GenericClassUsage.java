package com.Sample.algorithms.GenericsExamples.GenericClass;

public class GenericClassUsage {
    public static void main(String[] args){
      //
        MyGenericClass<String,Number> generic = new MyGenericClass<>("sample",2);
        MyGenericClass<String ,Double> genericSample = new MyGenericClass<>("a",2d);
        System.out.println(generic.getNumber());
        System.out.println(generic.getObject());
        System.out.println();
        System.out.println(genericSample.getNumber());
        System.out.println(genericSample.getObject());
    }
}
