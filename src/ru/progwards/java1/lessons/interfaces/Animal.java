package ru.progwards.java1.lessons.interfaces;

import static ru.progwards.java1.lessons.interfaces.Animal.FoodKind.*;

public class Animal implements FoodCompare {

    @Override
    public int compareFoodPrice(Animal aminal) {
        return Double.compare(aminal.getFoodPrice(), this.getFoodPrice());
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
            case UNKNOWN:
                return 0.0;
            default:
                return 0.0;
        }
    }
}
