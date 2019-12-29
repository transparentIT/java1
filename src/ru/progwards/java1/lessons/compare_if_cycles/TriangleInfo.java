package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static void main(String[] args) {
        boolean a, b, c;
        a = isTriangle(15, 8, 9);
        b = isRightTriangle(6, 8, 10);
        c = isIsoscelesTriangle(6, 7, 10);
    }
    public static boolean isTriangle(int a, int b, int c) {
        if (a <= b + c && b <= a + c && c <= a + b) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isRightTriangle(int a, int b, int c) {
        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}
