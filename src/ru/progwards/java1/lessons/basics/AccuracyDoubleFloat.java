package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static void main(String[] args) {
        //System.out.println(calculateAccuracy(6371.2));
        System.out.println((double) (4 / 3 * 3.14));
    }
    public static double volumeBallDouble(double radius) {
        return (double) (4.0 / 3.0 * 3.14) * (Math.pow(radius, 3));
    }
    public static float  volumeBallFloat(float radius) {
        return (float) ((4 / 3 * 3.14) * (radius * radius * radius));
    }
    public static double calculateAccuracy(double radius) {
        return volumeBallDouble(radius) - volumeBallFloat((float) radius);
    }
}
