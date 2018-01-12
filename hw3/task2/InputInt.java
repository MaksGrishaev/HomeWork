package hw3.task2;

import java.util.Scanner;

public class InputInt {
    public static int inputInt() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        if (!input.hasNextInt()) {
            System.out.println("Вы ввели не целое число. Повторите ввод:");
            inputInt();
        }
        return input.nextInt();
    }
}