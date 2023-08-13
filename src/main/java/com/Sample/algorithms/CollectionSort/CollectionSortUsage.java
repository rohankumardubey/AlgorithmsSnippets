package com.Sample.algorithms.CollectionSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionSortUsage {
    public static void main(String[] args){
      //
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,11,12,13,6,1,2,3,4,5));
        Collections.sort(list);
        System.out.println("ascending order: "+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("descending order : "+list);

    }
}
