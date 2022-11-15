package com.Sample.algorithms.datastructures.HashMapUsage;

import java.io.*;

public class SerializeTransientSample implements Serializable {
    // Normal variables
    int i=10;
    int j=20;
    transient int k = 30;
    transient static int l =40;
    transient final int m =50;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializeTransientSample sample = new SerializeTransientSample();
        FileOutputStream ostream = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(ostream);
        oos.writeObject(sample);

        FileInputStream istream = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(istream);
        SerializeTransientSample stream = (SerializeTransientSample) ois.readObject();
        System.out.println("i :"+stream.i);
        System.out.println("j :"+stream.j);
        System.out.println("k :"+stream.k);
        System.out.println("l :"+stream.l);
        System.out.println("m :"+stream.m);

    }
}
