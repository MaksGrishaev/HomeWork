package hw7.task4;

public class Tulip extends Flower {
    private static int count = 0;
    private static double cost = 2.5;

    public Tulip(String color) {
        super(color);
        count++;
    }

    public static double getCost() {
        return cost;
    }

    public static int getCount() {
        return count;
    }

    public static void setCost(double cost) {
        Tulip.cost = cost;
    }
}
