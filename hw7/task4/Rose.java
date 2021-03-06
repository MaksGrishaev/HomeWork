package hw7.task4;

public class Rose extends Flower {
    private static int count = 0;
    private static double cost = 3.5;

    public Rose(String color) {
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
        Rose.cost = cost;
    }
}
