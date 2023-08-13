package com.Sample.algorithms.Queue;

public class QueueImpl<T> {
    private int size;
    private T[] array;
    private int pushpointer=-1;

    @SuppressWarnings("unchecked")
    QueueImpl(int size){
        this.size=size;
        this.array= (T[]) new Object[this.size];
    }

    public void push(T element){
        if(pushpointer==-1){
            this.array[0]=element;
            pushpointer=0;
        }
        else{
            pushpointer++;
            this.array[pushpointer]=element;
        }
    }

    public T pop(){
        T temp=null;
        if(pushpointer==-1){
            throw  new IllegalArgumentException("Size is zero cannot pop elements");
        }else{
            temp=this.array[0];
            this.array[0]=null;
            swap();
            pushpointer--;

        }
        return temp;
    }

    private void swap(){
        for(int i = 1; i <= pushpointer; i++) {
          this.array[i-1]=this.array[i];
        }
        this.array[pushpointer]=null;
    }

    public int length(){
        if(pushpointer==-1){
            return 0;
        }else{
            return pushpointer+1;
        }
    }

    public void print(){
        for(int i = 0; i <= pushpointer; i++) {
          System.out.print(this.array[i]+" ");
        }
        System.out.println();
    }

    public T[] toArray(){
        return this.array;
    }

}
