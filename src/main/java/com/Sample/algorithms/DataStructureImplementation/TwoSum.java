package com.Sample.algorithms.DataStructureImplementation;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] arr,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
          int num = arr[i];
          int diff = target-num;
          if(map.containsKey(diff)){
              return new int[]{map.get(diff),i};
          }
          map.put(num,i);
        }

        return new int[]{};
    }
    public static void main(String[] args){
      //
        int[] arr = new int[]{0,2,4,3};
        int[] index=twoSum(arr,5);
        System.out.println(Arrays.toString(index));
    }
}
