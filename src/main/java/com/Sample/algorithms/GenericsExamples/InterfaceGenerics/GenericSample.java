package com.Sample.algorithms.GenericsExamples.InterfaceGenerics;

public interface GenericSample<T,V> {
    V genericValOne(T t);
    T genericValTwo(V v);
}
