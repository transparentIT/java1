package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    public int a = 0;
    public int b = 0;

    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        ComplexNum c1 = new ComplexNum(1000, 1009);
        ComplexNum c2 = new ComplexNum(100, 91);
        System.out.println(c1.mul(c2));
        System.out.println(c1.div(c2));
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
        return new ComplexNum((a * num.a) - (b * num.b), (b * num.a) + (a * num.b));
    }

    public ComplexNum div(ComplexNum num) {
        return new ComplexNum(((a * num.a) + (b * num.b)) / ((num.a * num.a) + (num.b * num.b)), ((b * num.a) - (a * num.b)) / ((num.a * num.a) + (num.b * num.b)));
    }
}
