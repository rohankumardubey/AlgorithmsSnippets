package com.Sample.algorithms.arrays;

public class Palendrome {
  public static void main(String[] args) {
    System.out.println(isPalindrome(1221));
  }

  public static boolean isPalindrome(int x) {
    double pow = Math.pow(x,2);
    if ((pow/x) <= 0) {
      return false;
    }
    String str = String.valueOf(x);
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
        return false;
      }
    }
    return true;
  }
}
