package ru.progwards.java1.lessons.arrays;

import java.lang.reflect.Array;

public class ArraySort {
    public static void main(String[] args) {
        int[] ints = {10, 15, 78, 11};
        ArraySort arraySort = new ArraySort();
        arraySort.sort(ints);
        int f = 0;
    }

    public static void sort(int[] a) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < a.length; i++) {
                if (a[i] < a[i - 1]) {
                    int tmp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = tmp;
                    needIteration = true;
                }
            }
        }
    }
}
