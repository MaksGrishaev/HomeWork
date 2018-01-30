package hw7.task5;

public class VetClinic {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("meet", "booth");
        animals[1] = new Cat("pate", "home");
        animals[2] = new Horse("straw", "stable");

        Vet doc = new Vet();
        for (Animal animal: animals){
            animal.makeNoise();
            doc.treatAnimal(animal);
        }
    }
}
