package com.Sample.algorithms.SynchronizeUsage;

public class Counter {
    private static int counter = 0;

    public static synchronized int getCount() {
        return counter;
    }

    public static synchronized void setCounter(int count) {
        counter = count;
    }

    public static void main(String[] args) {
//        Counter count = new Counter();
        Counter.setCounter(100);
        System.out.println(Counter.getCount());
        Counter.setCounter(200);
        System.out.println(Counter.getCount());
    }
}
