package com.Sample.algorithms.arrays;

public class MinValueInArray {
    public static void main(String[] args){
      System.out.println(finfMinimum(new int[]{5,3,4,8,1,2}));
    }

    public static int finfMinimum(int[] array){
        int min =Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {
          if(array[i]<min){
              min=array[i];
          }
        }
        return min;
    }
}
