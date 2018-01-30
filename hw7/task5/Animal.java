package hw7.task5;

public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Animal: makeNoise()");
    }

    public void eat() {
        System.out.println("Animal: eatting food, " + getFood());
    }

    public void sleep() {
        System.out.println("Animal: sleeping in location, " + getLocation());
    }
}
