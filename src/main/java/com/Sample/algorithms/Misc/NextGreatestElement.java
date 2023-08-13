package com.Sample.algorithms.Misc;

import java.util.Arrays;
import java.util.Stack;

public class NextGreatestElement {
    public static void main(String[] args){
      //

        int[] elements = {13 , 7, 6 , 12 };
        NextGreaterElementNonOptimized(elements);
        NextGreaterElementOptimized(elements);

    }

    public static void NextGreaterElementNonOptimized(int[] elements){
        int[] sample = new int[elements.length];
        int next;
        for(int i = 0; i < elements.length; i++) {
            next=-1;
          for(int j = i+1; j < elements.length; j++) {
            if(elements[i]<elements[j]){
                next=elements[j];
                sample[i]=next;
                break;
            }
          }
          sample[i]=next;
        }
        System.out.println(Arrays.toString(sample));
    }

    public static void NextGreaterElementOptimized(int[] elements){
        Stack<Integer> stack = new Stack<>();
        int[] sample = new int[elements.length];
        for(int i = elements.length-1; i >=0; i--) {
            while(!stack.empty()&&elements[i]>=stack.peek()){
                stack.pop();
            }
            if(stack.empty()==false){
                sample[i]=stack.peek();
            }
            else{
                sample[i]=-1;
            }
            stack.push(elements[i]);
        }
        System.out.println(Arrays.toString(sample));
    }
}
