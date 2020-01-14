package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
    public static void main(String[] args) {
        int i;
        byte b = 0b0100101;
        i = sumBits(b);
        System.out.println(i);
    }
    public static int sumBits(byte value) {
        return Integer.bitCount(value);
    }
}

/*
1.1 Реализовать функцию public static int sumBits(byte value), которая суммирует
все биты параметра value. Например, для двоичного числа 0100101 функция должна вернуть 3.

Подсказки:
используйте & с числом 1 для того, чтобы оставить только один правый значащий бит;
используйте сдвиг вправо для того, чтобы проверить следующий бит.
 */