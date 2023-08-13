package com.Sample.algorithms.arrays;

public class MissingNumber {
    public static void main(String[] args){
      System.out.println(getMissingNumber(new int[]{2,4,1,8,6,3,7}));
    }
    public static int getMissingNumber(int[] array){
        int length = array.length+1;
        int sum = (length*(length+1))/2;
        for(int element:array){
            sum=sum-element;
        }
        return sum;
    }
}
