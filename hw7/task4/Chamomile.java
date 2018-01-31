package hw7.task4;

public class Chamomile extends Flower {
    private static int count = 0;
    private static double cost = 1.5;

    public Chamomile(String color) {
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
        Chamomile.cost = cost;
    }
}
