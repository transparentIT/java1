package ru.progwards.java1.lessons.classes;

public class Duck extends Animal {
    private double weight;
    private double coefficient_weight;
    public Duck(double weight, double coefficient_weight) {
        super(weight, coefficient_weight);
        this.weight = weight;
        this.coefficient_weight = coefficient_weight;
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
        return super.getFoodCoeff();
    }
}
