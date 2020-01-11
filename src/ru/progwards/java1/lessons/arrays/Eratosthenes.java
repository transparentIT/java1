package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class Eratosthenes {
    private boolean[] sieve;

    public Eratosthenes(int N) {
        this.sieve = new boolean[N];
        Arrays.fill(this.sieve, true);
        sift();
        int f = 1;
    }

    private void sift() {
        for (int i = 2; i < sieve.length - 1; i++) {
            if (i % 2 == 0) {
                sieve[i] = false;
            }
        }
    }

    public boolean isSimple(int n) {
        return sieve[n];
    }

    public static void main(String[] args) {
        Eratosthenes eratosthenes = new Eratosthenes(10);
    }
}
