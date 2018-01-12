package hw5.task9;
/*
1) Сделать задание 14 для алгоритма сортировки выбора.
2) Изменить сортировку выбором - исключите обмен значений,
 если найденный минимальный элемент уже находится на своем месте.
*/


public class SelectionSort {
    public static void main(String[] args) {
        int[] intArr = {100, 4, 1, 0, 56, 34, 23, 34, 2, 4, 88, 89, 90};

        SelectionSortMethods.arrayIntSortMinMaxVis(intArr);
        SelectionSortMethods.arrayIntSortMaxMinVis(intArr);

    }
}
