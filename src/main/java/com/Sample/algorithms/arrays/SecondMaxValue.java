package com.Sample.algorithms.arrays;

public class SecondMaxValue {
    public static void main(String[] args){
//      System.out.println(secondMaxValue(new int[]{12,34,2,34,33,1}));
      secondMaxValueApproachOne(new int[]{13,12,34,2,34,33,1});
      System.out.println(secondMaxValueApproachTwo(new int[]{13,12,34,2,34,33,1}));
    }

    public static int secondMaxValueApproachOne(int[] array){
        int max= Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++) {
          if(max<array[i]){
              max=array[i];
          }
        }

        for(int i = 0; i < array.length; i++) {
          if(secondMax<array[i] && array[i]!=max){
              secondMax=array[i];

          }
        }
        return secondMax;
    }

    public static int secondMaxValueApproachTwo(int[] array){
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++) {
          if(array[i]>max){
              secondmax=max;
              max=array[i];
          }
          else if(array[i]>secondmax && array[i]!=max){
              secondmax=array[i];
          }
        }
        return secondmax;
    }
}
