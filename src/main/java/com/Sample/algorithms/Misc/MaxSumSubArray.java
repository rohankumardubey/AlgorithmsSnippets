package com.Sample.algorithms.Misc;

public class MaxSumSubArray {
    public static void main(String[] args){
      //
        int[] array = {-2,-1};
        System.out.println(maxSum(array));
    }

    public static int maxSum(int[] array){
        int currentSum=0;
        int maxSum=0;
        int count=0;
        for(int i = 0; i < array.length; i++) {
          if(array[i]<0){
              count++;
          }
        }

        if(count!=array.length){

            for(int i = 0; i < array.length; i++) {
              currentSum=currentSum+array[i];
              if(currentSum>maxSum){
                  maxSum=currentSum;
              }

              if(currentSum<0){
                  currentSum=0;
              }

            }
        }else{
            maxSum=Integer.MIN_VALUE;
            for(int i = 0; i < array.length; i++) {
                maxSum=Math.max(maxSum,array[i]);
            }
        }

        return maxSum;
    }
}
