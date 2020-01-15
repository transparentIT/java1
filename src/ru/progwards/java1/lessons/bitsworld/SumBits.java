package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
    public static void main(String[] args) {
        byte b = 5;
        int i = sumBits(b);
        System.out.println(i);
    }
    public static int sumBits(byte value) {
        String bin = String.format("%8s", Integer.toBinaryString(value)).replace(' ', '0');
        int j = 0;
        char[] chars = bin.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] & 1) == 1) {
                j = j + 1;
            }
        }
        return j;
    }
}