package com.Sample.algorithms.GenericsExamples.GenericMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class MyGenericMethod {
    public <T extends Object> T countVal(List<T> list, T element){
        T val;
        for(T ele:list){
            //to find the string element
            if(ele instanceof String){
                if(ele.equals(element)){
                    System.out.println("element found!");
                    val=ele;
                    return val;
                }
            }
            //to find the numerical element
            if(ele==element){
                System.out.println("element found");
                val=ele;
                return val;
            }
        }
        return null;
    }

    public <T extends Object,V extends Object> V findValue(HashMap<T,V> map,V element){
        Set<T> tempSet =map.keySet();
        for(T ele:tempSet){
            if(ele instanceof String){
                if(map.get(ele).equals(element)){
                    return map.get(ele);
                }
            }else{
                if(map.get(ele)==element){
                    return map.get(ele);
                }
            }
        }
        return null;

    }

}
