package hw9.task1;

public class Apricot extends Fruit{
    private static double price = 7.5;
    private static int count = 0;
    private static double commonWeight = 0;


    public Apricot(double weight){
        super(weight);
        fruitName = "Apricot";
        commonWeight += weight;
        count++;
    }

    public double getPrice() {
        return price;
    }

    public static int getCount() {
        return count;
    }

    public static void setPrice(double price) {
        Apricot.price = price;
    }

    public static double getCommonWeight() {
       return commonWeight;
    }

    @Override
    public double getCost() {
        return price * getWeight();
    }
}
