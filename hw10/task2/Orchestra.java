package hw10.task2;

public class Orchestra {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Guitar(6);
        instruments[1] = new Drum(3);
        instruments[2] = new Trumpet(7);

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
