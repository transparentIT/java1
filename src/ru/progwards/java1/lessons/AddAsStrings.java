package ru.progwards.java1.lessons;

public class AddAsStrings {
    public static void main(String[] args) {

    }

    public static int addAsStrings(int n1, int n2) {
        String s = "" + n1 + n2;
        return Integer.parseInt(s);
    }
}
