package ru.progwards.java1.lessons.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class DIntArray {
    private int[] ints;

    public DIntArray() {
    }

    public void add(int num) {
        ArrayList<Integer> arrays = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++) {
            arrays.add(ints[i]);
        }
        arrays.add(num);
        ints = new int[arrays.size()];
        for (int i = 0; i < arrays.size(); i++) {
            ints[i] = arrays.get(i);
        }
    }

    public void atInsert(int pos, int num) {
        ArrayList<Integer> arrays = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++) {
            arrays.add(ints[i]);
        }
        arrays.add(pos, num);
        ints = new int[arrays.size()];
        for (int i = 0; i < arrays.size(); i++) {
            ints[i] = arrays.get(i);
        }
    }

    public void atDelete(int pos) {
        ArrayList<Integer> arrays = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++) {
            arrays.add(ints[i]);
        }
        arrays.remove(pos);
        ints = new int[arrays.size()];
        for (int i = 0; i < arrays.size(); i++) {
            ints[i] = arrays.get(i);
        }
    }

    public int at(int pos) {
        return ints[pos];
    }

    public static void main(String[] args) {
        // пока тест даже писать не буду, проверим смогу ли в слепую сделать)
    }
}
