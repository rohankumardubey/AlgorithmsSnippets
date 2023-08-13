package com.Sample.algorithms.Stack;

public class StackImpl<T> {
    private int size=10;
    private final T[] array;
    private int top=-1;

    @SuppressWarnings("unchecked")
    StackImpl(int size){
        this.size=size;
        this.array=(T[])new Object[size];

    }

    public void push(T element){
        if(top==-1){
            this.array[0]=element;
            top=0;
        }
        else{
            top++;
            this.array[top]=element;
        }
    }

    public T pop(){
        T temp=null;
        if(top==-1){
            throw new IllegalArgumentException();
        }
        else{
            temp = this.array[top];
            this.array[top] = null;
            top--;
        }
        return temp;
    }

    public T peek(){
        return this.array[top];
    }

    public int length(){
        if(top==-1){
            return 0;
        }
        else{
            return top+1;
        }
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void print(){
        for(int i = 0; i <= top; i++) {
          System.out.print(this.array[i]+" ");
        }
    }

    public T[] toArray(){
        return this.array;
    }


}
