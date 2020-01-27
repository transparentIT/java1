package test_8_2_2;

public class Dog  implements Eating, Speaking{
    @Override
    public String say() {
        return "Гав";
    }

    @Override
    public String eat() {
        return "Мясо";
    }
}

/*
Описаны интерфейсы

public interface Speaking {
    public String say();
 }

public interface Eating {
     public String eat();
 }

реализовать 2 класса, Dog и Goat.
У класса Dog метод say() должен вернуть "Гав"
У класса Dog метод eat() должен вернуть "Мясо"
У класса Goat метод say() должен вернуть "Мее"
У класса Goat метод eat() должен вернуть "Сено"
 */
