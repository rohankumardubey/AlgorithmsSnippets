package com.Sample.algorithms.Daemon;

import sun.misc.Unsafe;
import java.lang.reflect.Field;

public class UnSafeLibrary {
    public static void getUnsafe() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class<?> unsafeClass = Class.forName("sun.misc.Unsafe");
        Field field = unsafeClass.getDeclaredField("theUnsafe");
        field.setAccessible(true);
        Unsafe unsafe = (Unsafe) field.get(null);
    }

    public static void main(String[] args) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException {
        getUnsafe();
    }
}
