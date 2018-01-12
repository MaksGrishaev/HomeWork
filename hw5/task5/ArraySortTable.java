package hw5.task5;
/*
Создать табличку для любого массива, в котором последовательно прописать значения i, j,
массива для  каждого цикла алгоритма сортировки пузырька. Используйте debugger.
*/

public class ArraySortTable {
    public static void main(String[] args) {
        int[] arrayInt = {4, 1, 0, 56, 34, 23, 34, 2, 4, 88, 89, 90};
        int[] oldArInt = new int[arrayInt.length];
        ArrayMyUtils.arrayIntCopy(arrayInt, oldArInt);

        System.out.print("\nИсходный массив:\t");
        ArrayMyUtils.arrayIntShow(oldArInt);
        System.out.println();

        ArrayMyUtils.arrayIntSortMinMaxVis(arrayInt);

        System.out.print("\nРезультат сортировки:\t\t");
        ArrayMyUtils.arrayIntShow(arrayInt);
    }
}
