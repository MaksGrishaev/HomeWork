package hw7.com.company;

import hw7.com.company.details.Engine;
import hw7.com.company.professions.Driver;
import hw7.com.company.vehicles.Car;
import hw7.com.company.vehicles.Lorry;
import hw7.com.company.vehicles.SportCar;

public class Road {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Ivanov I.P.", 40, 20);
        Driver driver2 = new Driver("Petrov P.P.", 60, 30);
        Driver driver3 = new Driver("Sidoeov S.M.", 22, 4);

        Car[] cars = new Car[3];
        cars[0] = new Car("Lada", "sedan", 2000, new Engine("BMW", 140),driver1);
        cars[1] = new Lorry("MAN","Autotruck", 10000, 15000,
                new Engine("MAN Diesel Turbo", 400), driver2);
        cars[2] = new SportCar("Ferrari","coupe", 1500, 350,new Engine("Boxer", 300), driver3);

        cars[0].printInfo();
        cars[1].printInfo();
        cars[2].printInfo();
    }
}
