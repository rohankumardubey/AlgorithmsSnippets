package com.Sample.algorithms.SynchronizeUsage;

public class Counter {
    private int counter = 0;

    public synchronized int getCount(){
        return this.counter;
    }

    public synchronized void setCounter(int count){
        this.counter=count;
    }

    public static void main(String[] args){
        Counter count =new Counter();
        count.setCounter(100);
        System.out.println(count.getCount());
        count.setCounter(200);
        System.out.println(count.getCount());
    }
}
