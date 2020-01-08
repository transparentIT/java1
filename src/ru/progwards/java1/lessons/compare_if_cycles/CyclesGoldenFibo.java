package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static void main(String[] args) {
        int n0 = 1;
        int n1 = 1;
        int n2 = 0;
        System.out.print(n0 + " " + n1 + " ");
        for(int i = 3; i <= 15; i++){
            n2= n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }
    public static boolean containsDigit(int number, int digit) {
        int n = number;
        int a = ("" + n).length();
        int[] b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = number % 10;
            number = number / 10;
            if (b[i] == digit) {
                return true;
            }
        }
        return false;
    }
    public static int fiboNumber(int n) {
        int n0 = 1;
        int n1 = 1;
        int n2 = 0;
        for(int i = 3; i <= n; i++){
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
        }
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return n2;
        }
    }
    public static boolean isGoldenTriangle(int a, int b, int c) {
        return false;
    }
}
