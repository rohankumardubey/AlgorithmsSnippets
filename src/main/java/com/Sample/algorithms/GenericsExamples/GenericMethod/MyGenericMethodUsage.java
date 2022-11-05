package com.Sample.algorithms.GenericsExamples.GenericMethod;

import java.util.ArrayList;
import java.util.Arrays;

public class MyGenericMethodUsage {
    public static void main(String[] args){
        //

        MyGenericMethod generic = new MyGenericMethod();
        Integer element =generic.countVal(new ArrayList<Integer>(Arrays.asList(1,2,3,4)),2);
        String str =generic.countVal(new ArrayList<String>(Arrays.asList("a","b","c")),"c");
        System.out.println(element);
        System.out.println(str);
    }
}
