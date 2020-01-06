package ru.progwards.java1.lessons.telegrambot;

import java.util.Random;

public class Proverka {

    static private String[] data = {"Q", "q", "W", "w", "E", "e", "R", "r", "T", "t", "A", "a", "S", "s", "F", "f",
            "G", "g", "Z", "z", "X", "x", "C", "c", "V", "v", "B", "b", "Y", "y", "U", "u", "I", "i", "O", "o",
            "{", "[", "}", "}", "H", "h", "J", "j", "K", "k", "L", "l", ":", ";", "", "N", "n", "M", "m", "<",
            ">", "?", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "!", "#", "@", "$", "%", "&", "*"};

    public static void main(String[] args) {
        int length = randomNum(8, 12);
        String[] p = new String[length];

        for (int i = 0; i < length; i++) {
            p[i] = data[randomNum(0, data.length)];
        }
        String password = "";
        for (String s : p) {
            password += s;
        }
        System.out.println(password);
        String str = "Сложный пароль";
        String ptr = "Простой пароль";
        if (str.equals("Сложный пароль")) {
            System.out.println("Сложный");
        } else if (ptr.equals("Простой пароль")) {
            System.out.println("Простой");
        }
    }

    static private int randomNum(int min, int max) {
        Random r = new Random();
        return r.nextInt(max) + min;
    }
}
