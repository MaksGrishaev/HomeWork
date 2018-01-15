package hw6.task2;

public class MyPerson {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Nemo", 30);

        person1.move();
        person2.talk();
    }
}
