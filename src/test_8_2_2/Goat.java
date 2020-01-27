package test_8_2_2;

public class Goat implements Eating, Speaking{
    @Override
    public String say() {
        return "Мее";
    }

    @Override
    public String eat() {
        return "Сено";
    }
}
