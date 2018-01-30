package hw9.task1;

public abstract class Fruit {
    protected String fruitName;
    private double weight;
    private double price;

    public Fruit(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public abstract double getPrice();

    public void printManufacturerInfo(){System.out.print("Made in Ukraine");}
}
