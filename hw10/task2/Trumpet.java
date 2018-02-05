package hw10.task2;

public class Trumpet implements Instrument {
    private double diametr;

    public Trumpet(double diametr) {
        this.diametr = diametr;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    @Override
    public void play() {
        System.out.printf("Играет труба, диаметр: %.1f\n", getDiametr());
    }
}
