package com.Sample.algorithms.ConcurrencyUsage;

import java.util.concurrent.Executor;

public class ExecutorImpl {
    public static void main(String[] args){
    ExecutorImplUsage executor = new ExecutorImplUsage();
    executor.execute(new RunnableUsage());
    }
}

class ExecutorImplUsage implements Executor{
    @Override
    public void execute(Runnable task){
        new Thread(task).start();
    }
}

class RunnableUsage implements Runnable{
    @Override
    public void run(){
        System.out.println("this is in runnable");
    }
}
