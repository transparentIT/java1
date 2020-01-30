package ru.progwards.java1.lessons.interfaces;

import java.util.Objects;

import static ru.progwards.java1.lessons.interfaces.Animal.FoodKind.*;

public class Animal implements FoodCompare {

    @Override
    public int compareFoodPrice(Animal aminal) {
        return Double.compare(this.getFoodPrice(), aminal.getFoodPrice());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(animal.weight, weight) == 0 &&
                Double.compare(animal.coefficient_weight, coefficient_weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, coefficient_weight);
    }

    public double weight;
    public double coefficient_weight = 0.02;
    public Animal(double weight) {
        this.weight = weight;
        this.coefficient_weight = coefficient_weight;
    }

    public double getFoodPrice() {
        return calculateFoodWeight() * getFood1kgPrice();
    }

    public enum FoodKind {
        UNKNOWN, HAY, CORN
    }

    public enum AnimalKind {
        ANIMAL, COW, HAMSTER, DUCK
    }

    public AnimalKind getKind() {
        return AnimalKind.ANIMAL;
    }

    public FoodKind getFoodKind() {
        return UNKNOWN;
    }

    public double getWeight() {
        return weight;
    }

    public double getFoodCoeff() {
        coefficient_weight = 0.02;
        return coefficient_weight;
    }

    public double calculateFoodWeight() {
        return weight * coefficient_weight;
    }

    public double getFood1kgPrice() {
        switch (getFoodKind()) {
            case HAY:
                return 20.0;
            case CORN:
                return 50.0;
            default:
                return 0.0;
        }
    }
}
/*
ERROR: Тест "Метод equals(Object anObject)" не пройден. Метод возвращает неверное значение.
 Результат вызова new Duck(1D).equals(new Duck(1D)): false. Ожидалось: true.

OK: Тест "Метод getFood1kgPrice()" пройден успешно.
OK: Тест "Метод getFoodPrice()" пройден успешно.
ERROR: Тест "Интерфейс FoodCompare, метод compareFoodPrice(Animal o)" не пройден.
Метод возвращает неверные результаты сравнения для new Animal(1D).сompareFoodPrice(new Cow(1D)): 1,
ожидалось значение меньше 0.
По данной задаче в целом не зачет, решение возвращено на доработку. Задача выполнена на 30.00%%
 */