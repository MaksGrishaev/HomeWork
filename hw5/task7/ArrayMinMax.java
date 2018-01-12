package hw5.task7;

public class ArrayMinMax {
    public static void arrayIntShow(int[] varArr) {
        for (int i = 0; i < varArr.length; i++) {
            System.out.print(varArr[i] + " ");
        }
    }

    public static void array2DShow(int[][] varArr) {
        for (int i = 0; i < varArr.length; i++) {
            arrayIntShow(varArr[i]);
            System.out.println();
        }
    }

    public static int arrayMin(int[] varArr) {
        int min = varArr[0];
        for (int i = 1; i < varArr.length; i++) {
            if (min > varArr[i]) {
                min = varArr[i];
            }
        }
        return min;
    }

    public static int arrayMax(int[] varArr) {
        int max = varArr[0];
        for (int i = 1; i < varArr.length; i++) {
            if (max < varArr[i]) {
                max = varArr[i];
            }
        }
        return max;
    }
}
