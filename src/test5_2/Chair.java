package test5_2;

public class Chair {
    int id;
    Position position;
    double radius = 0.25;
    public Person person;
    public Plate plate;

    public Chair(int id) {
        this.id = id;
    }

    boolean inArea(Position otherPosition) {
        return position.inRadius(otherPosition, radius);
    }

    public boolean isEmpty() {
        return Detector.chairIsEmtpy(id);
    }

    public void detectPerson() {
        double personOnChairWeight = Detector.personOnChairWeight(id);
        if (personOnChairWeight < 30) {
            // ребёнок
            person = new Person(Person.PersonType.CHILD, personOnChairWeight);
        } else if (personOnChairWeight > 50) {
            // ребёнок
            person = new Person(Person.PersonType.FATHER, personOnChairWeight);
        } else {
            // ребёнок
            person = new Person(Person.PersonType.MOTHER, personOnChairWeight);
        }
    }
}
