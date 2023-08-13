package com.Sample.algorithms.arrays;

import java.util.Arrays;

public class ReveresArray {
    public static void main(String[] args){
        System.out.println(Arrays.toString(reverseArrayApproachOne(new int[]{1,2,3,4,5,6,7})));
        System.out.println(Arrays.toString(reverseArrayApproachTwo(new int[]{1,2,3,4,5,6,7,8,9})));
    }

    public static int[] reverseArrayApproachOne(int[] array){
        int pointer=(array.length%2==0) ?(array.length/2)-1:((array.length/2)) ;
        for(int i = 0; i <= pointer; i++) {
          int temp=array[i];
          array[i]=array[(array.length-1)-i];
          array[(array.length-1)-i]=temp;
        }
        return array;

    }

    public static int[] reverseArrayApproachTwo(int[] array){
        int leftpointer =0 ;
        int rightpointer = array.length-1;
        while(leftpointer<rightpointer){
            int temp = array[leftpointer];
            array[leftpointer]=array[rightpointer];
            array[rightpointer]=temp;
            leftpointer++;
            rightpointer--;
        }
        return array;
    }
}
