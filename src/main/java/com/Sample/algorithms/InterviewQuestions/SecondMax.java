package com.Sample.algorithms.InterviewQuestions;

public class SecondMax {
    public static void main(String[] args){
      int[] arr = {10,12,11,2,3,5,1,9};
      printSecondMax(arr);
    }

    public static void printSecondMax(int[] arr){
        int max=0;
        int second_max=0;
        for(int i = 0; i < arr.length; i++) {
          max= Math.max(max,arr[i]);
        }

        int[] result = new int[arr.length-1];

        int idx=0;
        for(int i = 0; i < arr.length; i++) {
          if(arr[i]!=max){
              result[idx]=arr[i];
              idx++;
          }
        }

        for(int i = 0; i < result.length; i++) {
            second_max= Math.max(second_max,result[i]);
        }

        System.out.println(second_max);


    }
}
