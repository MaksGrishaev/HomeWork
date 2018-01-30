package hw7.task5;

public class Vet {
    public void treatAnimal(Animal animal) {
        System.out.println("Vet: Animal-food: " + animal.getFood());
        System.out.println("Vet: Animal-location: " + animal.getLocation());
    }
}
