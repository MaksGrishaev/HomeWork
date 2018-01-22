package hw6.task1;

import java.util.Scanner;

public class MyPhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("123456");
        Phone phone3 = new Phone("Alis", "777", "lenovo");
        Phone phone4 = new Phone(inputDataString("имя"), inputDataString("номер"), inputDataString("модель"), 111);
        phone1.showInfo();
        phone2.showInfo();
        phone3.showInfo();
        phone4.showInfo();
        phone3.receiveCall(phone2.name);
        phone2.receiveCall(phone3.name, phone3.number);
        phone4.sendMessage(phone2.number, phone3.number);
    }

    public static class Phone {
        private String name;
        private String number;
        private String model;
        private int weight;

        public Phone() {
            name = null;
            model = null;
            number = null;
            weight = 0;
        }

        public Phone(String number) {
            this.number = number;
        }

        public Phone(String name, String num) {
            this(num);
            this.name = name;
        }

        public Phone(String name, String number, String model) {
            this(name, number);
            this.model = model;
        }

        public Phone(String name, String num, String mod, int w) {
            this(name, num);
            this.model = mod;
            weight = w;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getNumber() {
            return number;
        }

        public void receiveCall(String inName) {
            System.out.println("MESSAGE from : " + this.name);
            System.out.println("\tЗвонит " + inName);
        }

        public void receiveCall(String inName, String inNum) {
            System.out.println("MESSAGE from : " + this.name);
            System.out.print("\tЗвонит " + inName);
            System.out.println(", номер : " + inNum);
        }

        public void sendMessage(String... outNum) {
            System.out.println("Отправляем сообщение с номера " + this.number + " номерам:");
            for (String tmp : outNum) {
                System.out.println("\t" + tmp);
            }
        }

        public void showInfo() {
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

    public static String inputDataString(String infoType) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите " + infoType + ": ");
        return sc.next();
    }
}
