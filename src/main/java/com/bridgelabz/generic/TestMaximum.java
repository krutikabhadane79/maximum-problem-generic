package com.bridgelabz.generic;

public class TestMaximum
{
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

    public static <T extends Comparable<T>> void getMax(T[] arr) {
        T max = arr[0];
        int position = 0;
        for (int i = 0; i < arr.length; i++)
        {
            int a = arr[i].compareTo(max);
            if(a > 0)
            {
                max = arr[i];
                position = i;
            }
        }
        System.out.println("Maximum element is " + max+" and its position is "+position);
    }

    public static void main( String[] args )
    {
        Integer[] arr = {10, 40, 20};
        getMaximumInteger(arr);
        getMax(arr);

        Float[] floatArr = {2.3f,4.2f,7.5f};
        getMaximumFloat(floatArr);
        getMax(floatArr);

        String[] stringArr = {"Krutika", "Kajal", "Kavya"};
        getMaximumString(stringArr);
        getMax(stringArr);
    }
}
