package hw7.task4;

public class Flower {
    private String color;
    private static int countFlowers = 0;

    public Flower(String color) {
        this.color = color;
        countFlowers++;
    }

    public String getColor() {
        return color;
    }

    public static int getCountFlowers() {
        return countFlowers;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
