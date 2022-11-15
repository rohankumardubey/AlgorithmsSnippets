package com.Sample.algorithms.ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class MimicConcurrentMapFunctions {
    public static void main(String[] args){

        ConcurrentHashMap<Integer,Integer> map = new ConcurrentHashMap<>();
        map.put(1,2);
        map.put(3,0);
        map.put(5,0);
        System.out.println(map);
        computeIfAbsent(3,4,map);
        System.out.println(map);
        putIfAbsent(5,6,map);
        System.out.println(map);


    }


     public static void computeIfAbsent(Integer key,Integer value,ConcurrentHashMap<Integer,Integer> map){
        Integer val = map.get(key);
        if(val==0){
            val=mappingFunction(key);
            if(val!=0){
                map.put(key,value);
            }
        }
    }

    public static void putIfAbsent(Integer key,Integer value,ConcurrentHashMap<Integer,Integer> map){
        Integer val = map.get(key);
        if(val==0){
            map.put(key,value);
        }
    }

    public static Integer mappingFunction(Integer val){
        return val*val;
    }
}
