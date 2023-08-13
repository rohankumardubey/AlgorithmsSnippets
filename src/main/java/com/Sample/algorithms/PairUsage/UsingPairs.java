package com.Sample.algorithms.PairUsage;

import javafx.util.Pair;

import java.util.ArrayList;

public class UsingPairs {
    public static void main(String[] args){
        ArrayList<Pair<String ,Integer>> arrayPair = new ArrayList<>();
        Pair<String,Integer> pair0 = new Pair<>("zero",0);
        Pair<String,Integer> pair1 = new Pair<>("one",1);
        Pair<String,Integer> pair2 = new Pair<>("two",2);
        Pair<String,Integer> pair3 = new Pair<>("three",3);
        Pair<String,Integer> pair4 = new Pair<>("four",4);

        arrayPair.add(pair0);
        arrayPair.add(pair1);
        arrayPair.add(pair2);
        arrayPair.add(pair3);
        arrayPair.add(pair4);

        System.out.println(arrayPair);
    }
}
