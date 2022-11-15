package com.Sample.algorithms.Combinations;

import java.util.ArrayList;
import java.util.List;

public class MatrixDiagonal {
    public static void main(String[] args){
      //
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};


        int pivot = matrix.length;
        System.out.println(findSum(matrix,pivot));
    }

    public static int findSum(int[][] matrix,int index){
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int s1 = 0,s2=0,s3=0,s4=0,s5=0;
        for(int i = 0; i < matrix.length; i++) {
          for(int j = 0; j < matrix[0].length; j++) {
            if(i==j){
                list1.add(matrix[i][j]);
            }
          }
        }

        for(int i = 0; i < matrix.length; i++) {
          for(int j = matrix[0].length-1; j >= 0; j--) {
            if(i+j==matrix[0].length-1){
                list2.add(matrix[i][j]);
            }
          }
        }

        if(index%2==0){
            s5=0;
            for(int i = 0; i < (int)index/2; i++) {
              s1=s1+list1.get(i);
            }

            for(int i = index/2+1; i < matrix.length; i++) {
                s2=s2+list1.get(i);
            }

            for(int i = 0; i < (int)index/2; i++) {
                s3=s3+list2.get(i);
            }

            for(int i = index/2+1; i < matrix.length; i++) {
                s4=s4+list2.get(i);
            }
        }
        else{
            s5=matrix[(index-1)%2][(index-1)%2];
            for(int i = 0; i < (index-1)%2; i++) {
                s1=s1+list1.get(i);
            }

            for(int i = ((index-1)%2)+1; i < matrix.length; i++) {
                s2=s2+list1.get(i);
            }

            for(int i = 0; i < (index-1)%2; i++) {
                s3=s3+list2.get(i);
            }

            for(int i = ((index-1)%2)+1; i < matrix.length; i++) {
                s4=s4+list2.get(i);
            }

        }

        int sum1 = s1+s2+s5;
        int sum2 = s2+s4+s5;
        int sum3 = s4+s5+s3;
        int sum4 = s3+s5+s1;
        int sum5 = s1+s5+s4;
        int sum6 = s2+s5+s3;


        List<Integer> list = new ArrayList<>(List.of(sum1,sum2,sum3,sum4,sum5,sum6));
        int max=0;
        for(int i = 0; i < list.size(); i++) {
          max=Math.max(max,list.get(i));
        }
        return max;
    }
}
