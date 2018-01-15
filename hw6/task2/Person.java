package hw6.task2;

public class Person {
    private String fullName;
    private int age;

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    void move() {
        System.out.println(fullName + " идет...");
    }

    void talk() {
        System.out.println(fullName + " говорит...");
    }
}