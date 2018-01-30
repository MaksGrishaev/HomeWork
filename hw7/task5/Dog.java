package hw7.task5;

public class Dog extends Animal {
    private String voice;

    public Dog(String food, String location) {
        super(food, location);
        voice = "Гав - Гав";
    }

    public String getVoice() {
        return voice;
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog say: " + getVoice());
    }
}
