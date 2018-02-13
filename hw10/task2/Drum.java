package hw10.task2;

public class Drum implements Instrument {
    private int drumSize;

    public Drum(int drumSize) {
        this.drumSize = drumSize;
    }

    public int getDrumSize() {
        return drumSize;
    }

    public void setDrumSize(int drumSize) {
        this.drumSize = drumSize;
    }

    @Override
    public void play() {
        System.out.printf("Играет барабан, размер: %d\n", getDrumSize());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
