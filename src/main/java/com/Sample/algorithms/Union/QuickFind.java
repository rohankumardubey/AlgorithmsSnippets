package com.Sample.algorithms.Union;

import java.util.Arrays;
/*
Quick find algorithm
* */
public class QuickFind {
    private final int[] id;
    public QuickFind(int N){
        id = new int[N];
        for(int i = 0; i < N; i++) {
            id[i]=i;
        }
    }
    public boolean isConnected(int p,int q){
        return id[p]==id[q];
    }
    public void union(int p,int q){
        int pid= id[p];
        int qid = id[q];
        for(int i = 0; i < id.length; i++) {
            if(id[i]==pid){
                id[i]=qid;
            }
        }
    }

    public void printId(){
        System.out.println(Arrays.toString(id));
    }

    public static void main(String[] args){
        QuickFind union = new QuickFind(10);
        union.union(2,4);
        System.out.println(union.isConnected(2,4));
        union.printId();
    }
}
