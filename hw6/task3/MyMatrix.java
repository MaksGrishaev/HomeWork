package hw6.task3;
/*Создать класс "Матрица". Класс должен иметь следующие поля:
+    1) двумерный массив вещественных чисел;
+    2) количество строк и столбцов в матрице.

    Класс должен иметь следующие методы:
    1) сложение с другой матрицей;
    2) умножение на число;
    3) вывод на печать;
    4) умножение матриц - по желанию.
*/

import hw6.task3.Matrix;

public class MyMatrix {
    public static void main(String[] args) {
        Matrix matr1 = new Matrix(3, 5, false);
        Matrix matr11 = new Matrix(3, 5, false);
        Matrix matr2 = new Matrix(5, 4, false);

        System.out.println("Матрица (А):");
        matr1.showMatrix();
        System.out.println("Матрица (AA):");
        matr11.showMatrix();
        System.out.println("Матрица (A) + (AA):");
        matr1.addMatrix(matr11);
        matr1.showMatrix();

        System.out.println("------------------");
        System.out.println();
        System.out.println("Матрица (A) * 8:");
        matr1.multMatrix(8);
        matr1.showMatrix();

        System.out.println("------------------");
        System.out.println();
        System.out.println("Матрица (AA) * (В):");
        Matrix matrixC = matr11.multMatrix(matr2);
        matrixC.showMatrix();
    }
}