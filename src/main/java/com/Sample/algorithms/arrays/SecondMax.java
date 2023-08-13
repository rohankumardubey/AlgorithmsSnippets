package com.Sample.algorithms.arrays;

public class SecondMax {
    public static void main(String[] args){

        System.out.println(secondHighest(new int[]{5,1,6}));
    }

    public static int secondHighest(int[] array){
        int secondMax = Integer.MIN_VALUE;
        int maxElement  = Integer.MIN_VALUE;
        int firstMax = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++) {
            firstMax = Math.max(array[i],maxElement);
        }

        for(int i = 0; i < array.length; i++) {
            if(array[i]!=firstMax){
                secondMax = Math.max(array[i],secondMax);
            }
        }
        return secondMax;

    }

}
