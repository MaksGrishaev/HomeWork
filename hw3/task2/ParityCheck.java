package hw3.task2;

import hw3.task2.InputInt;

public class ParityCheck {
    public static void main(String[] args) {
        int i = InputInt.inputInt();
        if (parityInt(i))
            System.out.println("Число " + i + " четное");
        else
            System.out.println("Число " + i + " нечетное");
    }

    public static boolean parityInt(int varInt) {
        return (varInt % 2 == 0) ? true : false;
    }
}
