package com.Sample.algorithms.Stack;

public class StackUsage {

    public static void main(String[] args){
        StackImpl<Character> stack = new StackImpl(10);
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        stack.print();
        System.out.println();
        stack.pop();
        stack.print();
        System.out.println();
        System.out.println(stack.length());


    }
}
