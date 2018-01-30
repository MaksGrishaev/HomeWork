package hw7.task5;

public class Horse extends Animal {
    private String voice;

    public Horse(String food, String location) {
        super(food, location);
        voice = "Иго - го";
    }

    public String getVoice() {
        return voice;
    }

    @Override
    public void makeNoise() {
        System.out.println("Horse say: " + getVoice());
    }
}
