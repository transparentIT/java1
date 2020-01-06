package test5_2;

public class Table {
    Position position;
    double radius = 0.75;

    public Chair chair1;
    public Chair chair2;
    public Chair chair3;

    boolean inArea(Position otherPosition) {
        return position.inRadius(otherPosition, radius);
    }
}
