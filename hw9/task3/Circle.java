package hw9.task3;

public class Circle {
    private static final double PI = 3.14;
    private double radiuse;

    public Circle(double radiuse) {
        this.radiuse = radiuse;
    }

    public double getRadiuse() {
        return radiuse;
    }

    public void setRadiuse(double radiuse) {
        this.radiuse = radiuse;
    }

    public double squareCircle() {
        return PI * radiuse * radiuse;
    }

    public double lengthCircle() {
        return 2 * PI * radiuse;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radiuse=" + radiuse +
                '}';
    }
}
