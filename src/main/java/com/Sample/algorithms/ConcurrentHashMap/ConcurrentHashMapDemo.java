package com.Sample.algorithms.ConcurrentHashMap;

import java.util.concurrent.*;

class ConcurrentHashMapDemo {

    public static void main(String[] args)
    {
        // create an instance of
        // ConcurrentHashMap
        ConcurrentHashMap<Integer, String> map
                = new ConcurrentHashMap<>();

        map.put(1,"hi");
        map.put(2,"hii");
        map.put(3,"hiii");

        map.putIfAbsent(4,"hiiii");
        System.out.println(map);
    }
}