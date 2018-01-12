package hw5.task4;
/*
Добавить в программу ArrayInverterTest2 еще один тестовый массив. Делаем дебаг и смотрим как работает.
(Задание с урока).
*/

import java.util.Arrays;

public class ArrayInverterTest2 {
    public static void main(String[] args) {
        testInvert(new int[]{});
        testInvert(new int[]{0});
        testInvert(new int[]{0, 1});
        testInvert(new int[]{0, 1, 2, 3, 4});
        testInvert(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0});

    }

    private static void testInvert(int[] array) {
        System.out.print(Arrays.toString(array) + " => ");
        invert(array);
        System.out.println(Arrays.toString(array));
    }

    public static void invert(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
    }
}

