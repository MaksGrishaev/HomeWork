package hw5.task2;
/*
Создать массив типа String размером 3х6. И записать в него значения:
a1  a2  a3  a4  a5  a6
b1  b2  b3  b4  b5  b6
c1  c2   c3  c4  c5  c6
И распечатать.(Задание с урока).
*/

public class ArrayString2 {
    public static void main(String[] args) {
        String[][] masStr = new String[3][6];
        char varChar = 'a';
        for (int i = 0; i < masStr.length; i++) {
            for (int j = 0; j < masStr[i].length; j++) {
                masStr[i][j] = varChar + Integer.toString(j + 1);
            }
            varChar++;
        }
        show2DArrayStr(masStr);
    }

    public static void show2DArrayStr(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (String str : array[i]) {
                System.out.print(str + " ");
            }
            System.out.println();
        }

    }

}
