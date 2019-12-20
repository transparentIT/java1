package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static void main(String[] args) {
//        int i = reverseDigits(123);
    }
    public static int reverseDigits(int number) {
        String s1;
        s1 = "" + number % 10 + (number / 10) % 10 + (number / 100) % 10;
        return Integer.parseInt(s1);
    }
}
