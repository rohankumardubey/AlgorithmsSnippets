package com.Sample.algorithms.arrays;

import java.util.ArrayList;

public class ArrayListUsage {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("hi");
        array.add("hi");
        array.add("hi");
        array.add("hi");
        array.add("hi");
        array.add("hi");
        int oldCapacity = array.size();
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        int newCapacity1 = newCapacity + (newCapacity >> 1);
        System.out.println(oldCapacity);
        System.out.println(newCapacity);
        System.out.println(newCapacity1);
    }



}
