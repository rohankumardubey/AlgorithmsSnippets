package com.Sample.algorithms.ConcurrencyUsage;

import java.util.*;
import java.util.concurrent.*;

public class ExecutorServiceCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        // to maintain the concurrency task order
        HashMap<String,Callable<String>> caller = new LinkedHashMap();
        HashMap<String,Callable<String>> timeOutTasks = new LinkedHashMap();


        caller.put("task1",new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "task 1";
            }
        });

        caller.put("task2",new Callable<String>(){
            @Override
            public String call() throws Exception{
                Thread.sleep(10000);
                return "task 2";
            }
        });

        caller.put("task3",new Callable<String>(){
            @Override
            public String call() throws Exception{
                return "task 3";
            }
        });

        caller.put("task4",new Callable<String>(){
            @Override
            public String call() throws Exception{
                Thread.sleep(10000);
                return "task 4";
            }
        });

        caller.put("task5",new Callable<String>(){
            @Override
            public String call() throws Exception{
                return "task 5";
            }
        });

        // storing the callable result to future
        // so we keep the promise of returning the value

        for(Callable<String> call:caller.values()){

            Future<String> future=executor.submit(call);
            try{
                System.out.println("processed tasks : "+future.get(5000,TimeUnit.MILLISECONDS));
            }
            catch (TimeoutException exception){

                Set<String> Keys = caller.keySet();
                for(String key:Keys){
                    if(caller.get(key)==call){
                        timeOutTasks.put(key,call);
                    }
                }
            }

            Thread.sleep(10);
        }


        executor.shutdown();
        executor.awaitTermination(10000,TimeUnit.MILLISECONDS);

        System.out.println("\n\nunprocessed tasks : "+timeOutTasks);
    }
}
