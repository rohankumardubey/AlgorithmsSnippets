package com.Sample.algorithms.InterviewQuestions;

public class RemoveEven {
    public static void main(String[] args){

        int[] arr = {3,4,5,6,7,8,9};
        printArray(arr);
        int[] result =removeEven(arr);
        printArray(result);
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }

    public static int[] removeEven(int[] arr){
        int oddCount =0;

        for(int i = 0; i < arr.length; i++) {
          if(arr[i]%2!=0){
              oddCount++;
          }
        }

        int idx=0;
        int[] result = new int[oddCount];
        for(int i = 0; i < arr.length; i++) {
          if(arr[i]%2!=0){
              result[idx]=arr[i];
              idx++;
          }
        }
        return result;
    }
}
