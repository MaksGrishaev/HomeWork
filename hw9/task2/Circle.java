package hw9.task2;

import java.util.Objects;

public class Circle extends Shape {
    private int xCenter;
    private int yCenter;
    private double radius;

    public Circle(int xCenter, int yCenter, double radius, String color) {
        super(color);
        this.xCenter = xCenter;
        this.yCenter = yCenter;
        this.radius = radius;
    }

    public int getxCenter() {
        return xCenter;
    }

    public int getyCenter() {
        return yCenter;
    }

    public double getRadius() {
        return radius;
    }

    public void setxCenter(int xCenter) {
        this.xCenter = xCenter;
    }

    public void setyCenter(int yCenter) {
        this.yCenter = yCenter;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return xCenter == circle.xCenter &&
                yCenter == circle.yCenter &&
                Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), xCenter, yCenter, radius);
    }

    public void draw() {
        System.out.println("Circle: draw()");
    }
}
