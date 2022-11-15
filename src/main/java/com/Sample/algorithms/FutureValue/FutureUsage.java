package com.Sample.algorithms.FutureValue;

import java.util.Random;
import java.util.concurrent.*;

public class FutureUsage {

    public static void main(String[] args){

        ExecutorService service = Executors.newFixedThreadPool(5);
        Future<Integer> future = service.submit(new Task());
        System.out.println("got the place holder!! will wait for the result to get ");

        try{
            //future.get() is a blocking
            Integer result = future.get();
            System.out.println("value is : "+result);
            service.shutdown();

        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    static class Task implements Callable<Integer>{
        int sum=0;
        @Override
        public Integer call() throws InterruptedException {
            for(int i = 0; i < 10000; i++) {
              //
                sum=sum+1;
                Thread.sleep(1);
                System.out.println("----------------------------------");
                System.out.println("waiting for Thread to complete!!!!");
                System.out.println("----------------------------------");
            }
            return new Random().nextInt();
        }
    }
}
