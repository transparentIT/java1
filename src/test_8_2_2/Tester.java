package test_8_2_2;

public class Tester {
    static void eat(Eating eating) {
        System.out.println(eating.eat());
    }

    public static void main(String[] args) {
        eat(new Dog());
        //eat(new Goat());
    }
}
