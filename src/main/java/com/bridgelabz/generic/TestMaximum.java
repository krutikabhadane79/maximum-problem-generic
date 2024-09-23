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

    public static <T extends Comparable<T>> void getMax(TestMaximum testMaximum) {
        Arrays.sort(testMaximum.typeArray);
        T max = (T) testMaximum.typeArray[0];
        int position = 0;
        for (int i = 0; i < testMaximum.typeArray.length; i++)

        {
            T a = (T)testMaximum.typeArray[i];
            int b = a.compareTo(max);
            if(b > 0)
            {
                max = (T) testMaximum.typeArray[i];
                position = i;
            }
        }
        System.out.println("Maximum element is : "+max);
        System.out.println("Maximum string is " + max+" and its position is "+position);
        printArray(testMaximum.typeArray);

    }

    public static void printArray(Object[] typeArray) {
        for (Object element : typeArray)
        {
            System.out.println(element+"  ");
        }
    }

    public static void main( String[] args )
    {
        Integer[] arr = {10, 40, 20};
        getMaximumInteger(arr);

        Float[] floatArr = {2.3f,4.2f,7.5f};
        getMaximumFloat(floatArr);

        String[] stringArr = {"Krutika", "Janhvi", "Kavya"};
        getMaximumString(stringArr);

        getMax(new TestMaximum(arr));
        getMax(new TestMaximum(floatArr));
        getMax(new TestMaximum(stringArr));
    }
}
