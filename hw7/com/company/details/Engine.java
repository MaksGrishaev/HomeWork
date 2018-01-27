package hw7.com.company.details;

public class Engine {
    private int power;
    private String engineBrand;

    public Engine(String engineBrand, int power) {
        this.engineBrand = engineBrand;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getEngineBrand() {
        return engineBrand;
    }

    public void setEngineBrand(String engineBrand) {
        this.engineBrand = engineBrand;
    }

    @Override
    public String toString() {
        return "\tПроизводитель: " + engineBrand +
                ".\n\t\t\tМощность: " + power + ".";
    }
}
