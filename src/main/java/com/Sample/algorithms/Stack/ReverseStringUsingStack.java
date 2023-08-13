package com.Sample.algorithms.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args){
        System.out.println(reverseString("whatis"));
    }

    public static String reverseString(String string){
        StackImpl<Character> stack = new StackImpl<>(string.length());
        StackImpl<Character> newStack = new StackImpl<>(string.length());
        for(int i = 0; i < string.length(); i++) {
          stack.push(string.charAt(i));
        }

        for(int i = 0; i < string.length(); i++) {
          newStack.push(stack.pop());
        }

        Object[] array = newStack.toArray();
        return arrayToStringConvert(array);

    }

    public static String arrayToStringConvert(Object[] obj){
        if (obj == null)
            return "null";

        int max = obj.length;
        if (max == 0)
            return "";

        StringBuilder b = new StringBuilder();
        for (int i = 0;i<max ; i++) {
            b.append(obj[i]);
        }
        return b.toString();
    }
}
