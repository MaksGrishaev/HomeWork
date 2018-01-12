package hw6.task3;

import java.util.Scanner;

public class Matrix {
    private double[][] array;
    private int row;
    private int column;

    Matrix() {
        int n = 2;
        setRow(n);
        setColumn(n);
        nullMatrix(n, n);
    }

    Matrix(boolean manual) {
        this();
        if (manual == true) {
            System.out.print("Количество строк (по умолчанию 2): ");
            setRow(inputInt());
            System.out.print("Количество столбцов (по умолчанию 2): ");
            setColumn(inputInt());
            generateMatrix(row, column);
        }
    }

    Matrix(int row, int column, boolean zero) {
        setRow(row);
        setColumn(column);
        if (zero == true) {
            nullMatrix(row, column);
        } else {
            generateMatrix(row, column);
        }
    }

    private void setRow(int row) {
        this.row = row;
    }

    private void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    private int inputInt() {
        Scanner sc = new Scanner(System.in);
        int n;
        if (!sc.hasNextInt()) {
            n = 2;
        } else {
            n = sc.nextInt();
        }
        return n;
    }

    private void generateMatrix(int rows, int columns) {
        array = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = Math.random() * 5;
            }
        }
    }

    private void nullMatrix(int rows, int columns) {
        array = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = 0;
            }
        }
    }

    public void showMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean addMatrix(Matrix matrix2) {
        if (this.row != matrix2.row && this.column != matrix2.column)
            return false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                this.array[i][j] += matrix2.array[i][j];
            }
        }
        return true;
    }

    void multMatrix(int num) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                this.array[i][j] *= num;
            }
        }
    }

    Matrix multMatrix(Matrix matrix2) {
        int newRow = this.row;
        int newColumn = matrix2.column;
        Matrix result = new Matrix(newRow, newColumn, true);
        double sum;
        for (int i = 0; i < newRow; i++) {
            for (int j = 0; j < newColumn; j++) {
                sum = 0;
                for (int k = 0; k < this.column; k++) {
                    sum += this.array[i][k] + matrix2.array[k][j];
                }
                result.array[i][j] = sum;
            }
        }
        return result;
    }
}

