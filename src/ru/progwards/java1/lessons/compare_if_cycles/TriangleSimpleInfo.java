package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static void main(String[] args) {
        System.out.println(maxSide(15, 25, 9));
        System.out.println(minSide(1, 33, 1));
        System.out.println(isEquilateralTriangle(1, 1, 1));
    }
    public static int maxSide(int a, int b, int c) {
        a = ((a > b) ? a : b);
        c = ((a > c) ? a : c);
        return c;
    }
    public static int minSide(int a, int b, int c) {
        a = ((a < b) ? a : b);
        c = ((a < c) ? a : c);
        return c;
    }
    public static boolean isEquilateralTriangle(int a, int b, int c) {
        return ((a == b && a == c && b == c) ? true : false);
    }
}
