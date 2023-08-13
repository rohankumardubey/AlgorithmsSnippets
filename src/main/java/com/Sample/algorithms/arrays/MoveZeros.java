package com.Sample.algorithms.arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args){
      System.out.println(Arrays.toString(moveZerosApproachOne(new int[]{0,1,0,4,12})));
      System.out.println(Arrays.toString(moveZerosApproachTwo(new int[]{0,1,0,4,12})));
    }

    public static int[] moveZerosApproachOne(int[] array){
        int zeroCounter =0;
        int valueCounter = 0;
        for(int i = 0; i < array.length; i++) {
          if(array[i]==0){
              zeroCounter++;
          }
          else{
              array[valueCounter]=array[i];
              valueCounter++;
          }
        }

        for(int i = (array.length-zeroCounter); i <array.length; i++) {
          array[i]=0;
        }
        return array;
    }

    public static int[] moveZerosApproachTwo(int[] array){
        int j=0;
        for(int i = 0; i < array.length; i++) {
          if(array[i]!=0 && array[j]==0){
              int temp = array[i];
              array[i]=array[j];
              array[j]=temp;
          }
          if(array[j]!=0){
              j++;
          }
        }
        return array;
    }
}
