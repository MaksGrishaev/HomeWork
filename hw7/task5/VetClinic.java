package hw7.task5;

public class VetClinic {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("meet", "booth");
        animals[1] = new Cat("pate", "home");
        animals[2] = new Horse("straw", "stable");

        Vet doc = new Vet();
        animals[0].makeNoise();
        animals[1].makeNoise();
        animals[2].makeNoise();
        doc.treatAnimal(animals[0]);
        doc.treatAnimal(animals[1]);
        doc.treatAnimal(animals[2]);
    }
}
