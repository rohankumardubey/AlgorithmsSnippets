package com.Sample.algorithms.arrays;

public class DynamicArrayUsage {
    public static void main(String[] args) {
        DynamicArray darray = new DynamicArray();
        darray.add("a");
        darray.add("d");
        darray.add("c");
        darray.add("b");
        darray.add("e");
        System.out.println(darray.toString());
        System.out.println(darray.isEmpty());
        System.out.println(darray.capacity);
        System.out.println(darray.size);
        darray.insert(9,"h");
        System.out.println(darray);
        darray.delete("b");
        darray.delete("a");
        System.out.println(darray);
    }
}
