package com.Sample.algorithms.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class DevLatch implements Runnable{
    private CountDownLatch latch;
    private String name;
    public DevLatch(CountDownLatch latch,String name){
        this.latch=latch;
        this.name=name;
    }


    @Override
    public void run() {
        System.out.println("Dev thread started"+this.name);
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    System.out.println("dev thread completed");
    }
}
