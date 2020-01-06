package test5_2_2;

public class Calculator {
    private int result;

    public Calculator() {
        this.result = 0;
    }

    public void set(int num) {
        this.result = num;
    }

    public void add(int num) {
        this.result = this.result + num;
    }

    public void sub(int num) {
        this.result = this.result - num;
    }

    public int getResult() {
        return result;
    }
}

/*
приватную переменную int result;
конструктор по умолчанию, устанавливающий result = 0;
публичную функцию set(int num), устанавливающую значение result равный num
публичную функцию add(int num), увеличивающую result на num
публичную функцию sub(int num), уменьшающую result на num
публичную функцию int getResult()
 */