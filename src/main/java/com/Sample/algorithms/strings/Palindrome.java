package com.Sample.algorithms.strings;

public class Palindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("adama"));
        System.out.println(isPalindrome("maddam"));
    }

    public static boolean isPalindrome(String string){
        int start=0;
        int end= string.length()-1;
        while(start<=end){
            if(string.charAt(start)!=string.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
