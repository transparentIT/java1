package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    public int a = 0;
    public int b = 0;

    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return a + "+" + b + "i";
    }

    public ComplexNum add(ComplexNum num) {
        return new ComplexNum(a + num.a, b + num.b);
    }

    public ComplexNum sub(ComplexNum num) {
        return new ComplexNum(a - num.a, b - num.b);
    }

    public ComplexNum mul(ComplexNum num) {
        return new ComplexNum(a * num.a, b * num.b);
    }

    public ComplexNum div(ComplexNum num) {
        return new ComplexNum(a / num.a, b / num.b);
    }
}
