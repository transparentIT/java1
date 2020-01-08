package ru.progwards.java1.lessons.classes;

public class Hamster extends Animal {
    private double weight;
    private double coefficient_weight = 0.03;
    public Hamster(double weight) {
        super(weight);
        this.weight = weight;
        super.coefficient_weight = coefficient_weight;
    }

    @Override
    public AnimalKind getKind() {
        return AnimalKind.HAMSTER;
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
