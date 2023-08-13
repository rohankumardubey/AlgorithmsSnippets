package com.Sample.algorithms.Misc;

public class ReverseFloat {
    public static void main(String[] args){
        reverseFloat((float) 132.45);
    }

    public static void reverseFloat(float number){
        String[] splitter = String.valueOf(number).split("\\.");
        StringBuilder builder = new StringBuilder();
        builder.append(reverse(Integer.parseInt(splitter[1])));
        builder.append(".");
        builder.append(reverse(Integer.parseInt(splitter[0])));
        System.out.println(Float.parseFloat(builder.toString()));
    }

    public static int reverse(int number){
        int rev=0;
        while(number>0){
            rev=rev*10+number%10;
            number=number/10;
        }
        return rev;
    }
}
