package com.Sample.algorithms.Misc;

public class MaxProfit {
    public static void main(String[] args){
      //
        int[] arr = {7,1,5,3,6,7};
        int maxNon = maxProfitNonOptimised(arr);
        int max = maxProfitOptimised(arr);
        System.out.println(max);
    }

    public static int maxProfitNonOptimised(int[] numbers){
        int maxProfit=0;
        for(int i = 0; i < numbers.length; i++) {
          //
            for(int j = i+1; j < numbers.length; j++) {
              //
                if(numbers[i]<numbers[j]){
                    maxProfit=Math.max(numbers[j]-numbers[i],maxProfit);
                }
            }
        }
        return maxProfit;
    }

    public static int maxProfitOptimised(int[] numbers){
        int minimal=999999;
        int profit=0;
        for(int i = 0; i < numbers.length; i++) {
          minimal=Math.min(numbers[i],minimal);
          profit=Math.max(profit,numbers[i]-minimal);
        }

        return profit;
    }
}
