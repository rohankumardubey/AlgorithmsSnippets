package com.Sample.algorithms.ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class ComputeIfAbsentMap {
    public static void main(String[] args){
      //
        ConcurrentHashMap<Integer,Integer> map = new ConcurrentHashMap<>();
        map.putIfAbsent(1,1);
        map.putIfAbsent(2,2);
        map.putIfAbsent(3,3);

        System.out.println(map);

        map.computeIfAbsent(6, k->7);
        System.out.println(map);
    }
}
