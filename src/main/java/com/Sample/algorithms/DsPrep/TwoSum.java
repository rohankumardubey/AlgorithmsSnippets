package com.Sample.algorithms.DsPrep;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args){
      // input : nums = [2,7,11,15] , target = 9
      // output : [0,1]
      System.out.println(Arrays.toString(twoSum(new int[]{ 11,2,7, 15}, 9)));

    }

    public static int[] twoSum(int[] array,int target){
        HashMap<Integer,Integer> reference = new HashMap<>();
        for(int i = 0; i < array.length; i++) {
          if(!reference.containsKey(target-array[i])){
              reference.put(array[i],i);
          } else {
              return new int[]{reference.get(target-array[i]),i};
          }
        }
        return new int[]{0,0};
    }
}
