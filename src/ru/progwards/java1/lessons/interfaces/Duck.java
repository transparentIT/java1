package ru.progwards.java1.lessons.interfaces;

public class Duck extends Animal {
    private double weight;
    private double coefficient_weight = 0.04;
    public Duck(double weight) {
        super(weight);
        this.weight = weight;
        super.coefficient_weight = coefficient_weight;
    }

    @Override
    public AnimalKind getKind() {
        return AnimalKind.DUCK;
    }

    @Override
    public FoodKind getFoodKind() {
        return FoodKind.CORN;
    }

    @Override
    public double getFoodCoeff() {
        return coefficient_weight;
    }
}
