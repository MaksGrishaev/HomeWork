package hw6.task1;
/*Класс Phone. (Задание с урока)
+a) Создайте класс Phone, который содержит переменные number, model и weight.
+б) Создайте три экземпляра этого класса.
+в) Выведите на консоль значения их переменных.
+г) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
    Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона.
    Вызвать эти методы для каждого из объектов.
+д) Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
+е) Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
+ж) Добавить конструктор без параметров.
+з) Вызвать из конструктора с тремя параметрами конструктор с двумя.
+и) Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
+к) Создать метод sendMessage  с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
*/

import java.util.Scanner;

public class MyPhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("123456");
        Phone phone3 = new Phone("Alis", "777", "lenovo");

        phone1.showInfo();
        phone2.showInfo();
        phone3.showInfo();

        phone1.receiveCall(phone3.name);
        phone1.receiveCall(phone3.name, phone3.number);
        phone2.sendMessage(phone1.number, phone3.number);

    }

    public static class Phone {
        String name;
        String number;
        String model;
        int weight;


        Phone() {
            setName();
            setNumber();
            setModel();
            weight = 0;
        }

        Phone(String number) {
            this.number = number;
        }

        Phone(String name, String num) {
            this(num);
            this.name = name;
        }

        Phone(String name, String number, String model) {
            this(name, number);
            this.model = model;
        }

        Phone(String name, String num, String mod, int w) {
            this(name, num);
            this.model = mod;
            weight = w;
        }

        void setName() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите имя: ");
            name = sc.next();
        }

        void setModel() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите модель: ");
            model = sc.next();
        }

        void setNumber() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите номер: ");
            number = sc.next();
        }

        String getNumber() {
            return number;
        }

        void receiveCall(String inName) {
            System.out.println("MESSAGE from : " + this.name);
            System.out.println("\tЗвонит " + inName);
        }

        void receiveCall(String inName, String inNum) {
            System.out.println("MESSAGE from : " + this.name);
            System.out.print("\tЗвонит " + inName);
            System.out.println(", номер : " + inNum);
        }

        void sendMessage(String... outNum) {
            System.out.println("Отправляем сообщение с номера " + this.number + " номерам:");
            for (String tmp : outNum) {
                System.out.println("\t" + tmp);
            }
        }

        void showInfo() {
            System.out.println("----------------------");
            if (name != null) {
                System.out.print("-Имя: " + name);
            } else {
                System.out.print("-Имя: не указано");
            }
            if (getNumber() != null) {
                System.out.print("\n-\tНомер: " + getNumber());
            } else {
                System.out.print("\n-\tНомер: не указан");
            }
            if (model != null) {
                System.out.print("\n-\tМодель: " + model);
            } else {
                System.out.print("\n-\tМодель: не указана");
            }
            if (weight > 0) {
                System.out.print("\n-\tВес: " + weight);
            } else {
                System.out.print("\n-\tВес: не указан");
            }
            System.out.println("\n----------------------");
        }
    }
}
