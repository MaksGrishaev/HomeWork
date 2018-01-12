package hw5.task6;
/*
Изменить программу сортировки пузырьком:
        а) добавить возможность досрочного окончания сортировки;
        б) программа написана таким образом, что минимальный элемент "всплывает" в начало массива.
        Измените программу так чтобы минимальный элемент "всплывал" в конец массива
        (внутренний цикл for должен перебирать элементы не с конца, а с начала).
*/

import hw5.task5.ArrayMyUtils;

public class ArraySort2 {
    public static void main(String[] args) {
        int[] arrayInt = {4, 1, 0, 56, 34, 23, 34, 2, 4, 88, 89, 90};
        int[] oldArInt = new int[arrayInt.length];
        ArrayMyUtils.arrayIntCopy(arrayInt, oldArInt);
        System.out.print("\nИсходный массив:\t");
        ArrayMyUtils.arrayIntShow(oldArInt);
        System.out.println();

        ArrayMyUtils.arrayIntSortMaxMinVis(arrayInt);

        System.out.print("\nРезультат сортировки:\t\t");
        ArrayMyUtils.arrayIntShow(arrayInt);
    }
}
