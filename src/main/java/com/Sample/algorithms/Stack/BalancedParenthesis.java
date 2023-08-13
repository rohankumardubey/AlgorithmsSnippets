package com.Sample.algorithms.Stack;

public class BalancedParenthesis {
    public static void main(String[] args){
        System.out.println(isValidParanthesis("[{(}]"));
    }
    public static boolean isValidParanthesis(String string){
        if(string.length()%2==1){
            return false;
        }
        StackImpl<Character> stack = new StackImpl<>(10);
        for(Character c:string.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    char top=stack.peek();
                    if((c==')' && top=='(' ) || (c==']' && top=='[') || (c=='}' && top=='{')){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
