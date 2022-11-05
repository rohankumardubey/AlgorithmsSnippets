package com.Sample.algorithms.GenericsExamples.GenericMethod;

import java.util.List;

public class MyGenericMethod {

    public <T> T countVal(List<T> list,T element){
        T val;
        for(T ele:list){
            if(ele instanceof String){
                if(ele.equals(element)){
                    System.out.println("element found!");
                    val=ele;
                    return val;
                }
            }
            if(ele==element){
                System.out.println("element found");
                val=ele;
                return val;
            }
        }
        return null;
    }

}
