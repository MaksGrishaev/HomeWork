package hw4.task8;

import hw3.task2.InputInt;

public class garlandSw {
    public static void main(String[] args) {
        int count = 8;
        int garlandInt = 2048 + (int) (Math.random() * 16384);
        System.out.println("Задающее число: " + garlandInt);
        System.out.println("Гирлянда: \n" + Integer.toBinaryString(garlandInt));

        System.out.println("Два режима работы 1 или 2. Ваш выбор :");
        int choice = InputInt.inputInt();
        switch (choice) {
            case 1:
                runningLights1(count, garlandInt);
                break;
            case 2:
                runningLights2(count, garlandInt);
                break;
            default:
                System.out.println("Ошибочный ввод");
                break;
        }
    }

    public static void runningLights1(int count, int base) {
        int len = Integer.toBinaryString(base).length();
        for (int i = 0; i < count; i++) {
            printLights(base);
            printLights(~base);

        }
    }

    public static void runningLights2(int count, int base) {
        int buf;
        for (int i = 0; i < count; i++) {
            buf = base << 2;
            printLights(buf);
            base = buf;
        }
    }

    public static void printLights(int base) {
        for (int j = 0; j < 32 - (Integer.toBinaryString(base).length()); j++)
            System.out.print(0);
        System.out.println(Integer.toBinaryString(base));
    }
}
