package hw6.task2;
/*Создать класс Person, который содержит:
    a) поля fullName, age.
    б) методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
    в) Добавьте два конструктора  - Person() и Person(fullName, age).
    Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
*/

import hw6.task2.Person;

public class MyPerson {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Nemo", 30);

        person1.move();
        person2.talk();
    }
}
