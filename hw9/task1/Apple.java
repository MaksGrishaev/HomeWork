package hw9.task1;

public class Apple extends Fruit{
    private static double price = 5.5;
    private static int count = 0;
    private static double commonWeight = 0;

    Apple(double weight){
        super(weight);
        fruitName = "Apple";
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
        Apple.price = price;
    }

    public static double getCommonWeight() {
        return commonWeight;
    }

    public double getCost() {
        return price * getWeight();
    }
}
