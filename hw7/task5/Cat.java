package hw7.task5;

public class Cat extends Animal {
    private String voice;

    public Cat(String food, String location) {
        super(food, location);
        voice = "Мяу - Мяу";
    }

    public String getVoice() {
        return voice;
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat say: " + getVoice());
    }
}
