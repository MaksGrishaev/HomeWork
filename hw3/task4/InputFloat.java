package hw3.task4;

import java.util.Scanner;

public class InputFloat {
    public static float inputFloat() {
        float i = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите вещественное число: ");

        if (!input.hasNextFloat()) {
            System.out.println("Вы ввели не вещественное число. Повторите ввод:");
            inputFloat();
        }
        return i = input.nextFloat();
    }
}
