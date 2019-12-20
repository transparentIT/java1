package ru.progwards.java1.lessons.basics;

public class Astronomy {
    public static void main(String[] args) {
//        System.out.println(sphereSquare(7.5));
//        System.out.println(earthSquare());
//        System.out.println(mercurySquare());
//        System.out.println(jupiterSquare());
//        System.out.println(earthVsMercury());
//        System.out.println(earthVsJupiter());
    }
    public static Double sphereSquare(Double r) {
        return 4 * 3.14 * (r * r);
    }
    public static Double earthSquare() {
        Double earthSquare = sphereSquare(6371.2);
        return earthSquare;
    }
    public static Double mercurySquare() {
        Double mercurySquare = sphereSquare(2439.2);
        return mercurySquare;
    }
    public static Double jupiterSquare() {
        Double jupiterSquare = sphereSquare(71492.0);
        return jupiterSquare;
    }
    public static Double earthVsMercury() {
        Double earthVsMercury = earthSquare() / mercurySquare();
        return earthVsMercury;
    }
    public static Double earthVsJupiter() {
        Double earthVsJupiter = earthSquare() / jupiterSquare();
        return earthVsJupiter;
    }
}
