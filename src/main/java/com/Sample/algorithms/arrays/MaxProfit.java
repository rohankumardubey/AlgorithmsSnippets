package com.Sample.algorithms.arrays;

public class MaxProfit {
    public static void main(String[] args){
      System.out.println(getMaxProfit(new int[]{5,2,6,1,4}));
    }

    public static int getMaxProfit(int[] array){
        int maxProfit=0;
        int minSoFar = array[0];
        for(int i = 0; i < array.length; i++) {
          minSoFar = Math.min(minSoFar,array[i]);
          int profit=array[i]-minSoFar;
          maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}
