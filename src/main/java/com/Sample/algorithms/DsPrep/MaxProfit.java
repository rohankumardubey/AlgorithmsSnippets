package com.Sample.algorithms.DsPrep;

public class MaxProfit {
    public static void main(String[] args){
      // input : price [7,1,5,3,6,4]
      // output : 5
      System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public static int maxProfit(int[] array){
        int maxProfit = 0;
        int minVal = array[0];
        for(int i = 0; i < array.length; i++) {
          minVal=Math.min(array[i],minVal);
          int profit = array[i] - minVal;
          maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}
