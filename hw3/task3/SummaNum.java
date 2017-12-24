package hw3.task3;

import hw3.task2.InputInt;

public class SummaNum {
    public static void main(String[] args) {
        int var1 = InputInt.inputInt();
        int var2 = InputInt.inputInt();
        System.out.println("Cумма чисел " + var1 + " и " + var2 + " = " + summaInt(var1, var2));
    }

    public static int summaInt(int a, int b) {
        return a + b;
    }
}
