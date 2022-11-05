package com.Sample.algorithms.GenericsExamples.GenericClass;

public class GenericClassUsage {
    public static void main(String[] args){
      //
        MyGenericClass<String,Number> generic = new MyGenericClass<>("sample",2);
        System.out.println(generic.getNumber());
        System.out.println(generic.getObject());
    }
}
