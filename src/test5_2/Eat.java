package test5_2;

public class Eat {
    Position position;
    double radius = 0.15; // в метрах
    public EatType type; // тип еды
    double volume; //начальный объем в мл
    private double eaten = 0; // сколько съедено

    public Eat(EatType type, double volume) {
        this.type = type;
        this.volume = volume;
    }

    boolean inArea(Position otherPosition) {
        return position.inRadius(otherPosition, radius);
    }

    double volumeNow() {
        return volume - eaten;
    }

    public double getEat(double portionVolume) {
        if (volumeNow() < portionVolume) {
            // недостаточный объем для выдачи порции
            portionVolume = volumeNow();
        }
        eaten += portionVolume;
        return portionVolume;
    }

    public static Eat selectEatByType(EatType eatType, Eat eat1, Eat eat2, Eat eat3, Eat eat4) {
        if (eatType == EatType.SOUP) {
            return eat1;
        } else if (eatType == EatType.ENTREE) {
            return eat2;
        } else if (eatType == EatType.DESSERT) {
            return eat3;
        } else {
            return eat4;
        }
    }

    public enum EatType {
        NOTHING, SOUP, ENTREE, DESSERT, DINNER_IS_OVER
    }

}
