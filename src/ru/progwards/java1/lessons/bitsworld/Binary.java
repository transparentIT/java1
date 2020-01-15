package ru.progwards.java1.lessons.bitsworld;

public class Binary {
    private byte num;
    public static void main(String[] args) {

    }

    public Binary(byte num) {
        this.num = num;
    }

    @Override
    public String toString() {
        int value2 = num & 0b0000000_0000000_0000000_11111111;
        String bin = Integer.toBinaryString(value2);

        String str = "";
        char[] chars = bin.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            str = str + Character.toString(chars[i]);
        }
        return str;
    }
}
