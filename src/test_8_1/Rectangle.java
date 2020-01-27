package test_8_1;

import java.util.Objects;

public class Rectangle {
    private double a;
    private double b;

    public static void main(String[] args) {
        System.out.println(new Rectangle(2, 3).equals(new Rectangle(3, 2)));
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a * b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return ((Rectangle) o).area() == this.area();
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
