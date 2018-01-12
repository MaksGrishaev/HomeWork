package hw5.task3;
/*
Создать двумерный массив типа char размером 4х2. И записать туда значения с помощью блока для инициализации.
Распечатать значения массива с помощью метода Arrays.deepToString(m). (Задание с урока).
*/
import java.util.Arrays;

public class Array2DChar {
    public static void main(String[] args) {
        char[][] masChar = {{'a', 'b'}, {'c', 'd'}, {'e', 'f'}, {'g', 'h'}};
        System.out.println(Arrays.deepToString(masChar));
    }
}

