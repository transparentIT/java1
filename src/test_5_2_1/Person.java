package test_5_2_1;

public class Person {
    private String name;
    private int age;
    private String country;

    public Person(String name, int age) {
        this.country = "RU";
        this.name = name;
        this.age = age;
    }
    public Person() {
        this.country = "RU";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }
}
