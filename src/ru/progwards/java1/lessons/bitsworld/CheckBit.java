package ru.progwards.java1.lessons.bitsworld;

public class CheckBit {
    public static void main(String[] args) {
        int b = -70;
        //int b = 77;
        byte b1 = (byte) b;
        int i = checkBit(b1, 0);
        System.out.println(i);
    }
    public static int checkBit(byte value, int bitNumber) {
        int value2 = value & 0b0000000_0000000_0000000_11111111;
        String bin = Integer.toBinaryString(value2);

        int j = 0;
        char[] chars = bin.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == bitNumber) {
                j = Integer.parseInt(Character.toString(chars[(chars.length - 1) - i]));
            }
        }
        return j;
    }
}
