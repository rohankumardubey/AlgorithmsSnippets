package com.Sample.algorithms.Misc;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoSumEnhanced {
    public static void main(String[] args){
        int Max_Length=10;
        ArrayList<Integer> array = new ArrayList<>();
        //inititalizing the array
        for(int pointer=0;pointer<Max_Length;pointer++){
            array.add(0);
        }

        TwoSum sum = new TwoSum(array);
        sum.store(1);
        sum.store(2);
        sum.store(3);
        sum.store(4);
        sum.store(5);

        System.out.println(sum.test(9));


    }
}

class TwoSum{
    public ArrayList<Integer> array;
    TwoSum(ArrayList<Integer> array){
        this.array=array;
    }

    public void store(int integer){
        int counter=0;
        for(int pointer=0;pointer<this.array.size();pointer++){
            if(this.array.get(pointer)==0){
                counter=pointer;
                break;
            }
        }
        this.array.add(counter,integer);
    }

    public boolean test(int target){
        HashMap<Integer,Integer> reference = new HashMap<Integer,Integer>();
        for(int pointer=0;pointer<this.array.size();pointer++){
            if(reference.containsKey(target-this.array.get(pointer))){
                return true;
            }
            reference.put(this.array.get(pointer),pointer);
        }
        return false;
    }
}