package hw7.com.company.vehicles;

import hw7.com.company.details.Engine;
import hw7.com.company.professions.Driver;

public class SportCar extends Car {
    private int speedLimit;

    public SportCar(String carBrand, String carCaseType, int weight, int speedLimit, Engine engine, Driver driver) {
        super(carBrand, carCaseType, weight, engine, driver);
        this.speedLimit = speedLimit;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    @Override
    public void printInfo() {
        System.out.println("Автомобиль марки: " + getCarBrand());
        System.out.println("Тип кузова: " + getCarCaseType());
        System.out.println("Вес: " + getWeight());
        System.out.println("Предельная скорость: " + getSpeedLimit());
        System.out.println("Двигатель: " + getEngine().toString());
        System.out.println("Водитель: " + getDriver().toString());
    }
}
