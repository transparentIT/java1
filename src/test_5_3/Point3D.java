package test_5_3;

public class Point3D extends Point2D {
    private int z;
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "" + super.toString() + "," + z;
    }
}
/*
наследуется от Point2D
содержит приватную переменную int z;
конструктор с параметрами int x, int y, int z,
вызывающий конструктор родителя и устанавливающий соответствующую свою переменную
переопределение функции toString(),
которая должна возвращать результат в формате х,у,z, например 23,12,37 для этого вызывать
функцию toString() родителя внутри себя
 */