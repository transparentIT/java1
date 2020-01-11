package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class Eratosthenes {
    private boolean[] sieve;

    public Eratosthenes(int N) {
        sieve = new boolean[N + 1];
        Arrays.fill(sieve, true);
        sieve[0] = true;
        sieve[1] = true;
        sift();
    }

    private void sift() {
        for (int i = 2; i < sieve.length; ++i) {
            if (sieve[i]) {
                for (int j = 2; i * j < sieve.length; ++j)
                    sieve[i * j] = false;
            }
        }
    }

    public boolean isSimple(int n) {
        return sieve[n];
    }

    public static void main(String[] args) {
        Eratosthenes eratosthenes = new Eratosthenes(10);
        boolean b = eratosthenes.isSimple(0);
        System.out.println(b);
    }
}
