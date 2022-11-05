package com.Sample.algorithms.arrays;

public class DynamicArray {
    int capacity = 10;
    int size = 0;
    Object[] array;

    public DynamicArray() {
        this.array = new Object[capacity];
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data) {
        if (size >= capacity) {
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data) {
        if(size>=capacity){
            grow();
        }

        if(size<index){
            array[index]=data;
        }
        else {
            for (int i = size; i >=index ; i--) {
                array[i+1]=array[i];
            }
            array[index]=data;
        }


    }

    public void delete(Object data) {
        int index=0;
        for (int i = 0; i < size; i++) {
            if(array[i]==data){
                index=i;
                array[i]=null;
            }
        }
        for (int i = index; i <size ; i++) {
            array[i]=array[i+1];
        }
    }

    public int search(Object data) {
        for (int i = 0; i < capacity; i++) {
            if(array[i]==data){
                return 1;
            }
        }
        return -1;
    }

    public void grow() {
        int newcapacity=this.capacity+(int)(this.capacity/2);
        Object[] newArray = new Object[newcapacity];
        for (int i = 0; i < size; i++) {
            newArray[i]=array[i];
        }
        capacity=newcapacity;
        array=newArray;

    }

    public boolean isEmpty() {
        return array.length == 0;
    }

    public String toString() {
        String string = "";
        for (int i = 0; i < capacity; i++) {
            string += array[i] + ",";
        }
        if (!string.equals("")) {
            string = "[" + string.substring(0, string.length() - 1) + "]";
        } else {
            string = "[" + "]";
        }
        return string;
    }

}
