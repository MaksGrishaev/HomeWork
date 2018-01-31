package hw9.task1;

public abstract class Fruit {
    protected double weight;
    protected String fruitName;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getFruitName() {
        return fruitName;
    }

    public abstract double getCost();

    public void printManufacturerInfo(){System.out.print("Made in Ukraine");}
}
