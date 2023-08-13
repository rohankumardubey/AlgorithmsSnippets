package com.Sample.algorithms.arrays;

import java.util.Arrays;

public class ResizeArray {
    public static void main(String[] args){
        System.out.println(Arrays.toString(resize(new int[]{1,2,3,4},8)));
    }
    public static int[] resize(int[] array, int capacity){
        int[] temp = new int[capacity];
        for(int i = 0; i < array.length; i++) {
          temp[i]=array[i];
        }
        return temp;
    }
}
