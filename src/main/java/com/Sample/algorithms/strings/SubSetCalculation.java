package com.Sample.algorithms.strings;

import java.util.Arrays;

public class SubSetCalculation {
    public static void main(String[] args){
        System.out.println(Arrays.toString(powerSet("abc")));
    }
    public static String[] powerSet(String string){
        if(string.length()==0){
            return new String[]{""};
        }

        String[] smallAns = powerSet(string.substring(1));
        String[] ans = new String[2*smallAns.length];
        int k=0;
        for(int i = 0; i < smallAns.length; i++) {
          ans[k]=string.charAt(0)+smallAns[i];
          k++;
        }

        for(int i = 0; i < smallAns.length; i++) {
          ans[k]=smallAns[i];
          k++;
        }
        return ans;
    }
}
