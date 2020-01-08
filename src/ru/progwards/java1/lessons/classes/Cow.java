package ru.progwards.java1.lessons.classes;

public class Cow extends Animal {
    private double weight;
    private double coefficient_weight = 0.05;
    public Cow(double weight) {
        super(weight);
        this.weight = weight;
        super.coefficient_weight = coefficient_weight;
    }

    @Override
    public AnimalKind getKind() {
        return AnimalKind.COW;
    }

    @Override
    public FoodKind getFoodKind() {
        return FoodKind.HAY;
    }

    @Override
    public double getFoodCoeff() {
        return coefficient_weight;
    }
}
