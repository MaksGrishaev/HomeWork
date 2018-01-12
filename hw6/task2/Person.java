package hw6.task2;

import java.util.Scanner;

public class Person {
    String fullName;
    int age;

    Person() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя: ");
        this.fullName = sc.next();
        System.out.print("Введите возраст(целое число): ");
        if (!sc.hasNextInt()) {
            this.age = 0;
        } else {
            this.age = sc.nextInt();
        }
    }

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