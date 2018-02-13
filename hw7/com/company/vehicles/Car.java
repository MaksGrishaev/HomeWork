package hw7.com.company.vehicles;

import hw7.com.company.details.Engine;
import hw7.com.company.professions.Driver;

public class Car {
    private String carBrand;
    private String carCaseType;
    private int weight;
    private Engine engine;
    private Driver driver;

    public Car(String carBrand, String carCaseType, int weight, Engine engine, Driver driver) {
        this.carBrand = carBrand;
        this.carCaseType = carCaseType;
        this.weight = weight;
        this.engine = engine;
        this.driver = driver;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarCaseType() {
        return carCaseType;
    }

    public void setCarCaseType(String carCaseType) {
        this.carCaseType = carCaseType;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void printInfo() {
        System.out.println("Автомобиль марки: " + getCarBrand());
        System.out.println("Тип кузова: " + getCarCaseType());
        System.out.println("Вес: " + getWeight());
        System.out.println("Двигатель: " + engine.toString());
        System.out.println("Водитель: " + driver.toString());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
