package hw10.task2;

public class Guitar implements Instrument {
    private int amountStrings;

    public Guitar(int amountStrings) {
        this.amountStrings = amountStrings;
    }

    public int getAmountStrings() {
        return amountStrings;
    }

    public void setAmountStrings(int amountStrings) {
        this.amountStrings = amountStrings;
    }

    @Override
    public void play() {
        System.out.printf("Играет гитара:%d струн\n", getAmountStrings());
    }
}
