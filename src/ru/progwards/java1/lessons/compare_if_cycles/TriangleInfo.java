package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static void main(String[] args) {
        boolean a, b, c;
//        a = isTriangle(15, 8, 9);
//        b = isRightTriangle(4, 3, 3);
        c = isIsoscelesTriangle(6, 7, 10);
    }
    public static boolean isTriangle(int a, int b, int c) {
        if (a < b + c) {
            return true;
        } else if (b < a + c) {
            return true;
        } else if (c < a + b) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isRightTriangle(int a, int b, int c) {
        int a2 = a * a;
        int b2 = b * b;
        int c2 = c * c;
        if ((a2 + b2) == c2) {
            return true;
        } else if ((b2 + c2) == a2) {
            return true;
        } else if ((a2 + c2) == b2) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        if (a == b) {
            return true;
        } else if (b == c) {
            return true;
        } else if (a == c) {
            return true;
        } else {
            return false;
        }
    }
}
