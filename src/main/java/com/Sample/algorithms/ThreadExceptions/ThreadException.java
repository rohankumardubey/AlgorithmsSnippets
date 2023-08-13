package com.Sample.algorithms.ThreadExceptions;

public class ThreadException {
    public static void main(String[] args){
//    Thread thread = new Thread(new Runnable(){
//        @Override
//        public void run(){
//            throw new RuntimeException();
//        }
//    });
//
//    thread.setName("Thread 1");
//
//    thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){
//        @Override
//        public void uncaughtException(Thread thread,Throwable throwable){
//            System.out.println("exception in "+thread.getName()+" because of "+throwable.toString());
//        }
//    });
//    thread.start();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                throw new RuntimeException();
            }
        });

        thread.setName("error thread");

        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){

            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("thread name "+t.getName()+" with exception throwable issue "+e.toString());
            }
        });

        thread.start();
    }
}
