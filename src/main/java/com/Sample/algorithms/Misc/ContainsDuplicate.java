package com.Sample.algorithms.Misc;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args){
      //
        int[] nums= {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] array){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < array.length; i++) {
          //
            set.add(array[i]);
        }

        if(set.size()!=array.length){
            return false;
        }
        return true;
    }
}
