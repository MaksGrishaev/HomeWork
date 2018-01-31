package hw9.task1;

public class Pear extends Fruit{
    private static double price = 5.5;
    private static int count = 0;
    private static double commonWeight = 0;

    public Pear(double weight){
        super(weight);
        fruitName = "Pear";
        commonWeight += weight;
        count++;
    }

    public static double getPrice() {
        return price;
    }

    public static int getCount() {
        return count;
    }

    public static void setPrice(double price) {
        Pear.price = price;
    }

    public static double getCommonWeight() {
        return commonWeight;
    }

    @Override
    public double getCost() {
        return price * getWeight();
    }
}
