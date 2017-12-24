package hw3.task2;

import java.util.Scanner;

public class InputInt {
    public static int inputInt() {
        int i = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите целое число: ");

        if (!input.hasNextInt()) {
            System.out.println("Вы ввели не целое число. Повторите ввод:");
            inputInt();
        }
        return i = input.nextInt();
    }
}