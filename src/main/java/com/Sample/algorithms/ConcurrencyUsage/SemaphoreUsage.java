package com.Sample.algorithms.ConcurrencyUsage;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreUsage {
    public static void main(String[] args) throws InterruptedException {

        Semaphore semaphore = new Semaphore(5);
        ExecutorService service = Executors.newFixedThreadPool(100);
        for(int i = 0; i < 1000; i++) {
            service.execute(new Task(semaphore));
        }
        service.shutdown();
        service.awaitTermination(10000, TimeUnit.MILLISECONDS);
    }

    static class Task implements Runnable{
        public Semaphore semaphore;
        public Task(Semaphore semaphore) {
            this.semaphore=semaphore;
        }

        @Override
        public void run(){
            this.semaphore.acquireUninterruptibly();

            random();

            this.semaphore.release();
        }
    }

    static void random(){
        int number = new Random().nextInt(20);
        if(number>10){
            System.out.println("\nThread name : "+Thread.currentThread().getName()+"\tnumber is greater than 10 : "+number);
        }
        else{
            System.out.println("\nThread name : "+Thread.currentThread().getName()+"\tnumber is less than 10 : "+(number*number));
        }
    }
}
