package com.bridgelabz.generic;

import java.util.Arrays;

public class TestMaximum<T> {
    T[] typeArray;
    public TestMaximum(T[] typeArray)
    {
        this.typeArray = typeArray;
    }
    public TestMaximum()
    {

    }

    public static void getMaximumInteger(Integer[] arr) {

        int max = arr[0];
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i].compareTo(max);
            if (a > 0) {
                max = arr[i];
                position = i;
            }
        }
        System.out.println("Maximum integer is " + max+" and its position is "+position);
    }

    public static void getMaximumFloat(Float[] arr) {

        Float max = arr[0];
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i].compareTo(max);
            if (a > 0) {
                max = arr[i];
                position = i;
            }
        }
        System.out.println("Maximum integer is " + max+" and its position is "+position);
    }

    public static void getMaximumString(String[] arr) {

        String max = arr[0];
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i].compareTo(max);
            if (a > 0) {
                max = arr[i];
                position = i;
            }
        }
        System.out.println("Maximum string is " + max+" and its position is "+position);
    }

    public static <T extends Comparable<T>> T getMax(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        printMax(x, y, z, max);
        return max;
    }
    public static <T> void printMax(T x, T y, T z, T max)
    {
        System.out.printf("Max of %s, %s and %s is %s\n", x, y, z, max);
    }

    public static void main( String[] args )
    {
        Integer[] arr = {10, 40, 20};
        getMaximumInteger(arr);

        Float[] floatArr = {2.3f,4.2f,7.5f};
        getMaximumFloat(floatArr);

        String[] stringArr = {"Krutika", "Janhvi", "Kavya"};
        getMaximumString(stringArr);

        getMax(10,40,20);
        System.out.println("Maximum integer is "+getMax(10,40,20));
        getMax(2.3f,4.2f,7.5f);
        System.out.println("Maximum float is "+getMax(2.3f,4.2f,7.5f));
        getMax("Apple", "Peach", "Banana");
        System.out.println("Maximum string is "+getMax("krutika", "kavya", "ruhi"));
    }
}
