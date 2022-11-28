package com.Sample.algorithms.InterviewQuestions;

import java.util.HashMap;
import java.util.List;

public class frequency {
    public static void main(String[] args){
        List<Character> characters = List.of('a','b','c','d','a','b','c','a','b');
        HashMap<Character,Integer> result = new HashMap<>();
        for(Character chars:characters){
            if(!result.containsKey(chars)){
                result.put(chars,1);
            }else{
                result.put(chars,result.get(chars)+1);
            }
        }
        System.out.println(result);
    }
}
