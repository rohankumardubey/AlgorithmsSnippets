package com.Sample.algorithms.GenericsExamples.GenericClass;

public class MyGenericClass<T extends String,V extends Number> {
    T t;
    V v;
    MyGenericClass(T t,V v){
        this.t=t;
        this.v=v;
    }

    void setNumber(T t){
        this.t=t;
    }

    void setObject(V v){
        this.v=v;
    }

    V getNumber(){
        return this.v;
    }

    T getObject(){
        return this.t;
    }

}
