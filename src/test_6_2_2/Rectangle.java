package test_6_2_2;

public class Rectangle {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a * b;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2, 2);
        Rectangle r2 = new Rectangle(3, 3);
        System.out.println(r1.compareTo(r2));
    }

    public int compareTo(Rectangle anRectangle) {
        int k = 0;
        if (a * b > anRectangle.a * anRectangle.b) {
            k = 1;
        } else if (a * b == anRectangle.a * anRectangle.b) {
            k = 0;
        } else if (a * b < anRectangle.a * anRectangle.b) {
            k = -1;
        }
        return k;
    }
}
