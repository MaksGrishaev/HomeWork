package hw7.com.company.vehicles;

import hw7.com.company.details.Engine;
import hw7.com.company.professions.Driver;

public class Lorry extends Car {
    private int capacity;

    public Lorry(String carBrand, String carCaseType, int weight, int capacity, Engine engine, Driver driver) {
        super(carBrand, carCaseType, weight, engine, driver);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void printInfo() {
        System.out.println("Автомобиль марки: " + getCarBrand());
        System.out.println("Тип кузова: " + getCarCaseType());
        System.out.println("Вес: " + getWeight());
        System.out.println("Грузоподъемность: " + getCapacity());
        System.out.println("Двигатель: " + getEngine().toString());
        System.out.println("Водитель: " + getDriver().toString());
    }
}
