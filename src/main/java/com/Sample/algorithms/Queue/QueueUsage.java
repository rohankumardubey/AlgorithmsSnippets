package com.Sample.algorithms.Queue;

public class QueueUsage {
    public static void main(String[] args){
        QueueImpl<String> queue = new QueueImpl(5);
        queue.push("ab");
        queue.push("ac");
        queue.push("ad");
        System.out.println(queue.length());
        queue.print();
        queue.pop();
        queue.print();



    }
}
