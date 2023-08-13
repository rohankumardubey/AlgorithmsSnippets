package com.Sample.algorithms.Misc;




//Implement the methods:
//        void add(int number)Integer getFirstUnique
//        Such that:
//        The add methods appends the number argument to the
//        numbers arrayThe
//        getFirstUnqiue method
//        returns the first distinct numeric value that was added to the array
//        If there is no distinct value then return -1

//// EXAMPLE 1
//firstUniqueImpl.add(2);
//        firstUniqueImpl.add(9);
//        firstUniqueImpl.add(9);
//        firstUniqueImpl.add(2);
//        firstUniqueImpl.add(3);
//        firstUnqiue.getFirstUnique() => 3
//
//
//// EXAMPLE 2
//        firstUniqueImpl.add(4);
//        firstUniqueImpl.add(4);
//        firstUniqueImpl.add(4);
//        firstUniqueImpl.add(4);
//        firstUnqiue.getFirstUnique() => -1

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class UniqueSequence {
    public static void main(String[] args){
        ArrayList<Integer> sample = new ArrayList<>();


    }

    public void add(int number,ArrayList<Integer> array){
        if(array.size()!=0){
            LinkedHashMap<Integer,Integer> map= new LinkedHashMap<>();
            LinkedHashSet<Integer> set = new LinkedHashSet<>();
//            for(int i = 0; i < array.size(); i++) {
//                if(map.containsKey(array.get(i))){
//                    map.put(array.get(i),map.get(i)+1);
//                }
//                else{
//                    map.put(array.get(i),1);
//                }
//            }

            if(!map.containsKey(number)){
                map.put(number,1);
                set.add(number);
            }
            else {
                map.put(number,map.get(number)+1);
                set.remove(number);
            }

        }
        array.add(number);
    }

    public int getUnique(ArrayList<Integer> array){

        return -1;
    }


}
