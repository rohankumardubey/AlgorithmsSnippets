package com.Sample.algorithms.ConcurrentHashMap;

import java.util.concurrent.*;

public class ConcurrentMapThreads {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
      //

        ConcurrentHashMap<String,String> map = new ConcurrentHashMap<>();

        Task task1 = new Task(1,map);
        Task task2 = new Task(2,map);
        Task task3 = new Task(2,map);
        ExecutorService service = Executors.newFixedThreadPool(10);
        Future<ConcurrentHashMap<String,String>> future1 = service.submit(task1);
        Future<ConcurrentHashMap<String,String>> future2 = service.submit(task2);
        Future<ConcurrentHashMap<String,String>> future3 = service.submit(task3);
        map=future1.get();
        map=future2.get();
        map=future3.get();
        System.out.println(map);
        service.shutdown();
    }

    static class Task implements Callable<ConcurrentHashMap<String,String>> {

        int value;
        ConcurrentHashMap<String,String> map;
        Task(int value,ConcurrentHashMap<String,String> map){
            this.value=value;
            this.map=map;
        }

        public void put(String key,String value){
            this.map.put(key,value);
        }

        public String get(String key){
            return this.map.get(key);
        }

        @Override
        public ConcurrentHashMap<String,String> call(){

            if(value%2==0){
                put(String.format("sample_%d",value),String.format("sample_%d",value));
                System.out.println("put value ->> "+ String.format("sample_%d",value) );
            }
            else {
                String sample =get(String.format("sample_%d",value));
                System.out.println("get value ->> "+sample);
            }
            return map;
        }
    }
}
