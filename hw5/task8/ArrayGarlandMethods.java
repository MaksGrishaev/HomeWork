package hw5.task8;

import java.util.Random;
import java.util.Scanner;

public class ArrayGarlandMethods {

    public static void garlandChoice(int[] garland) {
        Scanner sc = new Scanner(System.in);
        String choice = "a";
        System.out.print("режимы работы гирлянды:\n" +
                "\ta - инверсия\n" +
                "\tb - циклический сдвиг вправо\n" +
                "\tbb - циклический сдвиг вправо (System.arraycopy(...))\n" +
                "\tс - циклический сдвиг влево\n" +
                "\tсc - циклический сдвиг влево(System.arraycopy(...))\n" +
                "\tлюбой символ для выхода\n" +
                "Ваш выбор: ");
        choice = sc.next();
        int count;
        switch (choice) {
            case "a":
                count = inputInt();
                garlandBlinkInv(garland, count);
                garlandChoice(garland);
                break;
            case "b":
                count = inputInt();
                garlandBlinkRShift(garland, count);
                garlandChoice(garland);
                break;
            case "bb":
                count = inputInt();
                runningLightsCount(garland, count, true);
                garlandChoice(garland);
                break;
            case "c":
                count = inputInt();
                garlandBlinkLShift(garland, count);
                garlandChoice(garland);
                break;
            case "cc":
                count = inputInt();
                runningLightsCount(garland, count, false);
                garlandChoice(garland);
                break;
            default:
                System.out.println("Наигрались)");
                break;
        }
    }

    public static void garlandShow(int[] varArr) {
        for (int i = 0; i < varArr.length; i++) {
            System.out.print("__");
        }
        System.out.println();
        for (int i = 0; i < varArr.length; i++) {
            System.out.print(varArr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < varArr.length; i++) {
            System.out.print("\u00AF\u00AF");
        }
        System.out.println();
    }

    public static void generateBinGarland(int[] garland) {
        Random random = new Random();
        for (int i = 0; i < garland.length; i++) {
            garland[i] = (random.nextInt(100)) % 2;
        }
    }

    public static void garlandBlinkInv(int[] garland, int countBlink) {
        for (int i = 0; i < countBlink; i++) {
            garlandShow(garland);
            for (int j = 0; j < garland.length; j++) {
                garland[j] = (garland[j] + 1) % 2;
            }
        }
    }

    public static void garlandBlinkRShift(int[] garland, int countBlink) {
        garlandShow(garland);
        for (int i = 0; i < countBlink; i++) {
            garlandRShift(garland);
            garlandShow(garland);
        }
    }


    public static void garlandBlinkLShift(int[] garland, int countBlink) {
        garlandShow(garland);
        for (int i = 0; i < countBlink; i++) {
            garlandLShift(garland);
            garlandShow(garland);
        }
    }

    public static void garlandRShift(int[] garland) {
        int tmp = garland[garland.length - 1];
        for (int i = garland.length - 2; i > 0; i--) {
            garland[i + 1] = garland[i];
        }
        garland[0] = tmp;
    }

    public static void garlandLShift(int[] garland) {
        int tmp = garland[0];
        for (int i = 1; i < garland.length - 1; i++) {
            garland[i - 1] = garland[i];
        }
        garland[garland.length - 1] = tmp;
    }

    public static int inputInt() {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число повторений:");
        if (sc.hasNextInt()) {
            i = sc.nextInt();
            return i;
        } else {
            System.out.println("Введено не целое число");
            inputInt();
        }
        return 0;
    }

    public static void runningLightsCount(int[] garland, int count, boolean direction) {
        for (int i = 0; i < count; i++) {
            runningLights(garland, garland, direction);
            garlandShow(garland);
        }
    }

    public static void runningLights(int[] garland, int[] garlandNew, boolean direction) {
        if (direction) {
            garlandNew[0] = garland[garland.length - 1];
            System.arraycopy(garland, 0, garlandNew, 1, garland.length - 2);
        } else {
            garlandNew[garlandNew.length - 1] = garland[0];
            System.arraycopy(garland, 1, garlandNew, 0, garland.length - 2);
        }
    }
}
