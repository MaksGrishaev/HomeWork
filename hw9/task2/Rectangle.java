package hw9.task2;

import java.util.Objects;

public class Rectangle extends Shape {
    private int xLUpperAng;
    private int yLUpperAng;
    private double length;
    private double width;

    public Rectangle(int xLUpperAng, int yLUpperAng,
                     double length, double width, String color) {
        super(color);
        this.xLUpperAng = xLUpperAng;
        this.yLUpperAng = yLUpperAng;
        this.length = length;
        this.width = width;
    }

    public int getxLUpperAng() {
        return xLUpperAng;
    }

    public int getyLUpperAng() {
        return yLUpperAng;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setxLUpperAng(int xLUpperAng) {
        this.xLUpperAng = xLUpperAng;
    }

    public void setyLUpperAng(int yLUpperAng) {
        this.yLUpperAng = yLUpperAng;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return xLUpperAng == rectangle.xLUpperAng &&
                yLUpperAng == rectangle.yLUpperAng &&
                Double.compare(rectangle.length, length) == 0 &&
                Double.compare(rectangle.width, width) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), xLUpperAng, yLUpperAng, length, width);
    }

    public void draw() {
        System.out.println("Rectangle: draw()");
    }
}
