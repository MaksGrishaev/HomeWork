package hw5.task7;
/*
Создать двухмерный массив 5х8 и инициализировать его с помощью блока для инициализации.
Найти максимальное и минимальное значение в каждой "строке" и записать эти значения в двухмерный массив 5х2.
Распечатать оба массива.
*/

public class Array2DMinMax {
    public static void main(String[] args) {
        int[][] intArr = {{55, 33, 21, 4456, 324, 43, 234, 7},
                {0, 34, 1231, 345, 65, 78, 8, 5},
                {66, 44, 89, 45, 23, 78, 0, 98},
                {2, 22, 222, 2222, 22222, 222222, 33, 2233},
                {88, 55, 433, 213, 4554, 7678, 890, 98}};
        int[][] arrMinMax = new int[5][2];

        for (int i = 0; i < 5; i++) {
            arrMinMax[i][0] = ArrayMinMax.arrayMin(intArr[i]);
            arrMinMax[i][1] = ArrayMinMax.arrayMax(intArr[i]);
        }

        System.out.println("Исходный массив размерностью " + intArr.length + "X" + intArr[0].length + ":");
        ArrayMinMax.array2DShow(intArr);
        System.out.println("\nmin/max");
        ArrayMinMax.array2DShow(arrMinMax);
    }

}
