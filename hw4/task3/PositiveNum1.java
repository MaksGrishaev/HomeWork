package hw4.task3;

import hw3.task2.InputInt;

public class PositiveNum1 {
    public static void main(String[] args) {
        int varInt = InputInt.inputInt();

        if (varInt >= 0 && varInt <= 10) {
            System.out.println("Число " + varInt + " положительное, меньше 10");
        } else {
            System.out.println("Число " + varInt + " отрицательное или больше 10");
        }
    }
}
