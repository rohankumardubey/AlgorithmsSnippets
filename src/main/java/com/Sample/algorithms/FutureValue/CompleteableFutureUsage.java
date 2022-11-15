package com.Sample.algorithms.FutureValue;

import java.util.concurrent.CompletableFuture;

public class CompleteableFutureUsage {
    public static void main(String[] args) throws InterruptedException {
      //
        for(int i = 1; i <=10; i++) {
          //
            System.out.println("Task =="+i);
            System.out.println("=========");
            CompletableFuture.supplyAsync(()->getName())
                    .thenApply(name -> getAge(name))
                    .thenApply(age->getStatus(age))
                    .thenAccept(status->sendMail(status));
            Thread.sleep(10);
            System.out.println("=========");
        }

    }

    static String getName(){
        System.out.println("getName() block");
        return "rohan";
    }

    static int getAge(String name){
        System.out.println("getAge() block");
        if(name.equals("rohan")){
            return 25;
        }
        return 0;
    }

    static String getStatus(int age){
        System.out.println("getStatus() block");
        if(age<=30){
            return "person is young";
        }
        return "person is old";
    }

    static void sendMail(String status){
        System.out.println("send mail block");
        String statusMail="mail sent";
    }
}
