package ru.progwards.java1.lessons.interfaces;

public class ArraySort {
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
