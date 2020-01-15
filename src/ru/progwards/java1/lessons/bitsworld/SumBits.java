package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
    public static void main(String[] args) {
        int b = -128;
        byte b1 = (byte) b;
        int i = sumBits(b1);
        System.out.println(i);
    }
    public static int sumBits(byte value) {
        int value1 = value;
        int value2 = value & 0b0000000_0000000_0000000_11111111;
        String bin = Integer.toBinaryString(value2);

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