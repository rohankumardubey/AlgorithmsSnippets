package com.Sample.algorithms.CurryingUsage;

import java.util.function.Function;

public class CurryingSample {
    public static void main(String[] args){
      //double level currying
      Function<Integer,Function<Integer,Integer>> doubleLevelCurryingVariable = u -> v-> u*v;

      //triple level currying
      Function<Integer,Function<Integer,Function<Integer,Integer>>>   tripleLevelCurryingVariable = u -> v -> w -> u*v*w;

      System.out.println("multiplication using double level currying "+doubleLevelCurryingVariable.apply(4).apply(5));
      System.out.println("multiplication using triplr level currying "+tripleLevelCurryingVariable.apply(4).apply(5).apply(6));
    }
}
