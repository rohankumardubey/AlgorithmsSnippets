package com.Sample.algorithms.arrays;



public class MaxProfitSample {
    public static void main(String[] args){
        System.out.println(profit(new int[]{5,2,6,1,4}));
    }

    public static int profit(int[] array){
        int minsofar = array[0];
        int maxProfit = 0;
        for(int i = 0; i < array.length; i++) {
          minsofar = Math.min(array[i],minsofar);
          int profit = array[i]-minsofar;
          maxProfit = Math.max(profit,maxProfit);
        }
        return maxProfit;
    }
}
