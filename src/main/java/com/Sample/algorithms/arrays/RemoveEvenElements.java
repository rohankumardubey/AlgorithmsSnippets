package com.Sample.algorithms.arrays;

import java.util.Arrays;

public class RemoveEvenElements {
    public static void main(String[] args){
      System.out.println(Arrays.toString(removeElements(new int[]{3,2,4,7,10,6,5})));
    }

    public static int[] removeElements(int[] arr){
        int counter=0;
        for(int i = 0; i < arr.length; i++) {
          if(arr[i]%2!=0){
              counter++;
          }
        }

        int[] array = new int[counter];
        int doubleCounter =0;
        for(int i = 0; i < arr.length; i++) {
          if(arr[i]%2!=0){
              array[doubleCounter]=arr[i];
              doubleCounter++;
          }
        }
        return array;
    }
}
