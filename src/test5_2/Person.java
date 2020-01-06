package test5_2;

public class Person {
    PersonType type;
    double weight;
    public Eat.EatType lastEatType = Eat.EatType.NOTHING;

    Person(PersonType persontype, double personWeight) {
        type = persontype;
        weight = personWeight;
    }

    public Eat.EatType nextEatType() {
        switch (lastEatType) {
            case NOTHING:
                return Eat.EatType.SOUP;
            case SOUP:
                return Eat.EatType.ENTREE;
            case ENTREE:
                return Eat.EatType.DESSERT;
            case DESSERT:
                return Eat.EatType.DINNER_IS_OVER;
            default:
                return Eat.EatType.DINNER_IS_OVER;
        }
    }

    public double eatQuantity(Eat.EatType eatType) {
        switch (eatType) {
            case SOUP:
                return weight / 150;
            case ENTREE:
                return weight / 150;
            case DESSERT:
                return weight / 300;
            default:
                return 0;
        }
    }

    enum PersonType {
        FATHER, MOTHER, CHILD
    }

}
