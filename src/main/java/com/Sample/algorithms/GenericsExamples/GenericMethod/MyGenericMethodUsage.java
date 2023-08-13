package com.Sample.algorithms.GenericsExamples.GenericMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MyGenericMethodUsage {
    public static void main(String[] args){
        //

        MyGenericMethod generic = new MyGenericMethod();
        Integer element =generic.countVal(new ArrayList<>(Arrays.asList(1, 2, 3, 4)),2);
        String str =generic.countVal(new ArrayList<>(Arrays.asList("a", "b", "c")),"c");
        System.out.println(element);
        System.out.println(str);

        System.out.println();
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"sample");
        map.put(2,"sample2");
        map.put(3,"sample3");
        String findElement = generic.findValue(map,"sample");
        System.out.println(findElement);


    }
}
