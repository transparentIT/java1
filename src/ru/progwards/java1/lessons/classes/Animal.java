package ru.progwards.java1.lessons.classes;

public class Animal {
    public double weight;
    public double coefficient_weight = 0.02;
    public Animal(double weight) {
        this.weight = weight;
        this.coefficient_weight = coefficient_weight;
    }

    public static void main(String[] args) {
        Cow cow = new Cow(340);
        double d1 = cow.calculateFoodWeight();
        System.out.println(d1);
    }

    public enum AnimalKind {
        ANIMAL, COW, HAMSTER, DUCK
    }

    public enum FoodKind {
        UNKNOWN, HAY, CORN
    }

    public AnimalKind getKind() {
        return AnimalKind.ANIMAL;
    }

    public FoodKind getFoodKind() {
        return FoodKind.UNKNOWN;
    }

    @Override
    public String toString() {
        return "I am " + getKind() + ", eat " + getFoodKind();
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

    public String toStringFull() {
        return "I am " + getKind() + ", eat " + getFoodKind() + " " + calculateFoodWeight();
    }
}
