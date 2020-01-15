package ru.progwards.java1.lessons.bitsworld;

public class CheckBit {
    public static void main(String[] args) {
        int b = -128;
        byte b1 = (byte) b;
        int i = checkBit(b1, 3);
        System.out.println(i);
    }
    public static int checkBit(byte value, int bitNumber) {
        int value1 = value;
        int value2 = value & 0b0000000_0000000_0000000_11111111;
        String bin = Integer.toBinaryString(value2);

        int j = 0;
        char[] chars = bin.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] & 1) == 1 && i == bitNumber) {
                j = chars[i];
            }
        }
        return j;
    }
}
