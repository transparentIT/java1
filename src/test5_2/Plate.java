package test5_2;

public class Plate {
    int id;
    Position position;
    public double volume = 1000; // максимальный объем в мл

    public Plate(int id) {
        this.id = id;
    }

    public boolean isEmpty() {
        return Detector.plateIsEmpty(id);
    }
}
